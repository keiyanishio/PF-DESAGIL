package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}


	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		String vazio = "";
		int minuto = 0;
		int seg = 0;
		if (this.duration == 0) {
			vazio+="0"+":"+"00";
		}else if (this.duration < 10) {
			vazio+="0"+":"+"0"+this.duration;
		}else if (this.duration < 60) {
			vazio+="0"+":"+this.duration;
		}else if (this.duration >= 60) {
			if (this.duration % 60 == 0) {
				minuto = this.duration/60;
				vazio+=minuto+":"+"00";
			}
			else {
				minuto = this.duration/60;
				Math.round(minuto);
				seg = this.duration - (minuto*60);
				if (seg < 10) {
					vazio+=minuto+":"+"0"+seg;
				}
				else {
					vazio+=minuto+":"+seg;
				}
			}
			
		}
		return vazio;
		
	}
	
	public Artist getFullArtistName() {
		return artist;
	}
		
	


	
	
	
	

}
