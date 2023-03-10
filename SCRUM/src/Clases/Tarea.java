package Clases;

import java.util.ArrayList;

public class Tarea {
	private String nombreTarea;
	private ArrayList<Integer> esfuerzo = new ArrayList<Integer>();
	private String trabajador;
	private String estado;
	
	public Tarea(String nT,int esf_inicial, String trabajador) {
		this.nombreTarea = nT;
		this.esfuerzo.add(0, esf_inicial);
		this.trabajador=trabajador;
		this.estado="Pendiente";
	}
	
	//Beti
	public void añadirEsfuerzo(int esf, int dia) {
		if(esfuerzo.size()<dia-1) {
			for(int i=esfuerzo.size();i<dia-1;i++) {
				esfuerzo.add(esfuerzo.get(i-1));
			}
		}
		esfuerzo.add(esf);
	}
	public ArrayList<Integer> getEsfuerzo(){
		return esfuerzo;
	}
	public String getNombre() {
		return nombreTarea;
	}
	
	public String getTrabajador() {
		return this.trabajador;
	}
	
	public void setEstado(String estado) {
		this.estado=estado;
	}

	public String getEstado() {
		// TODO Auto-generated method stub
		return estado;
	}
}
