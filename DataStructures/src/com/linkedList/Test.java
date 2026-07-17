package com.linkedList;

class LL 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
	}
		
}
public class Test{
	public static void main(String[] args) {
		LL list=new LL();
		list.printList();
		list.addFirst(333);
		list.addFirst(222);
		list.addFirst(111);
	}
}
