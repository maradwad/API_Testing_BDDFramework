package Practice;

import java.util.Scanner;

public class Recursion {
	
	public static String reverse(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;

	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String revrstr=reverse(str);
		System.out.println(revrstr);
	}

}
