package com.topics.exceptionHandling;

class Test extends Exception{
    public static void main(String args[]) {
   Test e = new Test();
   e.main();
    }
    public void main() {
        try {
            throw new Test();
        } catch (Test t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}