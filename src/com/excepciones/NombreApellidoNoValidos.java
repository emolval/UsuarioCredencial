package com.excepciones;

public class NombreApellidoNoValidos extends Exception {
	
	private static final String DEFAULT_MENSSAGE = "El nombre o apellido no son válidos";

	public NombreApellidoNoValidos() {
		super(DEFAULT_MENSSAGE);
	}

	public NombreApellidoNoValidos(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NombreApellidoNoValidos(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NombreApellidoNoValidos(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NombreApellidoNoValidos(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
