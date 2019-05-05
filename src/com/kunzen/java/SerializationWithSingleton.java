package com.kunzen.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationWithSingleton implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1744713455576557342L;
private SerializationWithSingleton(){
		
	}

private static class SingletonHelper {
	private static final SerializationWithSingleton INSTANCE = new SerializationWithSingleton();
}

public static SerializationWithSingleton getInstance(){
	return SingletonHelper.INSTANCE;
}

/**
 * 
 * @return
 * if this method is removed the singleton pattern will break after deserialization 
 */
protected Object readResolve(){
	return getInstance();
}

public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	SerializationWithSingleton instOne = SerializationWithSingleton.getInstance();
	
	//serialize from object to file
	ObjectOutput obOut = new ObjectOutputStream(new FileOutputStream("SerializationWithSingleton.ser"));
	obOut.writeObject(instOne);
	obOut.close();
	
	//deserialize from file to object
	ObjectInput obIn = new ObjectInputStream( new FileInputStream("SerializationWithSingleton.ser"));
	SerializationWithSingleton instTwo = (SerializationWithSingleton) obIn.readObject();
	obIn.close();
	
	/**output of the 2 instances on deserialization with readResolve 
	 * 
	 */
	System.out.println("instOne:"+instOne.hashCode());
	System.out.println("instTwo:"+instTwo.hashCode());
}
}
