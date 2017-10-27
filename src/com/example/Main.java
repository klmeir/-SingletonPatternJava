package com.example;

public class Main {

	public static void main(String[] args) {	 

		SoyUnico mateo = SoyUnico.getSingletonInstance("Mateo");
		SoyUnico alejandro = SoyUnico.getSingletonInstance("Alejandro");
		
		//mateo y alejandro son referencias a un único objeto de la clase SoyUnico
		System.out.println(mateo.getNombre());
		System.out.println(alejandro.getNombre());
		
		// No se permite clonar un objeto de esta clase
		try {
			SoyUnico richard =  mateo.clone();
			System.out.println(richard.getNombre());
		}catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		
	}

}
