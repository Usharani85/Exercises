package LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	
		List<Integer> num=new ArrayList<Integer>();
		num.add(10);
		num.add(30);
		num.add(90);
		num.add(60);
		num.add(70);
		num.add(50);
		num.add(40);
		
		
		Collections.sort(num,new mycomparator());
		
		//method 1
		num.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println("using Lamda expression"+s));
		
		//method 2
		Collections.sort(num,(l1,l2)->{
			if(l1>l2) {
				return -1;
			}
			
			else if(l1<l2) {
				return +1;
			}
			else {
				return 0;
			}
		});
		
		System.out.println("The sorting using lamda expression using method2"+num);
		

	}

}

class mycomparator implements Comparator<Integer>{
@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		if(o1>o2) {
			return -1;
		}
		
		else if(o1<o2) {
			return +1;
		}
		
		else {
			return 0;
		}
		
	}
}
	
	

