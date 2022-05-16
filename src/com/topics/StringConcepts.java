package com.topics;

public class StringConcepts {

        public static void main(String args[]){
//#1) Length
            String str = "Saket Saurav";
            System.out.println(str.length());

//#2) Concatenation
            String str1 = "Software";
            String str2 = "Testing";
            System.out.println(str1 + str2);
            System.out.println(str1.concat(str2));

//#3) String to CharArray()
  //          This method is used to convert all the characters of a string into a Character Array. This is widely used in the String manipulation programs.



                    String stri = "Saket";
                    char[] chars = stri.toCharArray();
                    System.out.println(chars);
                    for (int i= 0; i< chars.length; i++) {
                        System.out.println(chars[i]);
                    }

                    //#4) String charAt()

            String strin = "java string API";
            System.out.println(strin.charAt(0));
            System.out.println(strin.charAt(1));
            System.out.println(strin.charAt(2));
            System.out.println(strin.charAt(3));
            System.out.println(strin.charAt(6));

          //  #5) Java String compareTo()

            String stri1 = "Zeus";
            String stri2 = "Chinese";
            String stri3 = "American";
            String stri4 = "Indian";

            System.out.println(stri1.compareTo(stri2));
            //C comes 23 positions before Z, so it will give you 23
            System.out.println(stri3.compareTo(stri4));
            // I comes 8 positions after A, so it will give you -8

            //#6) String contains()
            String string = "Softwaretestinghelp";
            String string1 = "testing";
            String string2 = "blog";
            System.out.println("testing is a part of Softwaretestinghelp: " + string.contains(string1));
            System.out.println("blog is a part of Softwaretestinghelp: " + string.contains(string2));

            //#7) Java String split()
            String string4 = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
            String[] split = string4.split("xyz");

            for (String obj: split) {
                System.out.println(obj);
            }
                }

            }


