//Given file ArrayStack.java Only edits on line 12

package itu.data.structure.stack; 


/**
 * This Stack implementation is just for 50 elements
 */
public class ArrayStack<T> implements StackADT<T>{

	private T[] stack;
	private T[] peek; // Part Added
	private int top;
	private final static int LIMIT_SIZE = 50;
	
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		this.stack = (T[]) new Object[LIMIT_SIZE];
		this.top = 0;
	}
	
	@Override
	public void push(T element) {
		if (this.size() == stack.length) {
		     expandLimit();
		}
		stack[top] = element;
		top++;
	}
	
	private void expandLimit() {
		@SuppressWarnings("unchecked")
		T[] larger = (T[])(new Object[this.stack.length*2]);
		for (int index=0; index < this.stack.length; index++) {
			larger[index] = this.stack[index];
		}
		this.stack = larger;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Imposible to pop an element when the stack is empty");
		}
		top--;
		T result = this.stack[this.top];
		this.stack[this.top] = null;
		return result;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("Imposible to peek an element when the stack is empty");
		}
		return this.stack[this.top-1];
	}

	@Override
	public boolean isEmpty() {
		return this.top == 0;
	}

	@Override
	public int size() {
		return this.top;
	}
	
	@Override
	public String toString() {
		String elements = "[";
		
		for (int i = 0; i < this.top; i++) {
			if (i==this.top-1){
				elements += this.stack[i];
			}
			if (i<this.top-1) {
				elements += this.stack[i] + ",";
			}
		}
		elements += "]";
		return elements;
	}

}

