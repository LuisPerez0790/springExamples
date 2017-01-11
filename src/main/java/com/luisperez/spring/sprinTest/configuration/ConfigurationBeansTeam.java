package com.luisperez.spring.sprinTest.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.luisperez.spring.springTest.Equipo;
import com.luisperez.spring.springTest.JugadorFutbol;

@Configuration
public class ConfigurationBeansTeam {

	@Bean
	public Equipo equipo(){
		return new Equipo();
	}
	
	@Bean(name="jugador")
	public JugadorFutbol jugadorfutbol(){
		JugadorFutbol jugadorFutbol = new JugadorFutbol();
		jugadorFutbol.setNombre("leonel");
		jugadorFutbol.setApellido("messi");
		jugadorFutbol.setEdad(28);
		jugadorFutbol.setEquipo("Baecelona");
		return jugadorFutbol;	
	}
	
	@Bean
	public JugadorFutbol jugadorEstrella(){
		JugadorFutbol jugadorFutbol = new JugadorFutbol();
		jugadorFutbol.setNombre("andres");
		jugadorFutbol.setApellido("iniesta");
		jugadorFutbol.setEdad(30);
		jugadorFutbol.setEquipo("Baecelona");
		return jugadorFutbol;	
	}
	
}
