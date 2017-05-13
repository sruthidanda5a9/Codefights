package test;

public class Stringrearrange {
	
	boolean  QuickPerm(String[] a) {
		   
		  int N = a.length;
		  int elementLength = a[0].length();
		  
		   int p[] = new int[N];
		   String tmp;
		   int i, j; // Upper Index i; Lower Index j

		   if(verifyIntegrity(a, N, elementLength)) return true;
		   
		   for(i = 0; i < N; i++) {  // initialize arrays; a[N] can be any type
		      //a[i] = i + 1;   // a[i] value is not revealed and can be arbitrary
		      p[i] = 0;       // p[i] == i controls iteration and index boundaries for i
		   }
		   //display(a, 0, 0);   // remove comment to display array a[]
		   i = 1;   // setup first swap points to be 1 and 0 respectively (i & j)
		   while(i < N) {
		      if (p[i] < i) {
		         j = i % 2 * p[i];   // IF i is odd then j = p[i] otherwise j = 0
		         tmp = a[j];         // swap(a[j], a[i])
		         a[j] = a[i];
		         a[i] = tmp;
		         
		         if(verifyIntegrity(a, N, elementLength)) return true;
		         
		         //display(a, j, i); // remove comment to display target array a[]
		         p[i]++;             // increase index "weight" for i by one
		         i = 1;              // reset index i to 1 (assumed)
		      } else {               // otherwise p[i] == i
		         p[i] = 0;           // reset p[i] to zero
		         i++;                // set new index value for i (increase by one)
		      } // if (p[i] < i)
		   } // while(i < N)
		   return false;
		} // QuickPerm()

	private boolean IsMinDistance(String string1, String string2, int elementLength) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < elementLength; i++) {
			if (string1.charAt(i) != string2.charAt(i)){
				if(count == 1)
					return false;
				
				count++;  
			}
				
		}
		return count == 1;
	}
	
	private boolean verifyIntegrity(String[] a, int length, int elementLength) {
		// TODO Auto-generated method stub
		int idx=0;
		boolean bOutput = true;
		
		do{
			bOutput = IsMinDistance(a[idx], a[idx+1],  elementLength);
			
			if(!bOutput) return false;
			
			idx++;
		}while(idx < length-1);
		
		return bOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] inputArray = {"abc", "abd", "xxx", "xyx", "abe"};
		Stringrearrange  stringss = new Stringrearrange();
				System.out.println(stringss.QuickPerm(inputArray));

	}

}
