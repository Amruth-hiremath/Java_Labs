package part_b;

import java.util.Stack;

class StackOperations {
    private Stack<Integer> stack = new Stack<>();
    private int maxSize;
    private boolean pushingAllowed = true;

    public StackOperations(int size) {
        this.maxSize = size;
    }

    public synchronized void push(int value) {
        try {
            while (!pushingAllowed && stack.size() == maxSize) {
                wait();
            }

            if (stack.size() < maxSize) {
                stack.push(value);
                System.out.println("Push Operation: Pushed " + value);
                
                pushingAllowed = (stack.size() < maxSize);
                notifyAll();
            } else {
                System.out.println("Stack is full. Cannot push " + value);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized int pop() {
        try {
            while (stack.isEmpty()) {
                System.out.println("Stack is empty. Pop waiting...");
                wait();
            }

            int value = stack.pop();
            System.out.println("Pop Operation: Popped " + value);
            
            pushingAllowed = true;
            notifyAll();
            return value;
            
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}

class PushRunnable implements Runnable {
    private StackOperations ops;
    private int val;

    public PushRunnable(StackOperations ops, int val) {
        this.ops = ops;
        this.val = val;
    }

    @Override
    public void run() {
        ops.push(val);
    }
}

class PopRunnable implements Runnable {
    private StackOperations ops;

    public PopRunnable(StackOperations ops) {
        this.ops = ops;
    }

    @Override
    public void run() {
        ops.pop();
    }
}

public class lab5_a {

	public static void main(String[] args) {
		StackOperations stackOps = new StackOperations(3);

		new Thread(new PushRunnable(stackOps, 10)).start();
		new Thread(new PushRunnable(stackOps, 20)).start();
		new Thread(new PushRunnable(stackOps, 30)).start();
		new Thread(new PushRunnable(stackOps, 40)).start();

		new Thread(new PopRunnable(stackOps)).start();
		new Thread(new PopRunnable(stackOps)).start();
	}

}
