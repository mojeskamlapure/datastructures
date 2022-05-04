package datastructures.hashtables;

import java.util.Date;
import java.util.HashSet;

public class FirstRecurringCharacterDemo {
 
	public  static Character getFirstRecurringCharNaive(char[]charArray) {
		long st=new Date().getTime();
		Character charRecurred = null;
		for(int i=0;i<charArray.length;i++)
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					charRecurred=charArray[j];
					long ed=new Date().getTime();
				//	System.out.println("took\t"+(ed-st));
					return charRecurred;
				}
			}
		return charRecurred;
	}
	
	public  static Character getFirstRecurringChar(char[]charArray) {
		long st=new Date().getTime();
		HashSet<Character> charSet=new HashSet<>();
		Character charRecurred = null;
		for(char ch:charArray) {
			if(charSet.contains(ch)) {
				charRecurred=ch;
				break;
			}else {
				charSet.add(ch);
			}
		}
		long ed=new Date().getTime();
		//System.out.println("took\t"+(ed-st));
		return charRecurred;
	}
	public static void main(String[] args) {
	char[] charArray= {'a','b','b','a','e','d','g'};
	System.out.println(getFirstRecurringChar(charArray));
	System.out.println(getFirstRecurringCharNaive(charArray));
	
	}
}
