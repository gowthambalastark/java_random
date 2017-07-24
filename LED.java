/*
1. Count the number of changes in LED Light when display one digit after another of a given number. (Initially all LED is off)
Example:

Given number – 082
Answer: 9
Explanation: Initially 0 has 6 LED On, then for 8 we will turn on 1 more LED, then for 2 we turn off two LEDs so 6+1+2 = 9.

*/

import java.util.*;
import java.util.HashMap;
class LED{
	public static void main(String[] args) {
		String n="082";
		HashMap<Character,HashSet<Integer>> s=new HashMap<Character,HashSet<Integer>>();
		s.put('0',new HashSet(Arrays.asList(1,2,3,4,5,6)));
		s.put('1',new HashSet(Arrays.asList(3,4)));
		s.put('2',new HashSet(Arrays.asList(2,3,7,6,5)));
		s.put('3',new HashSet(Arrays.asList(2,3,7,4,5)));
		s.put('4',new HashSet(Arrays.asList(1,7,3,4)));
		s.put('5',new HashSet(Arrays.asList(2,1,7,4,5)));
		s.put('6',new HashSet(Arrays.asList(1,4,5,6,7)));
		s.put('7',new HashSet(Arrays.asList(2,3,4)));
		s.put('8',new HashSet(Arrays.asList(1,2,3,4,5,6,7)));
		s.put('9',new HashSet(Arrays.asList(1,2,3,4,7)));
		int a=0;
		HashSet<Integer> t=new HashSet<Integer>();
		HashSet<Integer> ttt=new HashSet<Integer>();
		HashSet<Integer> tt=new HashSet<Integer>();
		for(int i=0;i<n.length();i++){
			HashSet<Integer> temp=new HashSet<Integer>();
			temp.addAll(s.get(n.charAt(i))); 
			t.removeAll(temp);
			temp.removeAll(ttt); 
			tt.addAll(temp);
			tt.addAll(t);
			a+=tt.size();
			tt.clear();
			t.clear();
			t.addAll(s.get(n.charAt(i)));
			ttt.addAll(t);
		}
		System.out.println(a);
	}
}