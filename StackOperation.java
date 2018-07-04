package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * StackOperation class is used to perform the stack operations for the given elements.
 * @author sathanadevi
 */
public class StackOperation {
	static List<Integer> inputList = new ArrayList<Integer>();
	static List<String> resultList = new ArrayList<String>();
	static int top = -1;
	public static void main(String[] args){
		int input;
		int p,e,k,size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the stack size: ");
		size = scan.nextInt();
		System.out.println("Enter the stack operation :"+"\n"+"1.push"+"\n"+"2.pop"+"\n"+"3.increment");
		for(int i=0; i<size;i++){
			System.out.println("Enter the operation :");
			input =scan.nextInt();
			switch(input){
			case 1: System.out.println("Enter the element to push :");
			p=scan.nextInt();
			push(p);
			break;
			case 2: pop();
			break;
			case 3: System.out.println("Enter number of element(e) :");
			e=scan.nextInt();
			System.out.println("Enter the increment value(k) :");
			k=scan.nextInt();
			Increment(e,k);
			break;
			default: break;
			}
		}
		displayResult();
	}
	private static void displayResult() {
		System.out.println(resultList);
	}
	@SuppressWarnings("unchecked")
	private static void push(int element) {
		inputList.add(element);
		int topElementSize = inputList.size()-1;
		resultList.add(Integer.toString(inputList.get(topElementSize)));
		System.out.println(inputList);
		System.out.println(resultList);
	}
	private static void pop() {
		top = inputList.size()-1;
		inputList.remove(top);
		System.out.println(inputList);
		if(inputList.isEmpty()){
			resultList.add("EMPTY");
		}else{
			int size =inputList.size()-1;
			resultList.add(Integer.toString(inputList.get(size)));
		}
	}

	private static void Increment(int e, int k) {
		int incrementValue, size;
		size = 0;
		for (int i = 0; i < e; i++) {
			incrementValue = inputList.get(size);
			incrementValue = incrementValue + k;
			inputList.set(size, incrementValue);
			size++;
		}
		int topElementSize = inputList.size()-1;
		resultList.add(Integer.toString(inputList.get(topElementSize)));
		System.out.println(inputList);
	}
}
