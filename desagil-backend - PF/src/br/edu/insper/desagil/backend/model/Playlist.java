package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	
	public Playlist(int id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}


	public int getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTracks(Track faixa) {
		tracks.add(faixa);
	}
	
	public void putRating(String nome, int avaliacao) {
		ratings.put(nome, avaliacao);
	}
	
	public double averageRating() {
		int soma = 0;
		int usuarios = this.ratings.size();
		double media = 0;
		for (int nota: this.ratings.values()) {
			soma += nota;
		}
		media = soma/usuarios;
		int i = (int) media;
		double d = media - i;
		
		if (d < 0.26) {
			d = 0;
		}
		
		if (d >= 0.26 && d<0.74) {
			d = 0.5;
		}
		
		if (d>=0.74) {
			d = 1;
		}
		
		return i+d;
		
		
	}

	
	

}
