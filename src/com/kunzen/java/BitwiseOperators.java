package com.kunzen.java;
public class BitwiseOperators { 
    public static void main(String[] args) 
    { 
        //Initial values 
        int a = 5; 
        int b = 7; 
  
        // bitwise and 
        // 0101 & 0111=0101 = 5 
        System.out.println("a&b = " + (a & b)); 
  
        // bitwise or 
        // 0101 | 0111=0111 = 7 
        System.out.println("a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 = 2 
        System.out.println("a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
        // will give 2's complement of 1010 = -6 
        System.out.println("~a = " + ~a); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("a= " + a); 
        
        /**
         * 1’s complement of a binary number is another binary number obtained by toggling all bits in it, i.e., transforming the 0 bit to 1 and the 1 bit to 0.
         */
        System.out.println("1's complement of a(5) =" +~a);
        
        /**
         * 2’s complement of a binary number is 1 added to the 1’s complement of the binary number.
         * to change the sign of a number from positive to negative and vice versa we'v to use 2's complement of a number.Ex -10 is 2's complement of 10
         */
        int towcomp= ~a+1;
        System.out.println("2's complement of a(5) =" +towcomp);
        
        /*
         * shift operators
         */
        
         a = 5; 
         b = -10; 
  
        // left shift operator 
        // 0000 0101<<2 =0001 0100(20) 
        // similar to 5*(2^2) 
        System.out.println("a<<2 = " + (a << 2)); 
  
        // right shift operator 
        // 0000 0101 >> 2 =0000 0001(1) 
        // similar to 5/(2^2) 
        System.out.println("b>>2 = " + (b >> 2)); 
  
        // unsigned right shift operator, there is not corresponding unsigned left shift operator(<<<)
        System.out.println("b>>>2 = " + (b >>> 2)); 
    } 
} 
