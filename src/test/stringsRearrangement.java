package test;

import java.util.Arrays;

/*
 * Given an array of equal-length strings, check if it is possible to rearrange the strings in such a way that after the rearrangement the strings at consecutive positions would differ by exactly one character.

Example

For inputArray = ["aba", "bbb", "bab"], the output should be
stringsRearrangement(inputArray) = false;

All rearrangements don't satisfy the description condition.

For inputArray = ["ab", "bb", "aa"], the output should be
stringsRearrangement(inputArray) = true.

Strings can be rearranged in the following way: "aa", "ab", "bb".
Input/Output

[time limit] 3000ms (java)
[input] array.string inputArray

A non-empty array of strings of lowercase letters.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15.

[output] boolean


 */
public class stringsRearrangement {

	boolean stringsRearrangement(String[] inputArray) {

		inputArray = getProperArray(inputArray);

		if (inputArray.length == 1)
			return true;
		if (inputArray.length == 2) {
			return findDifference(inputArray[0], inputArray[1]) == 1;
		}

		int count = 0;
		int difference[] = new int[inputArray.length];
		String[] temp = new String[2];
		int store = 0;

		for (int i = 0; i < inputArray.length; i++) {

			for (int j = 0; j < inputArray.length; j++) {
				if (j != i && findDifference(inputArray[i], inputArray[j]) == 1) {
					count++;
				}
			}
			if (count == 1) {
				if (store > 1)
					return false;
				else {
					temp[store] = inputArray[i];
					store++;
				}
			}
			difference[i] = count;
			count = 0;
		}

		return getSequence(difference, temp, inputArray);

	}

	private String[] getProperArray(String[] inputArray) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].equals("1"))
				count++;
		}
		String newArray[] = new String[inputArray.length - count];
		count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (!inputArray[i].equals("1")) {
				newArray[count] = inputArray[i];
				count++;
			}
		}
		return newArray;
	}

	private boolean getSequence(int[] difference, String[] temp, String[] inputArray) {
		int count = 0;
		String[] edges = new String[2];
		for (int k = 0; k < difference.length; k++) {
			if (difference[k] == 0 )
				return false;
			if (difference[k] == 1) {
				count++;
				if (count > 2)
					return false;
				if (count == 2) {
					if (findDifference(temp[0], temp[1]) == 1) {
						return false;
					} else {
						String[] newArray = constructnewArray(inputArray, temp);
						/*if (newArray.length > 3) {
							for (int i = 0; i < newArray.length; i++) {
								if (!newArray[i].equals("1") && findDifference(temp[0], newArray[i]) == 1
										&& findDifference(temp[1], newArray[i]) == 1)
									return false;
							}
						}
						
						
*/						return stringsRearrangement(newArray);
						
						/*edges = getEdgesofsortedString(newArray, edges);
						
						if (edges[0] == null || edges[1] == null ) return true;
						for(String str : temp)
						{
							if(!edges[0].equals("1") && findDifference(edges[0], str) == 1){
								edges[0] = "1";
							}
							else if( !edges[1].equals("1") && findDifference(edges[1], str) == 1){
								edges[1] = "1";
							}
						}
						
						if(! edges[0].equals("1") || ! edges[1].equals("1"))
							return false;*/
					}

				}
			}
		}
		return true;
	}

	private String[] getEdgesofsortedString(String[] newArray, String[] edges) {
		
		
		
		String[] tempNewArray = newArray;
		
		for (int i = 0; i<tempNewArray.length;i++)
		{
			if (edges[0] == null || edges[1] == null){
			if (edges[0] == null && ! tempNewArray[i].equals("1"))
				edges[0] = tempNewArray[i];
			else if(edges[1] == null  && ! tempNewArray[i].equals("1") && findDifference(edges[0], tempNewArray[i]) ==1)
				edges[1] = tempNewArray[i];
			}
			
			else if(findDifference(edges[1], tempNewArray[i]) ==1) edges[1] = tempNewArray[i] ;
			else if(findDifference(edges[0], tempNewArray[i]) ==1) edges[0] = tempNewArray[i] ;
			
		}
		
		
		return edges;
	}

	private String[] constructnewArray(String[] inputArray, String[] temp) {
		String[] inStrings = new String[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].equals(temp[0]) || inputArray[i].equals(temp[1]))
				inStrings[i] = "1";
			else
				inStrings[i] = inputArray[i];
		}
		return inStrings;

	}

	private int findDifference(String string1, String string2) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) != string2.charAt(i))
				count++;
		}
		return count;
	}

	private boolean TryPermutation(String[] elements){
		
		/* Check if this combination works*/
		return true;
	}
	
	private void Trails(String[] elements)
	{
		boolean bLoop = true;
		int idx=0;
		
		do
		{
			//String[] newCombination = Arrays.copyOfRange(elements, idx, elements.length - 1). 
			
		}while(bLoop);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int j=0; j <  3628800; j++)
		{
			System.out.println("fuk u bitch");
		}
		//String[] inputArray = {"abc", "abd", "xxx", "xyx", "abe"};
		//stringsRearrangement stringss = new stringsRearrangement();
		//System.out.println(stringss.stringsRearrangement(inputArray));

	}

}
