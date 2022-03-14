package LamdaExpressions;

import java.util.stream.IntStream;

public class ValidatePolidrome {
	
	public static boolean isPolindrome(String givenString) {
		
		String tempVar=givenString.replaceAll("\\s", "").toLowerCase();
		
		return IntStream.range(0, tempVar.length()).noneMatch(i->tempVar.charAt(i)!=tempVar.charAt(tempVar.length()-i-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ValidatePolidrome.isPolindrome("Too hot to hoot"));

	}

}

