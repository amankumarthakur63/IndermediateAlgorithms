package StacksAndQueue;

import java.util.ArrayList;

public class Stacks {

    // Implementing a Stack is trivial using a dynamic array
    // (which we implemented earlier).

    ArrayList<Integer> stack = new ArrayList<>();

    public Stacks () {

    }

    public void push (int n) {
        stack.add(n);
    }

    public int pop () {
        return stack.remove(stack.size() - 1);
    }

    public int size () {
        return stack.size();
    }

    public static void main(String[] args) {

    }
}
