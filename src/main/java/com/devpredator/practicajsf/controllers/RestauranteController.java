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

}
