package test;
/*
 * ou found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second item weighs weight2 and is worth value2. What is the total maximum value of the items you can take with you, assuming that your max weight capacity is maxW and you can't come back for the items later?

Example

For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4 and maxW = 8, the output should be
knapsackLight(value1, weight1, value2, weight2, maxW) = 10.

You can only carry the first item.

For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4 and maxW = 9, the output should be
knapsackLight(value1, weight1, value2, weight2, maxW) = 16.

You're strong enough to take both of the items with you.

Input/Output

[time limit] 3000ms (java)
[input] integer value1

Guaranteed constraints:
2 ≤ value1 ≤ 20.

[input] integer weight1

Guaranteed constraints:
2 ≤ weight1 ≤ 10.

[input] integer value2

Guaranteed constraints:
2 ≤ value2 ≤ 20.

[input] integer weight2

Guaranteed constraints:
2 ≤ weight2 ≤ 10.

[input] integer maxW

Guaranteed constraints:
1 ≤ maxW ≤ 20.

[output] integer


 */
public class knapsackLight {
	
	int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
		if (value1 < value2)
		{
			if (weight2 <= maxW){
				if (weight2 + weight1 <= maxW) return value1+value2;
				else return value2;
				
			}
			if (weight1 <= maxW){
				//if (weight2 + weight1 <= maxW) return value1+value2;
				 return value1;
		}
		}
		else
		{
			if (weight1 <= maxW){
				if (weight2 + weight1 <= maxW) return value1+value2;
				 return value1;
			}
			if (weight2 <= maxW){
				//if (weight2 + weight1 <= maxW) return value1+value2;
				 return value2;
		}
		}
		return 0;
	}

	public static void main(String[] args) {
		knapsackLight obj = new knapsackLight();
		System.out.println(obj.knapsackLight(10, 5, 6, 4, 8));
	}

}
