package test;
/*
 * descending order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[time limit] 3000ms (java)
[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
5 ≤ a.length ≤ 15,
-1 ≤ a[i] ≤ 200.

[output] array.integer

Sorted array a with all the trees untouched.
 */
public class SortByHeight {
	
	int[] sortByHeigh(int[] a) {
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++){
			if (a[i] != -1 && a[j] != -1 && a[i] < a[j])
			{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
			}
		}
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SortByHeight s = new SortByHeight();
		int a[] = {-1, 150, 190, 170, -1, -1, 160, 180};
		a = s.sortByHeigh(a);
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
