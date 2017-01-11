package com.luisperez.spring.springTest;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luisperez.spring.springTest.api.IJugador;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:futbolConfiguration.xml")*/
public class AppTest {
	
	private static ApplicationContext applicationContext;
	@Autowired
	@Qualifier("jugadorEstrella")
	public IJugador jugador;
	
	@BeforeClass
	public static void initialize(){
		applicationContext = new ClassPathXmlApplicationContext("futbolConfiguration.xml");
	}

	@Test
	public void playerTestWithAutowired(){
		log.info("SpringTest2 -------------------------");
		Equipo equipo = applicationContext.getBean(Equipo.class);
		equipo.setAnios(103);
		equipo.setNombreEquipo("Barcelona");
		assertNotNull(equipo.getJugadores());
		log.info("{}", equipo);
	}
	
	@Test
	public void playerTest(){
		log.info("SpringTest3 -------------------------" +jugador);
		assertNotNull(jugador);
		log.info("{}", jugador);
		log.info(jugador.saludar());
		
	}
	//some new changes 2.0
//Esto se va a descontrolar
	//adding this for stashing
	
	
	
	
}
