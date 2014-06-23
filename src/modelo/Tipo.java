package modelo;

public enum Tipo {
	
	MONSTRO{
		@Override
		public String toString(){
			return "Monstro";
		}
	},
	MAGIA{
		@Override
		public String toString(){
			return "Magia";
		}
	},
	ENCANTAMENTO{
		@Override
		public String toString(){
			return "Encantamento";
		}
	};
	
	Tipo(){
	}
	
}
