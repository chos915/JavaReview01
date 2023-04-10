package expert;

public class SwapStrings {
	public static void main(String[] args) {
		
		 String aa = "휴먼";
		 String bb = "서울";
		 // aa에 bb의 내용이 들어가게
		 // bb에 aa의 내용이 들어가게
		 
		 // Concatenate both the string aa and bb and store it in aa
		 aa = aa + bb; // aa : 휴먼서울
		 
		 // Extract bb from updated aa
		 bb = aa.substring(0,(aa.length() - bb.length())); // aa.length() : 휴먼서울 의 길이 , bb.length(): 서울의 길이 
		 
		 // Extract aa from updated aa
		 aa = aa.substring(bb.length());
		 
		 System.out.println("aa :"+ aa); // 서울		
		 System.out.println("bb :"+ bb); // 휴먼

// In Java, the substring() method is a built-in function of the String class that allows you to extract a part of a string. 
// This method returns a new string that is a substring of the original string.	
		 String str1 = "Hello World";
		 String substr1 = str1.substring(6);
		 System.out.println(substr1);
		 
		 String str2 = "Hello World";
		 String substr2 = str2.substring(0, 5);
		 System.out.println(substr2);
	}
}

