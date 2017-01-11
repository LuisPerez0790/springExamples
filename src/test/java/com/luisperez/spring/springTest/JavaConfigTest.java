package com.luisperez.spring.springTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luisperez.spring.sprinTest.configuration.ConfigurationBeansTeam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigurationBeansTeam.class)
public class JavaConfigTest {

	@Autowired
	private JugadorFutbol jugadorEstrella;

	@Autowired
	@Qualifier("jugador")
	private JugadorFutbol jugador;

	@Autowired
	private Equipo team;

	@Test
	public void jugador() {
		assertNotNull(jugadorEstrella);
		log.info("{}", jugadorEstrella.getNombre());
		log.info("{}", jugadorEstrella.getApellido());
		log.info("{}", jugadorEstrella.getEdad());
		log.info("{}", jugadorEstrella.getEquipo());
	}

	@Test
	public void jugadorEstrella() {
		assertNotNull(jugador);
		log.info("{}", jugador.getNombre());
		log.info("{}", jugador.getApellido());
		log.info("{}", jugador.getEdad());
		log.info("{}", jugador.getEquipo());

	}

	@Test
	public void Equipo() {
		assertNotNull(team);
		log.info("{}", team.getNombreEquipo());

	}
}
