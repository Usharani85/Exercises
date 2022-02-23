package LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class myTreemapComaparator{
public static <K,V extends Comparable<V>> Map<K,V> valueSort(final Map<K,V> map){
	Comparator<K> valueComparator=new Comparator<K>() {

		@Override
		public int compare(K o1, K o2) {
			// TODO Auto-generated method stub
			int comValue=map.get(o1).compareTo(map.get(o2));
			
			if(comValue>0) {
				return -1;
			}
			if(comValue<0) {
				return +1;
			}
			if(comValue==0) {
			return 1;
		}
			else {
				return comValue;
			}
	
}
	
};
Map<K,V> sorted=new TreeMap<K,V>(valueComparator);
sorted.putAll(map);
return sorted;
}
}


public class TreeMapSortingdecendingOrder {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> treemap1=new TreeMap<String,Integer>();
		
		treemap1.put("usha", 5);
		treemap1.put("vinoth", 3);
		treemap1.put("appu", 2);
		treemap1.put("anitha", 10);
		treemap1.put("lalitha", 1);
		
		Map SortedMap1=myTreemapComaparator.valueSort(treemap1);
		Set set=SortedMap1.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry mp=(Map.Entry)itr.next();
			System.out.println(mp.getKey()+" : ");
			System.out.println(mp.getValue());
		}
		
		
		List<Entry<String,Integer>> entries=new ArrayList<>(treemap1.entrySet());
		Collections.sort(entries, (o1,o2)->o1.getValue().compareTo(o2.getValue()));
		//entries.stream().sorted().forEach(System.out::println);
		
		treemap1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
	}

}
