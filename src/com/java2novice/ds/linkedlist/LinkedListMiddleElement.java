package com.java2novice.ds.linkedlist;
//Program: Identify middle element of a Linked List
public class LinkedListMiddleElement {
	
	static class Node{
		int data;
		Node next;
		Node(int tmp){
			this.data=tmp;
		}
	}
	//Scenario 1
    static void findMiddleElementV1(Node head) {
        /**
         * In this method, first we get the element count by traversing through the linked list.
         * Then we identify middle element index by count.
         * Then traverse through linked list nodes based on count.
         */
         
        int count = 0;
        Node countNode = head;
        while(countNode != null) {
            countNode = countNode.next;
            count++;
        }
        count = count/2;
        while(head != null) {
            head = head.next;
            count--;
            if(count == 0) {
                System.out.println("Middle Element: " + head.data);
                return;
            }
        }
    }
    //Scenario 2
    static void findMiddleElementV2(Node head) {
    	 
        /**
         * In this approach, we will have two node references. 
         * First node, we increment by two steps
         * Second node, we increment ny one step.
         * At the end we get the middle element ny second node.
         */
        Node singIncNode = head;
        Node doubIncNode = head;
        if(head == null) {
            System.out.println("The haed node is null, no elements in the linked list");
        }
 
        while(doubIncNode != null && doubIncNode.next != null) {
            doubIncNode = doubIncNode.next.next;
            singIncNode = singIncNode.next;
        }
        System.out.println("Middle Element: "+ singIncNode.data);
    }
 
	public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(29);
        Node n3 = new Node(20);
        Node n4 = new Node(25);
        Node n5 = new Node(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        findMiddleElementV2(n1);
	}

}
