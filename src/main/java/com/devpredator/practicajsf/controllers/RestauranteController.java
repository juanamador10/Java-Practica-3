package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

@ManagedBean
@ViewScoped
public class RestauranteController {
	private List<Restaurante> restaurantes;
	/**
	 * Lista de Restaurantes Filtrados
	 */
	private List<Restaurante> restaurantesFiltrados;

	private RestauranteService restauranteService = new RestauranteService();

	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}

	public void consultarRestaurantes() {
		this.restaurantes = this.restauranteService.consultarRestaurantes();
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	/**
	 * @return the restauranteFiltrados
	 */
	public List<Restaurante> getRestauranteFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 * @param restauranteFiltrados the restauranteFiltrados to set
	 */
	public void setRestauranteFiltrados(List<Restaurante> restauranteFiltrados) {
		this.restaurantesFiltrados = restauranteFiltrados;
	}

}
