package samplecode;

public class Palindrome {
	

	public static void main(String[] args) {
		
		Palindrome pal = new Palindrome();
		System.out.println(pal.isPalindrome("radar"));
		System.out.println(pal.isPalindrome("hello"));

	}	
		Boolean isPalindrome(String str) {
			int i = 0, j = str.length()-1;
			while(i<=j) {									
			
				if(str.charAt(i) != str.charAt(j))
				{
					return false;
				}
				
				else {
				i++;
	            j--;
				
				}
				
			}
			
		
			
		return true;

	}

}
