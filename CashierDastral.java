package package1;
import java.util.*;

public class CashierDastral {
	static Queue queue = new LinkedList();
	static Stack stack1 = new Stack();
	static Stack stack2 = new Stack();
	static Stack stack3 = new Stack();
	static Stack stack4 = new Stack();
	static Stack stack5 = new Stack();
	
	static Scanner scn = new Scanner(System.in);
	
	static int cashier = 1;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter your arranged number: ");
		for (int i = 1; i <= 20; i++) {
			queue.offer(scn.nextLine());
		}
		System.out.println(queue);
		
		while(true) {
			System.out.println("**********************************");
			System.out.print("Cashier 1 is serving: ");
			stack1.push(queue.poll());
			stack1.push(queue.poll());
			stack1.push(queue.poll());
			stack1.push(queue.poll());
			
			System.out.println(stack1);
			
				
			System.out.print("Cashier 2 is serving: ");
			stack2.push(queue.poll());
			stack2.push(queue.poll());
			stack2.push(queue.poll());
			stack2.push(queue.poll());
			
			System.out.println(stack2);
			
			
			System.out.print("Cashier 3 is serving: ");
			stack3.push(queue.poll());
			stack3.push(queue.poll());
			stack3.push(queue.poll());
			stack3.push(queue.poll());
			
			System.out.println(stack3);
		
			
			System.out.print("Cashier 4 is serving: ");
			stack4.push(queue.poll());
			stack4.push(queue.poll());
			stack4.push(queue.poll());
			stack4.push(queue.poll());
			
			System.out.println(stack4);
		
							
			System.out.print("Cashier 5 is serving: ");
			stack5.push(queue.poll());
			stack5.push(queue.poll());
			stack5.push(queue.poll());
			stack5.push(queue.poll());
			
			System.out.println(stack5);
			System.out.println("**********************************");
			
			break;
		}
			Thread.sleep(3000);
			run();
			Thread.sleep(3000);
			run();
			Thread.sleep(3000);
			run();
			Thread.sleep(3000);
			run();
			System.out.println("The cashiers are all done on processing the customers.");
	}
	
	static void run() {
		System.out.println("Cashier Processing: ");
		
		if(stack1.size() >= 1) {
			stack1.pop();
			System.out.println("Cashier 1 is serving: " + stack1);
		}
		if(stack2.size() >= 1) {
			stack2.pop();
			System.out.println("Cashier 2 is serving: " + stack2);
		}
		if(stack3.size() >= 1) {
			stack3.pop();
			System.out.println("Cashier 3 is serving: " + stack3);
		}
		if(stack4.size() >= 1) {
			stack4.pop();
			System.out.println("Cashier 4 is serving: " + stack4);
		}
		if(stack5.size() >= 1) {
			stack5.pop();
			System.out.println("Cashier 5 is serving: " + stack5);
		}
		System.out.println("**********************************");
	}
}
