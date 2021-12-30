package com.bridgelabz.linkedlist;
public class stackandQueue{
    public static void main(String[] args)
    {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        obj.push(56);
        obj.push(30);
        obj.push(70);
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
        obj.pop();
        obj.pop();
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}

