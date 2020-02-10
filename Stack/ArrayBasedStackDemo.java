package udemy.stack;

public class ArrayBasedStackDemo {
	public static void main(String args[]) {
		ArrayBasedStack stack = new ArrayBasedStack();
		System.out.println(stack.createStack(5));
		stack.stackElements();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.push(5));
		stack.stackElements();
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.push(6));
		stack.stackElements();
		System.out.println(stack.pop());
		stack.stackElements();
		System.out.println(stack.pop());
		stack.stackElements();
		System.out.println(stack.push(7));
		stack.stackElements();
		System.out.println(stack.push(8));
		stack.stackElements();
		System.out.println(stack.push(9));
		stack.stackElements();
		System.out.println(stack.peek());
		System.out.println(stack.deleteStack());
		stack.stackElements();
	}
}
