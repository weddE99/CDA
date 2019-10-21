package listaenlazadasimple;

/**
 * Muestra de funcionamiento de la lista enlazada
 * @author DiscoDurodeRoer
 */
public class ListaEnlazadaSimple {

    public static void main(String[] args) {
        //  Creo la lista enlazada de numeros
        //  Puede ser de String, double, Objetos, etc.
        ListaEnlazada<Integer> lista=new ListaEnlazada<>();
        
        System.out.println("Insercion de numeros aleatorios del 0 al 9 en forma de cola");
        for(int i=0;i<10;i++){
        	int numero = (int)Math.floor(Math.random()*9+1);
            lista.insertarUltimo(numero);
        }
        
        //  Mostramos la lista
        lista.mostrar(); 
        
        System.out.println("Numero de elementos: " + lista.cuantosElementos());
        System.out.println();
        
        System.out.println("Eliminacion del dato que esta en la posicion 3");
        lista.borraPosicion(3); //  Elimina el dato 3
        
        lista.mostrar();
        
        System.out.println("Numero de elementos: " + lista.cuantosElementos());
        System.out.println();
        
        System.out.println("Insercion del dato 2 en la posicion 5");
        lista.introducirDato(5, 2);
        
        lista.mostrar();
        
        System.out.println("Numero de elementos: " + lista.cuantosElementos());
        System.out.println();
        
        System.out.println("Modificamos el dato de la posicion 5 por un 3");
        lista.modificarDato(5, 3);
        
        lista.mostrar();
        
        System.out.println("Numero de elementos: " + lista.cuantosElementos());
        System.out.println();
        
        System.out.println("Inserto en la posicion 0");
        lista.introducirDato(0, 10);
        
        lista.mostrar();
        System.out.println();
        
        System.out.println("Inserto en la ultima posicion");
        //  Equivalente a insertarUltimo
        lista.introducirDato(lista.cuantosElementos(), 11);
        
        lista.mostrar();
        System.out.println();
        
        System.out.println("Posicion del dato 5: "+lista.indexOf(5));
        System.out.println("Posicion del dato 5 desde la posicion 7: "+lista.indexOf(5, 7));
        
        System.out.println();
        
        System.out.println("¿Existe el dato 10 en la lista? "+lista.datoExistente(10));
        System.out.println("¿Existe el dato 20 en la lista? "+lista.datoExistente(20));
    }
}
