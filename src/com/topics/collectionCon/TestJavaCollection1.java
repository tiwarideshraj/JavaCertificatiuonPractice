package com.topics.collectionCon;

import java.util.*;

public class TestJavaCollection1 {

    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("deshraj");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        System.out.println();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        Iterator<String> itr1=al.iterator();
        System.out.println();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr2=v.iterator();
        System.out.println();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr4=stack.iterator();
        System.out.println();
        while(itr4.hasNext()){
            System.out.println(itr4.next());
        }

        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println();
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr5=queue.iterator();
        while(itr5.hasNext()){
            System.out.println(itr5.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr6=queue.iterator();
        while(itr6.hasNext()){
            System.out.println(itr6.next());
        }

        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
//Traversing elements
        for (String str7 : deque) {
            System.out.println(str7);
        }

        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        Iterator<String> itr8=set.iterator();
        while(itr8.hasNext()){
            System.out.println(itr8.next());
        }

        LinkedHashSet<String> set1=new LinkedHashSet<String>();
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Ravi");
        set1.add("Ajay");
        Iterator<String> itr9=set1.iterator();
        while(itr9.hasNext()){
            System.out.println(itr9.next());
        }

        //Creating and adding elements
        TreeSet<String> set2=new TreeSet<String>();
        set2.add("Ravi");
        set2.add("Vijay");
        set2.add("Ravi");
        set2.add("Ajay");
//traversing elements
        Iterator<String> itra=set2.iterator();
        while(itra.hasNext()){
            System.out.println(itra.next());
        }
    }
}
