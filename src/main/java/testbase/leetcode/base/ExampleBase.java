package testbase.leetcode.base;

import java.util.Arrays;
import java.util.List;

public class ExampleBase {
	
	public static void main (String [] args) {
		System.out.println ("Hello World!");
		
		doList();
	}
	
	public static void doList () {
		String [] sArray = new String[] {"aa","bb","cc","dd"};
		int [] iArray = new int [] {1,2,3,4,5,};
		
		List<String> sList = Arrays.asList(sArray);
		
		
		for (int i=0; i<sList.size();i++) {
			//System.out.println(sList.get(i));
		}
		
		for (String item:sList) {
			//System.out.println(item);
		}
		
		sList.stream().forEach((String item)->{
					System.out.println(item);
				});
		
	}

}
