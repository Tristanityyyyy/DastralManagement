package package2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class King{
	static Queue queue = new LinkedList();
	static Stack stack1 = new Stack();
	static Stack stack2 = new Stack();
	static Stack stack3 = new Stack();
	static Stack stack4 = new Stack();
	static Stack stack5 = new Stack();
	
	static Scanner scn = new Scanner(System.in);
	
	static int cashier = 1;
	
	public static void main(String[] args){
		for (int i = 1; i <= 20; i++) {
			queue.offer(scn.nextLine());
		}
		
		while(true) {
			System.out.println("Cashier 1 is serving: ");
			stack1.push(queue.poll());
			stack1.push(queue.poll());
			stack1.push(queue.poll());
			stack1.push(queue.poll());
			
			System.out.println(stack1);
			
				
			System.out.println("Cashier 2 is serving: ");
			stack2.push(queue.poll());
			stack2.push(queue.poll());
			stack2.push(queue.poll());
			stack2.push(queue.poll());
			
			System.out.println(stack2);
			
			
			System.out.println("Cashier 3 is serving: ");
			stack3.push(queue.poll());
			stack3.push(queue.poll());
			stack3.push(queue.poll());
			stack3.push(queue.poll());
			
			System.out.println(stack3);
		
			
			System.out.println("Cashier 4 is serving: ");
			stack4.push(queue.poll());
			stack4.push(queue.poll());
			stack4.push(queue.poll());
			stack4.push(queue.poll());
			
			System.out.println(stack4);
		
			
			System.out.println("Cashier 5 is serving: ");
			stack5.push(queue.poll());
			stack5.push(queue.poll());
			stack5.push(queue.poll());
			stack5.push(queue.poll());
			
			System.out.println(stack5);
			
			if(queue.isEmpty()) {
				break;
			}
		}
		
		System.out.println("Do you want to remove customers?");
		char a = scn.next().charAt(0);
		
		switch(a){

		}
	}
	
}	
	
	
		
	
	
	
	

	
	
		
		

	

