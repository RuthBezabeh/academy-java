package com.bptn.course._22_sorting;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort {
	private static int partition(int[] numbers, int start, int end) {
		//ppick  the rightmost element as a pivot from the array
		int pivot = numbers[end];
		
		//elements less than the pivot will go to thr left of the 'pIndex'
		//elements greater than the pivot will go to the right of the 'pIndex'
		//equal elements can go either way
		int pIndex = start;
		for (int i = start; i < end; i++)
        {
            if (numbers[i] <= pivot)
            {
                swap(numbers, i, pIndex);
                pIndex++;
            }
        }
 
        // swap `pIndex` with pivot
        swap (numbers, pIndex, end);
 
        // return `pIndex` (index of the pivot element)
        return pIndex;
	}

    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
	private static void iterativeQuickSort(int[] numbers) {
		Stack <Pair> stack = new Stack<>();
		
		//get the statrting and end index of the given array
		int start = 0;
		int end = numbers.length -1;
		
		//push the start and end index of the arrayinto the stack
		stack.push(new Pair(start, end));
		
		//loop until the stack is not empty
		while(!stack.isEmpty()) {
			//remove top pair from the stack and get subarray starting
			//and ending index			
			start = stack.peek().getX();
			end = stack.peek().getY();
			stack.pop();
			
			//re-arrange the elements across pivot
			int pivot = partition(numbers, start, end);
			
		}
		
	}

	
	public static void main(String[] args) {
		
		int numbers[] = {9, -3, 5, 2, 6, 8, -6, 1};
		
		System.out.println("Before:"+ Arrays.toString(numbers));
		
		iterativeQuickSort(numbers);
		System.out.println("Afte: " + Arrays.toString(numbers));

	}

}

class Pair{
	//final so their values will not change
	private final int x;
	private final int y;
	
	Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
	
}