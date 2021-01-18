package stacks;

import java.util.Scanner;

class Stack {
	private int[] arr;
	private int top;
	
	public Stack(int size) {
		arr= new int[size];
		top =-1;
		}
	
	public void push(int val) {
		top++;
		arr[top]=val;
	}
	
	public void pop() {
		top--;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull() {
	return top==arr.length-1;	
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}


public class StackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,val;
		Stack s =new Stack(5);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
	}

}
