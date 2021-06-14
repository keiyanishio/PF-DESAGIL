package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> colaborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> colaborators) {
		super(artist, name, duration);
		this.colaborators = colaborators;
	}
	
	@Override
	public String getFullNameArtist() {
		String vazio = "";
		vazio += get +"("+"feat."+" "+String.join(",", colaborators)+")";
		
	}

}
