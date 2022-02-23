package LamdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] myarray=new int[]{3,5,1,9,7,2};
		List<Integer> myArraylist=Arrays.asList(3,5,1,9,7,2);
	int secondlargest=myArraylist.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
	System.out.println(secondlargest);
	int secondsmallest=myArraylist.stream().sorted().limit(2).skip(1).findFirst().get();
	System.out.println(secondsmallest);
	}

}
