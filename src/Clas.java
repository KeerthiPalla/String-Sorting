 
import java.util.Arrays;

public class Clas implements StringSort 
{
	String s1=null;
	public void Sortsplit(String s)
	{
		 s1=s.trim();
		 String s2[]=s1.split("\\s+");
	        Arrays.sort(s2);
	 for(String s3:s2)
	     {
		  System.out.println(s3);
          }
	}
}
		
		
		
		

	