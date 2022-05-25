package com.topics.exceptionHandling;

public class Demothrow {
        String content ;
        public void driving(String c) {
            this.content=c;
            if (content.isEmpty())
            {
                throw new NullPointerException("content is empty");
            }
            else {
                System.out.println("content=="+content);
            }
        }
        public static void main(String[] args) {
            Demothrow dt=new Demothrow();
            dt.driving("fg");
        }
    }

