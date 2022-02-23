package LamdaExpressions;

@FunctionalInterface
interface ValidateStringRotation{
	
	public void isValidateRotation(String Str1,String Str2);
	
}

public class ValidateStrRotation{
	
	public static void validateStringRotationM(String st1,String st2) {
		
		ValidateStringRotation strRotation=(s1,s2)->{
			String s3=s1+s1;
						
			if((s1.length()==s2.length()) && s3.contains(s2)) {
				System.out.println("Strings are rotation of each other");
				
			}
			else {
				System.out.println("Strings are not rotation of each other");
			}
		};
		
		strRotation.isValidateRotation(st1, st2);
	}
	
	public static void main(String[] args) {
		ValidateStrRotation.validateStringRotationM("who", "how");
		
	}
}

	
