package com.topics.exceptionHandling;

    public class ExcepDemo {
        public static void main(String[] args) {
// TODO Auto-generated method stub
            int i=5;
            int j=0;
            try {

                System.out.println(i/j);
            }
            catch(ArithmeticException ae) {
                System.out.println("result = "+i*j);
                //System.out.println("wrong input");
            }
            System.out.println("statement after division");
        }

    }

