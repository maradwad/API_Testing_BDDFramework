package Practice;

//import java.util.Iterator;

public class test{
//	static {
//		System.out.println("hi");
//	}
  public static void main(String[] args) {
	  //Iterator tr=new Iterator<>();
	  
	  String s="159357lcfd";
	  int k=98;
	  System.out.println(Integer.valueOf(s.substring(1,2)));
	  
      String encrpted="";
	for(int i=0;i<s.length();i++)
      {
         
          char ch=s.charAt(i);
          
          if(ch>='a' && ch<='z')
          {
        	  ch+=k%26;
              if(ch>'z')
              {
                 ch=(char)(96+ch-122);
                 encrpted+=String.valueOf(ch);
                // String s1=Integer.valueOf(12);
              }
              else 
              {
              encrpted+=String.valueOf(ch);
              }
          }
          else if(ch>='A'&& ch<='Z')
          {
        	  ch+=k%26;
              if(ch>'Z')
              {
                   ch=(char)(64+ch-90);
                  encrpted+=String.valueOf(ch);
              }
              else 
              {
              encrpted+=String.valueOf(ch);
              }
          }
          else
          {
              encrpted+=String.valueOf(ch);
          }
	  	    
		    }
      String a[]="abscd".split("");
      System.out.println(a[0]);
      
      System.out.println(98%26);
      System.out.println(encrpted);   //Dn-/oW/X`SjthvUV
    }
  
}
   

class A{}
class B{}
