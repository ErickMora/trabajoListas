package listas;

public class ListaEstudiantes {

	protected NodoEstudiantes head;
	protected NodoEstudiantes tail;
	protected long size;

	public ListaEstudiantes(){
		head =null;
		tail= null;
		size=0;
	}

	public long getSize() {
		return size;
	}

	public boolean listaVacia(){
		return size==0;
	}

	public void insertarPrimero(String nombre, String cedula){


		if(buscarEstudianteCedula(cedula)!=null){
			System.out.println("No se puede ingresar, el estudiante ya existe en la lista");

		}
		else{
			head=new NodoEstudiantes(nombre,cedula,head);
			if(size==0){

				tail=head;
			}

		}
		size++;


	}

	public void insertarUltimo(String nombre, String cedula){
		if(buscarEstudianteCedula(cedula)!=null){
			System.out.println("No se puede ingresar, el estudiante ya existe en la lista");

		}
		else{
			NodoEstudiantes nuevo=new NodoEstudiantes(nombre,cedula, null);
			if(size==0)
				head=nuevo;
			else
				tail.setN(nuevo);
			tail=nuevo;
			size++;

		}
	}

	public NodoEstudiantes buscarEstudianteCedula(String cedula)
	{
		NodoEstudiantes indice;
		for (indice = head; indice!= null; indice = indice.getN())
			if (cedula == indice.getCedula()){ 
				System.out.println("Estudiante registrado "+cedula+" "+indice.getNombre());
				return indice;
			}


		return null;

	}

	public NodoEstudiantes buscarEstudiante(String cedula)
	{
		NodoEstudiantes indice;
		for (indice = head; indice!= null; indice = indice.getN())
			if (cedula == indice.getCedula()){ 
				System.out.println("Estudiante registrado "+cedula+" "+indice.getNombre());
				return indice;
			}
		System.out.println("Estudiante no registrado "+cedula);

		return null;

	}

	public String imprimirListaEstudiantes() {
		NodoEstudiantes n=head;
		String elementosLista="";
		if(size==0)
			return null;
		else{
			while (n!=null){
				elementosLista+=n.getCedula()+" "+n.getNombre()+" \n";
				n=n.getN();
			}

			return elementosLista;

		}

	}





}
