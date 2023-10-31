package tester;

import java.util.Scanner;

import core.QueueImplementByArray;

public class QueueTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("enter how many elements you store into queue : ");
			int size = sc.nextInt();
			Double[] arr = new Double[size];
			QueueImplementByArray<Double>queue = new QueueImplementByArray<>(size,arr);
			boolean exit=false;
			while(!exit) {
				System.out.println("Menu driven : \n"
						+ "1) Show the queue\r\n"
						+ "2) Store the data in the queue\r\n"
						+ "3) Access the data from the queue\r\n"
						+ "4) Check how many elements are there in the queue.\r\n"
						+ "5) Check to see if the queue is full?\r\n"
						+ "6) Check to see if queue is empty\n"
						+ "0)Exit");
				try {
				switch(sc.nextInt()) {
				case 1:queue.display();
					break;
				case 2:System.out.println("enter element");
					queue.enqueue(sc.nextDouble());
					break;
				case 3:System.out.println("remove element is : "+queue.dequeue());
					break;
				case 4:System.out.println("total no. of elements is queue : "+queue.totalElementsInQueue());
					break;
				case 5:System.out.println("Is queue full : "+queue.isFull());
					break;
				case 6:System.out.println("Is queue empty : "+queue.isEmpty());
					break;
				case 0:System.out.println("Thank you!!!");
				exit=true;
					break;
				}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
