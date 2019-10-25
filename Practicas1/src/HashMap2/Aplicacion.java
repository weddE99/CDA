package HashMap2;

import java.util.ArrayList;
import java.util.HashMap;

public class Aplicacion {
	public static void main(String[]args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for(int i=0; i<10; i++) {
			arrayList.add(""+i);
		}
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		int j=9;
		for(int i=0; i<10; i++) {
			map.put(arrayList.get(i),j);
			j--;
		}
		
		map.forEach((key, value) -> {
			if(key.toString().equals("3")) System.out.println("La Key es 3 Value: "+value);
			if(value.toString().equals("2")) System.out.println("Key: "+key+" El value es: "+value);
			else System.out.println("Key: "+key +" Value: "+ value);
			});
	}
}
