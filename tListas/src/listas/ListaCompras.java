package listas;

public class ListaCompras {
    private NodoCompras inicio;			// Puntero que indica el inicio de lista o cabeza de la lista.
    private int tamaño;				// Variable para registrar el tamaño de la lista.
    
    public void Lista(){			//Constructor por defecto
        inicio = null;
        tamaño = 0;
    }
    
    public boolean esVacia(){		//Consulta si la lista esta vacia
        return inicio == null;		//Retorna true si el primer nodo (inicio), no apunta a otro nodo.
    }
  
    public int getTamaño(){		// Consulta cuantos elementos (nodos) tiene la lista, retorna numero entero entre [0,n] donde n es el numero de elementos que contenga la lista.
        return tamaño;
    }
    
    public void agregarAlInicio(String valor, int cantidad, String disponibilidad){		// Agrega un nuevo nodo al inicio de la lista.
        NodoCompras nuevo = new NodoCompras();			// Define un nuevo nodo.	
        nuevo.setValor(valor);				// Agrega al valor al nodo.
        nuevo.setCantidad(cantidad);
        nuevo.setDisponibilidad(disponibilidad);
        if (esVacia()) {					// Consulta si la lista esta vacia.
            inicio = nuevo;					// Inicializa la lista agregando como inicio al nuevo nodo.
        } else{								// Caso contrario va agregando los nodos al inicio de la lista.
            nuevo.setSiguiente(inicio);		// Une el nuevo nodo con la lista existente.
            inicio = nuevo;					// Renombra al nuevo nodo como el inicio de la lista.
        }
        tamaño++;							// Incrementa el contador de tamaño de la lista.
    }

    public void agregarAlFinal(String valor, int cantidad, String disponibilidad){		// Agrega un nuevo nodo al final de la lista.
    	NodoCompras nuevo = new NodoCompras();			// Define un nuevo nodo.   
        nuevo.setValor(valor);				// Agrega al valor al nodo.
        nuevo.setCantidad(cantidad);
        nuevo.setDisponibilidad(disponibilidad);
        if (esVacia()) {					// Consulta si la lista esta vacia.
            inicio = nuevo;					// Inicializa la lista agregando como inicio al nuevo nodo.
        } else{
           
            NodoCompras aux = inicio;					 // Crea una copia de la lista.	// Caso contrario recorre la lista hasta llegar al ultimo nodo y agrega el nuevo.
            while(aux.getSiguiente() != null){	// Recorre la lista hasta llegar al ultimo nodo.
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);		// Agrega el nuevo nodo al final de la lista.
        }
        tamaño++;							// Incrementa el contador de tamaño de la lista
    }
    public boolean buscar(String referencia){
        int i = 0;
    	NodoCompras aux = inicio;					// Crea una copia de la lista.
        boolean encontrado = false;			// Bandera para indicar si el valor existe.
        while(aux != null && i<10){			// Recorre la lista hasta encontrar el elemento o hasta llegar al final de la lista.
            if (referencia.equals(aux.getDisponibilidad())){		// Consulta si el valor del nodo es igual al de referencia.
                encontrado = true;			// Cambia el valor de la bandera.
                System.out.println(aux.getDisponibilidad());
                aux = aux.getSiguiente();
            }
            else{
                aux = aux.getSiguiente();	// Avanza al siguiente. nodo.
            }
            i++;
        }
        return encontrado;					// Retorna el resultado de la bandera.
    }
 
    public void listar(){
        if (!esVacia()) {		// Verifica si la lista contiene elementos.            
            NodoCompras aux = inicio;	// Crea una copia de la lista.          
            int i = 0;			// Posicion de los elementos de la lista.
            while(aux != null){	// Recorre la lista hasta el final.
                System.out.print(i + ".[ " + aux.getValor() + " , " + aux.getCantidad() + " , " + aux.getDisponibilidad() + " ]" + " ->  ");	 // Imprime en pantalla el valor del nodo.
                aux = aux.getSiguiente();		// Avanza al siguiente nodo.               
                i++;			// Incrementa el contador de la posión.
            }
        }
    }

}
