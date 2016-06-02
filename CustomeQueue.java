package ProblemSetI;

import java.util.Stack;

import java.util.Scanner;

public class CustomeQueue {
	int[] array;
	int num;

	private void createQueue() {
		System.out.println("Enter the size of the queue");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		array = new int[num];
	}

	public synchronized void add(int number) throws InterruptedException {

		if (array.length == num) {
			System.out.println("Array full waiting for sometime");
			wait();
		} else {
			int placeToAdd = array.length;
			array[placeToAdd] = number;
			notifyAll();
		}
	}

	public synchronized int remove() throws InterruptedException {

		if (array.length == 0) {
			System.out.println("No elemets .. waiting for add");
			wait();
		} else {
			int element = array[0];
			notifyAll();
			return element;
		}
		return 0;
	}

}
