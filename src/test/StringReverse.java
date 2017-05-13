package test;

public class StringReverse {

	public static void main(String[] args) {
		String str = "sruthi";
		char strc[] = str.toCharArray();
		String rev= "";
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
			System.out.println(strc[i]);
			rev = rev + strc[i];
		}
		System.out.println(rev);
	}
}
