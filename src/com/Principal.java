package com;

import com.auth.Usuario;
import com.excepciones.NombreApellidoNoValidos;

public class Principal {

	public static void main(String[] args) {
		Usuario julio = null;
		try {
			julio = new Usuario ("Julio", "Perro", "ContrasenyaSegura123");
		} catch (NombreApellidoNoValidos e) {
			e.printStackTrace();
		}
		System.out.println(julio);
		
		System.out.println(julio.esPasswordSegura());
	}

}
