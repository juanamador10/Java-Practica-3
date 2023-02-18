package com.devpredator.practicajsf.services;

/**
 * @author Juan Fernando Amador Miranda
 *
 */

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.entity.Gerente;

public class RestauranteService {
	public List<Restaurante> consultarRestaurantes() {
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();

		Restaurante carlsjr = new Restaurante();
		Restaurante mcdonalds = new Restaurante();
		Restaurante dominos = new Restaurante();
		Restaurante starbucks = new Restaurante();
		Restaurante subway = new Restaurante();

		Gerente gerente_1 = new Gerente();
		Gerente gerente_2 = new Gerente();
		Gerente gerente_3 = new Gerente();
		Gerente gerente_4 = new Gerente();
		Gerente gerente_5 = new Gerente();

		gerente_1.setNombre("John");
		gerente_1.setPrimerApellido("Smith");
		gerente_1.setSegundoApellido("Watson");
		
		carlsjr.setNombre("Carl's Jr");
		carlsjr.setDireccion("221B Baker Street");
		carlsjr.setPais("EUA");
		carlsjr.setGerente(gerente_1);



		gerente_2.setNombre("Juan Fernando");
		gerente_2.setPrimerApellido("Amador");
		gerente_2.setSegundoApellido("Miranda");

		mcdonalds.setNombre("McDonald's");
		mcdonalds.setDireccion(" 142-1 Itaewon-ro, Yongsan-gu");
		mcdonalds.setPais("Corea del Sur");
		mcdonalds.setGerente(gerente_2);
		

		gerente_3.setNombre("Kate");
		gerente_3.setPrimerApellido("Bishop");
		gerente_3.setSegundoApellido("Jones");
		
		dominos.setNombre("Domino's Pizza");
		dominos.setDireccion("1512 Bishop Street");
		dominos.setPais("Canada");
		dominos.setGerente(gerente_3);
		

		gerente_4.setNombre("Liz");
		gerente_4.setPrimerApellido("Warren");
		gerente_4.setSegundoApellido("Smith");
		
		starbucks.setNombre("Domino's Pizza");
		starbucks.setDireccion("Heroico Colegio Militar 101");
		starbucks.setPais("México");
		starbucks.setGerente(gerente_4);
		
		
		gerente_5.setNombre("Lorelai");
		gerente_5.setPrimerApellido("Gilmore");
		gerente_5.setSegundoApellido("Gilmore");
		
		subway.setNombre("Subway");
		subway.setDireccion("Behrenstraße 47, 10117");
		subway.setPais("Alemania");
		subway.setGerente(gerente_5);

		restaurantes.add(carlsjr);
		restaurantes.add(mcdonalds);
		restaurantes.add(dominos);
		restaurantes.add(starbucks);
		restaurantes.add(subway);

		return restaurantes;
	}
}
