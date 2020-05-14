//Java program to sort the name in alphabetical order

import java.util.*;

public class name_sort{
	public static void bubble_sort(String[] arr){
    	int j=0;
    	String tmp;
    	boolean sorted = false;
    	while (!sorted){
        	sorted = true;
        	j++;
        	for(int i=0;i<arr.length-j;i++){
            	if(arr[i].compareTo(arr[i+1]) > 0){
                	tmp = arr[i];
                	arr[i] = arr[i+1];
                	arr[i+1] = tmp;
                	sorted = false;
            	}
        	}
    	}
	}
	public static void main(String args[]){
		System.out.print("\033[H\033[2J");  
		System.out.flush();
		System.out.print("How many names do you want to sort ? : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		input+=1;
		System.out.println("Now enter the names :\n");
		String names[] = new String[input];
		for(int i=0;i<input;i++){
			names[i] = scan.nextLine();
		}
		bubble_sort(names);
		for(String element : names) System.out.println(element);
	}
}