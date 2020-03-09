package com.chessmaster.config;

import java.util.EmptyStackException;

public class MyStack<T> {

	private T[] array;
	private int size;
	private int lenthOfTheArray;
	
	public MyStack() {
		
		this.array = (T[]) new Object[lenthOfTheArray];
		
	}
	
	public void push(T figure) {
		
		if(isFull()) {
		throw new StackOverflowError("Stack is full");
		}
	
	array[lenthOfTheArray] = figure;
	lenthOfTheArray++;
   }

	public T pop() {
		
		if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[lenthOfTheArray--];
	}

	public T peek() {
    	if(!isEmpty()) {
    		return array[lenthOfTheArray];
    	}
    	
		return null;
	}
	
	public boolean isEmpty() {
        if (lenthOfTheArray == 0) {
            return true;
        }
        return false;
    }
	
	public boolean isFull() {
        if (lenthOfTheArray == size) {
            return true;
        }
        return false;
    }

    public int size() {
        return lenthOfTheArray;
    }
	
}
