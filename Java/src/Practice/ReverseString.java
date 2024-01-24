package Practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madhuri";
		String newStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char chr=str.charAt(i);
			newStr+=String.valueOf(chr);
		}
		System.out.println(newStr);
	}

}
