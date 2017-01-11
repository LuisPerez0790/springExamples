package com.luisperez.spring.springTest;

import lombok.Data;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class Equipo {
	
	private String nombreEquipo = "Barcelona";
	private int anios;
	
	@Autowired
	@Qualifier("jugadorEstrella")
	private JugadorFutbol jugadores;

}
