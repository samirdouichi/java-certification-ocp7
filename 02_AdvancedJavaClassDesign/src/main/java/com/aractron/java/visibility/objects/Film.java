package com.aractron.java.visibility.objects;

import java.io.Serializable;

public class Film implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idt;
	private String nomFilm;
	private float duree;
	private String nomMaiteurEnSegne;

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(Integer idt, String nomFilm, float duree, String nomMaiteurEnSegne) {
		super();
		this.idt = idt;
		this.nomFilm = nomFilm;
		this.duree = duree;
		this.setNomMaiteurEnSegne(nomMaiteurEnSegne);
	}

	void printStates() {
		System.out.println("idt:" +
				idt + " nomFilm:" +
				nomFilm + " duree:" + duree);
	}

	public Integer getIdt() {
		return idt;
	}

	public void setIdt(Integer idt) {
		this.idt = idt;
	}

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public String getNomMaiteurEnSegne() {
		return nomMaiteurEnSegne;
	}

	public void setNomMaiteurEnSegne(String nomMaiteurEnSegne) {
		this.nomMaiteurEnSegne = nomMaiteurEnSegne;
	}

}
