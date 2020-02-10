package udemy.stack;

public class ArrayBasedStack {

	public static int topOfStack = -1;
	public static int size = 0;
	public static int stack[];

	public String createStack(int sizeOfStack) {
		stack = new int[sizeOfStack];
		topOfStack = -1;
		size = sizeOfStack;
		return "Create: stack created";
	}

	public String push(int n) {
		System.out.print("Push: ");
		if (isFull()) {
			return "Stack is Full";
		}
		stack[++topOfStack] = n;
		return "Item Pushed to Stack";
	}

	public String pop() {
		System.out.print("Pop: ");
		if (isEmpty()) {
			return "Stack is Empty";
		}
		return "Item: " + stack[topOfStack--];
	}

	public String peek() {
		System.out.print("Peek: ");
		if (isEmpty()) {
			return "Stack is Empty";
		}
		return "Item: " + stack[topOfStack];
	}

	public String deleteStack() {
		System.out.print("Delete: ");
		stack = null;
		topOfStack = -1;
		return "Stack is Deleted";
	}

	public boolean isFull() {
		return topOfStack == size - 1;
	}

	public boolean isEmpty() {
		return topOfStack == -1;
	}

	public void stackElements() {
		System.out.println("Elements: ");
		int pointer = topOfStack;
		for (int i = topOfStack; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
