//Client.java edited Added Peak Method Small other edits
package itu.data.structure.stack;

public class Client {

	public static void main(String[] args) {
		testPush9Elems();
		testSimplePopElems();
		testMultiplePopsElems();
		testEmpty();
		testPrint();
		peek();
	}
  //This method is new
	private static void peek(){
		StackADT<Integer> stack = new ArrayStack<Integer>();
		for (int i = 0; i < 9; i++) {
			stack.push(i);
		}
		Integer x = stack.peek();
		System.out.println("========================");
		System.out.println("Peeking at 8");
		System.out.println("========================");
		System.out.println(x);
		for (int j = 0; j < 4; j++) {
			stack.pop();
		}
		x = stack.peek();
		System.out.println("========================");
		System.out.println("Peeking at 4");
		System.out.println("========================");
		System.out.println(x);
	}
	private static void testPrint() {
		System.out.println("========================");
		System.out.println("Testing printing a Stack");
		System.out.println("========================");
		StackADT<Integer> stack = new ArrayStack<Integer>();
		for (int i = 0; i < 4; i++) {
			stack.push(i);
		}
		System.out.println(stack);
	}

	private static void testEmpty() {
		System.out.println("==================================");
		System.out.println("Testing empty method for the Stack");
		System.out.println("==================================");
		StackADT<Integer> stack = new ArrayStack<Integer>();
		System.out.println("is empty should be true and is: " + stack.isEmpty());
		System.out.println(stack);
		stack.push(90);
		System.out.println("is empty should be false and is: " + stack.isEmpty());
		System.out.println(stack);
		stack.pop();
		System.out.println("is empty should be true and is: " + stack.isEmpty());
		System.out.println(stack);
	}

	private static void testMultiplePopsElems() {
		System.out.println("==================================================");
		System.out.println("Testing calling multiple pops method for the Stack");
		System.out.println("==================================================");
		StackADT<Integer> stack = new ArrayStack<Integer>();
		for (int i = 0; i < 9; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		Integer eight = stack.pop();
		System.out.println("Eight: " + eight);
		System.out.println(stack);
		Integer seven = stack.pop();
		System.out.println("Seven: " + seven);
		System.out.println(stack);
		Integer six = stack.pop();
		System.out.println("Six: " + six);
		System.out.println(stack);
		Integer five = stack.pop();
		System.out.println("five: " + five);
		System.out.println(stack);
	}

	private static void testSimplePopElems() {
		System.out.println("============================================");
		System.out.println("Testing calling one pop method for the Stack");
		System.out.println("============================================");
		StackADT<Integer> stack = new ArrayStack<Integer>();
		for (int i = 0; i < 9; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		Integer lastElement = stack.pop();
		System.out.println("the last element should be an 8 and is: " + lastElement);
		System.out.println(stack);
	}

	private static void testPush9Elems() {
		System.out.println("=======================================");
		System.out.println("Testing pushing 5 elements to the Stack");
		System.out.println("=======================================");
		StackADT<Integer> stack = new ArrayStack<Integer>();
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
		System.out.println(stack);
	}
	
	
}
