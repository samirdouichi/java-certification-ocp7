package com.aractron.java.visibility.objects;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciation d 'un client
		Client client = new Client();
		client.setIdt(1);
		client.setNomC("Dou");
		client.setPrenomC("sam");
		client.setAge(32);
		// Instanciation d 'un film
		Film film = new Film();
		film.setIdt(1);
		film.setNomFilm("film");
		film.setNomMaiteurEnSegne("nomMaiteurEnSegne");
		film.setDuree(7);
		// Instanciation d'une liste de film pour un client

		List<Film> listeFilm = new ArrayList<Film>();
		// Ajouter le film a la liste de film
		listeFilm.add(film);
		// Attribution de la liste de film a un client
		if (listeFilm.isEmpty()) {
			System.out.println("la liste de film est vide merci de la remplir");

		} else {
			client.setListeFilm(listeFilm);
		}
		client.showClient(client);
	}

}
