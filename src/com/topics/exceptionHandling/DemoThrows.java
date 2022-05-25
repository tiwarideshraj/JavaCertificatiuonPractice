package com.topics.exceptionHandling;

public class DemoThrows {
    int i=2,j=0;
    public void checkmethod () throws ArithmeticException{
        System.out.println(i/j);
    }
    public static void main(String[] args) {

        DemoThrows d =new DemoThrows();
        try {
            d.checkmethod();
        }
        catch (ArithmeticException ae) {
            ae.printStackTrace();
        }

    }
}
