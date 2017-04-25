package br.edu.ifpb.padroes.state;

/**
 * Created by diogomoreira on 30/05/16.
 */
public enum MarioStateEnum implements MarioState {

	PEQUENO {
		public MarioState levarDano() {
			System.out.println("Game over!");
			return null;
		}

		public MarioState pegarCogumelo() {
			System.out.println("Mario virou Mario Grande!");
			return GRANDE;
		}

		public MarioState pegarFlor() {
			System.out.println("Mario virou Mario com Flor");
			return FLOR;
		}

		public MarioState pegarPena() {
			System.out.println("Mario virou Mario Pena");
			return PENA;
		}
	},

	GRANDE {
		public MarioState levarDano() {
			System.out.println("Levou dano! Voltando pra Mario Pequeno!");
			return PEQUENO;
		}

		public MarioState pegarCogumelo() {
			System.out.println("Mais 1000 pontos");
			return this;
		}

		public MarioState pegarFlor() {
			System.out.println("Mudou para Mario Flor!");
			return FLOR;
		}

		public MarioState pegarPena() {
			System.out.println("Mudou para Mario Pena!");
			return PENA;
		}
	},

	FLOR {
		public MarioState levarDano() {
			System.out.println("Levou dano! Voltando para Mario Grande");
			return GRANDE;
		}

		public MarioState pegarCogumelo() {
			System.out.println("Pegou cogumelo! Mais 1000 pontos");
			return this;
		}

		public MarioState pegarFlor() {
			System.out.println("Pegou flor! Mais 1000 pontos");
			return this;
		}

		public MarioState pegarPena() {
			System.out.println("Pegou pena! Mudou para Mario Pena!");
			return PENA;
		}
	},

	PENA {
		public MarioState levarDano() {
			System.out.println("Levou dano! Voltando para o Mario Grande");
			return GRANDE;
		}

		public MarioState pegarCogumelo() {
			System.out.println("Pegou cogumelo! Mais 1000 pontos");
			return this;
		}

		public MarioState pegarFlor() {
			System.out.println("Pegou flor! Mudou para Mario Flor");
			return FLOR;
		}

		public MarioState pegarPena() {
			System.out.println("Pegou pena! Mais 1000 pontos");
			return this;
		}
	}

}
