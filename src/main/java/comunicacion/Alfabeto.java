package comunicacion;

public class Alfabeto extends Pictograma {
	
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto (String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public static String[] getLetras(){
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras=letras;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String intepretacion) {
		this.interpretacion=intepretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return String.join(", ", letras);
	}

}
