// Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
// Note : The order of codes are not important. And input string does not contain 0s.
// Input format :
// A numeric string
// Constraints :
// 1 <= Length of String S <= 10
// Sample Input:
// 1123
// Sample Output:
// aabc
// kbc
// alc
// aaw
// kw


public class solution {

	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
        String str = input;
        if(str.length()==0) {
			String[] ans= {""};
			return ans;
		}
		String[] smallAns1=getCode(str.substring(1));
		char firstChar= (char)(str.charAt(0)-'0' + 'a' -1);
		for(int i=0;i<smallAns1.length;i++) {
			smallAns1[i]= firstChar + smallAns1[i];
		}
		String[] smallAns2=new String[0];
		if(str.length()>=2) {
			char firstTwoChar=(char)( (str.charAt(0) -'0') * 10 + (str.charAt(1)-'0') +'a' -1);
			if(firstTwoChar>='a' && firstTwoChar<='z') {
				smallAns2=getCode(str.substring(2));
				for(int i=0;i<smallAns2.length;i++) {
					smallAns2[i]=firstTwoChar + smallAns2[i];
				}
			}	
		}
		String[] ans =new String[smallAns1.length + smallAns2.length];
		for(int i=0;i<smallAns1.length;i++) {
			ans[i]=smallAns1[i];
		}
		for(int i=smallAns1.length;i<ans.length;i++) {
			ans[i]=smallAns2[i-smallAns1.length];
		}
		return ans;
		
	}

}
