package br.edu.ifpb.padroes.state;

/**
 * Created by diogomoreira on 30/05/16.
 */
public class Mario {

	private MarioState estadoAtual;

	public Mario() {
		this.estadoAtual = MarioStateEnum.PEQUENO;
	}

	public Mario(MarioState estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public void levarDano() {
		this.estadoAtual = estadoAtual.levarDano();
	}

	public void pegarCogumelo() {
		this.estadoAtual = estadoAtual.pegarCogumelo();
	}

	public void pegarFlor() {
		this.estadoAtual = estadoAtual.pegarFlor();
	}

	public void pegarPena() {
		this.estadoAtual = estadoAtual.pegarPena();
	}

}
