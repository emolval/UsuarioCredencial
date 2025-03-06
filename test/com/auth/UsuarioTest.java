package com.auth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.excepciones.NombreApellidoNoValidos;

class UsuarioTest {
	
	private static com.auth.Usuario usuario1;
	
	@BeforeAll
	public static void createObjects () throws NombreApellidoNoValidos {
		usuario1 = new Usuario("usuario1", "apellido1", "Hola1234");

	}

	@Test
	void testModificarPassword() throws NombreApellidoNoValidos {
		assertTrue(usuario1.modificarPassword("Hola1234", "Hola1234", "Adios1234", "Adios1234"));
		assertFalse(usuario1.modificarPassword("Hola1234", "Hola1234", "Adios1234", "Adios4321"));
		assertFalse(usuario1.modificarPassword("Hola1234", "Hola4321", "Adios1234", "Adios1234"));
		assertFalse(usuario1.modificarPassword("Hola1234", "Hola1234", "Hola1234", "Hola1234"));
		assertFalse(usuario1.modificarPassword("Hola4321", "Hola4321", "Hola4321", "Hola4321"));
	}
	
	void testEsCuentaBloqueadaTrue() {
		assertTrue(usuario1.esCuentaBloqueada());
	}
	
	@Test
	void testHacerLogin() {
		assertTrue(usuario1.hacerLogin("usuape99", "Adios1234"));
		assertFalse(usuario1.hacerLogin("usuape99", "Hola1234"));
		assertFalse(usuario1.hacerLogin("usuarioapellido99", "Hola1234"));
		assertFalse(usuario1.hacerLogin("usuape99", ""));
	}
	
	void testEsCuentaBloqueadaFalse() {
		assertFalse(usuario1.esCuentaBloqueada());
	}

}
