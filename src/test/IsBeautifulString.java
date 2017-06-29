package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * A string is said to be beautiful if b occurs in it no more times than a; c occurs in it no more times than b; etc.

Given a string, check whether it is beautiful.

Example

For inputString = "bbbaacdafe", the output should be
isBeautifulString(inputString) = true;
For inputString = "aabbb", the output should be
isBeautifulString(inputString) = false;
For inputString = "bbc", the output should be
isBeautifulString(inputString) = false.
Input/Output

[time limit] 3000ms (java)
[input] string inputString

A string of lowercase letters.

Guaranteed constraints:
3 ≤ inputString.length ≤ 50.

[output] boolean


 */
public class IsBeautifulString {
	
	boolean isBeautifulString(String inputString) {
		
		HashMap<Character, Integer> pairs = new HashMap<Character, Integer>();
		
		for (int i=0;i<inputString.length();i++)
		{
			if (! pairs.containsKey(inputString.charAt(i))){
				int tempCount  = 0;
				for (int j=0;j < inputString.length();j++)
				{
					if (inputString.charAt(i) == inputString.charAt(j))
						tempCount++;
				}
				
				pairs.put(inputString.charAt(i), tempCount);
				
			}
		}
		 Character key1=  (Character) pairs.keySet().toArray()[0];
		 if (key1 != 'a') return false;
		 int value = pairs.get(key1);
		for (Character key : pairs.keySet()) {
			 if (value < pairs.get(key) || key1+1 != key && key != 'a') return false;
			else
			{
				value = pairs.get(key);
				key1 = key;
			}
		}
		
		return true;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsBeautifulString obj= new IsBeautifulString();  
		System.out.println(obj.isBeautifulString("aabbb")); 
	}

}
