package CrearAuto;

public class Motor {
		private int caballosDeFuerza;
		private String tipoDeCombustion;
		
		
		@Override
		public String toString() {
			return "Motor [caballosDeFuerza=" + caballosDeFuerza + ", tipoDeCombustion=" + tipoDeCombustion + "]";
		}


		public Motor(int caballosDeFuerza, String tipoDeCombustion) {
			super();
			this.caballosDeFuerza = caballosDeFuerza;
			this.tipoDeCombustion = tipoDeCombustion;
		}


		public int getCaballosDeFuerza() {
			return caballosDeFuerza;
		}


		public String getTipoDeCombustion() {
			return tipoDeCombustion;
		}
		
}
