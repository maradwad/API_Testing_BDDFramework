package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str="08/02/2024";
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(str);
		System.out.println(date);
		
		String str1="08-Feb-2024";
		Date date1=new SimpleDateFormat("dd-MMM-yyyy").parse(str1);  //MMM  M means months in 1st 3 word declaration 
		System.out.println(date1);
		
		String sDate5 = "Thu, Dec 31 1998 23:37:50"; 
		Date date3=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss").parse(sDate5);
		System.out.println(date3);
	}

}
