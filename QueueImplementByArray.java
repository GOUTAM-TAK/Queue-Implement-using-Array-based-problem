/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the simple queue using array.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Show the queue
b. Store the data in the queue
c. Access the data from the queue
d. Check how many elements are there in the queue.
e. Check to see if the queue is full?
f. Check to see if queue is empty.
 */

package core;

import java.util.Arrays;

public class QueueImplementByArray<T> {

	private int front;
	private int rear;
	private T arr[];
	
	public QueueImplementByArray(int size,T[] arr) {
		this.arr=arr;
		this.front=this.rear=-1;
		
	}
	public boolean isFull() {
		return rear==arr.length-1;
	}
	public void enqueue(T element) {
		if(isFull()) {
			throw new RuntimeException("queue is full!!!");
		}
	if(front<0) {
		front++;
		
	}
	arr[++rear]=element;
	}
	public T peek() {
		return arr[rear];
	}
	
	public T dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("queue already empty");
		}
		if(front==rear) {
			T ele = arr[front];
			front=rear=-1;
			return ele;
		}
		return arr[front--];
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return rear==-1&&front==-1;
	}
	public void display() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is emtpy!!!");
		}
		for(int i=0; i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int totalElementsInQueue() {
		if(isEmpty()) {
			return 0;
		}
		
		return rear-front+1;
	}
	
}
