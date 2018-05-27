package maintest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaptoArrayList {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("01", "Kavitha");
		map.put("02", "Pavithra");
		map.put("03", "Babu");
		map.put("04", "Thilaka");
		
		System.out.println("The created map is:");
		System.out.println(map);
		Set<Entry<String, String>> entrySet = map.entrySet();
		ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String,String>>(entrySet);
        
        System.out.println("ArrayList of Key-Values :");
         
        for (Entry<String, String> entry : listOfEntry) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }    
		
		
	}


