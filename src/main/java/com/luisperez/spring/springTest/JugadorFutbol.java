package com.luisperez.spring.springTest;

import com.luisperez.spring.springTest.api.IJugador;

import lombok.Data;

@Data
public class JugadorFutbol implements IJugador{
	
	private String nombre;
	private String apellido;
	private int edad;
	private String equipo;
	
	public String celebrar() {
		return "He anotado un gol :)";
		
	}
	public String enojarce() {
		return "he fallado!! :( ";
		
	}
	public String saludar() {
		return "Hola soy jugador de futbol";
	}

}
