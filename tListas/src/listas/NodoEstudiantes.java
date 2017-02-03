package listas;

public class NodoEstudiantes {
	private String nombre;
	private String cedula;
	private NodoEstudiantes n;
	
	
	public NodoEstudiantes(String nombre, String cedula, NodoEstudiantes n) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.n = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public NodoEstudiantes getN() {
		return n;
	}
	public void setN(NodoEstudiantes n) {
		this.n = n;
	}
	
	

}
