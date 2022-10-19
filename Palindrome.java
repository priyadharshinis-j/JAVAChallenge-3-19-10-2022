package javaChallenge3;

//Java Challenge (3/20)
//
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.

//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
public class Palindrome 
{
	public void palindrome(String s)
	{
		System.out.println("Input String ====> "+s);
		String repString = s.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(repString);
		String lowerCaseString = repString.toLowerCase();
		//System.out.println(lowerCaseString);
		char[] charArray = lowerCaseString.toCharArray();
		//System.out.println(Arrays.toString(charArray));
		String revString="";
		for(int i=charArray.length-1;i>=0;i--)
		{
			revString=revString+charArray[i];
		}
		if(lowerCaseString.equals(revString))
		{
			
			System.out.println("Output ==> " +true);
		}
		else
			System.out.println("Output ==> " +false);
	}
	public static void main(String[] args) 
	{
		Palindrome string = new Palindrome();
		string.palindrome("A man, a plan, a canal: Panama"); 
		string.palindrome("race a car");
		string.palindrome(" ");
		
	}

}
