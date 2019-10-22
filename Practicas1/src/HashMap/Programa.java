package HashMap;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;

public class Programa {
	public static void main(String[] args) {
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		for(int i=0; i<10; i++) {
			mapa.put(i,""+i);
		}
		
		Collection<Integer> llaves = mapa.keySet();
		Collection<String> datos = mapa.values();
		System.out.println(llaves+"\n"+datos);
		
		System.out.println();
		
		for (Entry<Integer, String> mapas : mapa.entrySet()){
			Integer clave = mapas.getKey();
			String valor = mapas.getValue();
			Integer claveAux = 3;
			if(clave == 3) {
				valor = "LA CLAVE ES "+claveAux;
				valor = valor.toLowerCase();
				mapas.setValue(valor);
			}
			else valor = "LA CLAVE NO ES "+claveAux;
			System.out.println(clave+"  ->  "+valor);
		}
	}
}
