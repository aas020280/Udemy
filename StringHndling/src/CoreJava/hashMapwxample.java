package CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapwxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Gudbye");
		hm.put(42, "Morning");
		hm.put(3, "Evening");
		System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		//hashtable - pass table set collections
		while(it.hasNext())
		{
			System.out.println(it.next());
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
			
			
		}
		
	}

}
