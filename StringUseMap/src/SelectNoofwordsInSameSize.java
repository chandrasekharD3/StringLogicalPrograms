import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SelectNoofwordsInSameSize {

	public static void main(String[] args) {
		String s="chandra sekhar writing our own logic for saparati no of of of end of of of of the the the word with end end same size and sparate,,,and saparate...and   multiple blank spaces and ;;;;    ,,,,, chandra sekhar writing our own logic for saparati no of word with same size and sparate ... and end";
		SelectNoofwordsInSameSize obj=new SelectNoofwordsInSameSize();

		obj.show(s);
		
	}
	
	public void show(String str) {
	String tem="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c==';'||c==','||c=='.') {
				tem=tem+" ";
			}
			else {
				tem=tem+c;
				
			}
			
		}
		TreeMap<String,Integer> tree=new TreeMap();
		String[] split=tem.split(" ");
		for(int i=0;i<split.length;i++) {
			if(split[i].equals("")) {
				
			}
			else {
				if(tree.get(split[i])==null) {
					tree.put(split[i], 1);
					
				}
				else {
					tree.put(split[i], (int)tree.get(split[i])+1);
					
				}
			}
		}
			//for key asending order
		Set set=tree.keySet();
	//Collections.sort(al);
		Iterator iterator=set.iterator();
		TreeMap map2=new TreeMap();
	
		while( iterator.hasNext()) {
				
			Object key=(String)iterator.next();
			Object value=(int)tree.get(key);
			System.out.println(key+ "       "+ value);
			map2.put(value,key);
			
		}
		System.out.println(map2);	
 			 			
		
	}

}
