package br.edu.ifpb.padroes.state;

/**
 * Created by diogomoreira on 30/05/16.
 */
public class Loader {

	public static void main(String[] args) {

		// Retornou do banco o estado PENA
		Mario m = new Mario(MarioStateEnum.values()[3]);

		m.pegarCogumelo();
		m.pegarFlor();
		m.levarDano();

	}
}
