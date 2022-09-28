package stringclass;      //spilt method

public class CountingNo {
	
	
	public static void main (String ag[])
	{
		
		String str= "India is my country it has states";
		
	    String[] words=str.split("    ");
	     
	    
		//System.out.println(Array.tostring(words));  
		
		for(String word:words) {
			System.out.println(word);
		}
			
	
		
		
	}
	}
	
	


