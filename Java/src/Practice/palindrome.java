package Practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Marathi";
		String nstr="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			nstr=ch+nstr;
		}
//		System.out.println(nstr);
		if(str.equals(nstr))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
