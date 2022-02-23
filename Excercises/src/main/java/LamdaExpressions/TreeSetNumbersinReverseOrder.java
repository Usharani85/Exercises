package LamdaExpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


		
	class treesetComparator implements Comparator<Integer>{

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
	
	public class TreeSetNumbersinReverseOrder {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			TreeSet<Integer> numReverse=new TreeSet<Integer>(new treesetComparator());
			numReverse.add(10);
			numReverse.add(12);
			numReverse.add(9);
			numReverse.add(8);
			numReverse.add(21);
			numReverse.add(17);
			//without using Lamda Expression
			System.out.println("Before Sorting "+numReverse);
			
			//method 1 using Lamda expression
			numReverse.stream().sorted(new treesetComparator()).forEach(System.out::println);
			
			//method2 using lamda expression
			
			TreeSet<Integer> treeset1=new TreeSet<Integer>((l1,l2)->{
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
			treeset1.add(10);
			treeset1.add(12);
			treeset1.add(9);
			treeset1.add(8);
			treeset1.add(21);
			treeset1.add(17);
			
			System.out.println("Sorting using method2"+treeset1);
			
}
	}