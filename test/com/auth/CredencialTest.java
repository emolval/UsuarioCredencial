package com.auth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.excepciones.NombreApellidoNoValidos;

class CredencialTest {
	
	private static com.auth.Usuario usuario1;
	private static com.auth.Usuario usuario2;
	private static com.auth.Usuario usuario3;
	private static com.auth.Usuario usuario4;
	
	@BeforeAll
	public static void createObjects () throws NombreApellidoNoValidos {
		usuario1 = new Usuario("usuario1", "apellido1", "contra");
		usuario2 = new Usuario("usuario1", "apellido1", "ContrasenyaSegura123");
		usuario3 = new Usuario("usuario1", "apellido1", "contra1234");
		usuario4 = new Usuario("usuario1", "apellido1", "Contrasenya");
	}
	
	@Test
	void testConstructor() throws NombreApellidoNoValidos {
		assertTrue(usuario1.hacerLogin("usuape99", "contra"));
	}
	
	@Test
    void constructor_throwsException_NombreApellidoNoValidos() {
        Exception exception1 = assertThrows(NombreApellidoNoValidos.class, () -> {
        	new Usuario("", "", "");
        });
        assertNotNull(exception1);
        
        Exception exception2 = assertThrows(NombreApellidoNoValidos.class, () -> {
        	new Usuario("", "apellido", "");
        });
        assertNotNull(exception2);
        
        Exception exception3 = assertThrows(NombreApellidoNoValidos.class, () -> {
        	new Usuario("nombre", "", "");
        });
        assertNotNull(exception3);
    }
	
	@Test
	void testEsPasswordSegura() throws NombreApellidoNoValidos {
		assertFalse(usuario1.esPasswordSegura());
		assertTrue(usuario2.esPasswordSegura());
		assertFalse(usuario3.esPasswordSegura());
		assertFalse(usuario4.esPasswordSegura());
		
	}
	
	

}
