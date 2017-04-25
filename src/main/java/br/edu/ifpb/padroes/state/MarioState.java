package br.edu.ifpb.padroes.state;

/**
 * Created by diogomoreira on 30/05/16.
 */
public interface MarioState {

	MarioState levarDano();
	MarioState pegarCogumelo();
	MarioState pegarFlor();
	MarioState pegarPena();

}
