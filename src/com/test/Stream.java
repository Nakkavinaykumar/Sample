package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
	//  List<Integer> number = Arrays.asList(1,2,3,4,5);
	//	number.stream().forEach((n)->System.out.println(n));   // iterate through every element of the stream.
		
		
		List<Integer> number1 = Arrays.asList(1,2,3,4,5);
		List<Integer> res=number1.stream().map(x->x+x).collect(Collectors.toList());
		System.out.println(res);
		
		List<String> names =Arrays.asList("java","python","sql","angular");
		List<String> result=names.stream().filter(s ->s.startsWith("a")).collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> number3 = Arrays.asList(1,2,3,4,5,6,10,15);
		// print odd number using lambda
		List result1=number3.stream().sorted().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println("result1" +result1);
		
	int[] arr1 = new  int[] {54, 432, 53, 21, 43};
	//int arr[] = new int[] {54, 432, 53, 21, 43};
	System.out.println("test");
	List<Integer> number4 = Arrays.asList(54, 432, 53, 21, 43);
	List asc=number4.stream().sorted().collect(Collectors.toList());  //asc order
	System.out.println("asc"+asc);
	List desc=number4.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println("desc"+desc);
	
	int[] arr2 = new int[]{54, 432, 53, 21, 43};
	Arrays.sort(arr2);
	
	
	//int[] sortedArray1 =Arrays.stream(arr2).boxed().sorted(Comparator.reverseOrder()); 

	}


}
