package listas;

import java.io.IOException;

public class Aplicacion {
	
	public static void main(String args[]) throws IOException
	{
		ListaEstudiantes lista=new ListaEstudiantes();
		
		lista.insertarPrimero("Belén", "1785543669");
		lista.insertarUltimo("Paul", "1524414752");
		lista.insertarUltimo("José", "1754422455");
		lista.insertarUltimo("Pablo", "1452145224");
		lista.insertarPrimero("Alan", "1758548533");
		
		lista.insertarPrimero("Juan", "1754422455");
		lista.insertarUltimo("Maria", "1452145224");
		
		System.out.println(lista.imprimirListaEstudiantes());
		
		
		
		
		
		
		
		
		
		
		
		
		
		ListaCompras lista2 = new ListaCompras();

		System.out.println("Lista de Compras\n");

		lista2.agregarAlInicio("Tomate de Árbol",5,"Listo");			// Agregar al inicio de la lista	
		lista2.agregarAlFinal("Aguacate",3,"No Listo");				// Agregar al final de la lista
		lista2.agregarAlFinal("Piña",2,"No Listo");
		lista2.agregarAlFinal("Limón",10,"Listo");
		lista2.agregarAlFinal("Tomate Riñon",6,"Listo");
		lista2.agregarAlFinal("Queso",10,"No Listo");						
		lista2.agregarAlFinal("Yogurt",1,"Listo");	
		lista2.agregarAlFinal("Duraznos Enlatados",5,"Listo");	
		lista2.agregarAlFinal("Apio",12,"No Listo");	
		lista2.agregarAlFinal("Zumo de Naranja",7,"No Listo");	
		
		lista2.listar();												// Imprimir la lista
		
		System.out.println("\n");
		System.out.println(lista2.buscar("Listo"));
		
		
			
	}


}
