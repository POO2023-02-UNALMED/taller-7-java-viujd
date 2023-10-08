package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	
	private static ArrayList<String> letras =new ArrayList<String>();
	private String interpretacion;
	
	public Alfabeto (String origen, String letras, String interpretacion) {
		super(origen);
		Alfabeto.letras.add(letras);
		this.interpretacion=interpretacion;
	}
	
	public static ArrayList<String> getLetras(){
		return letras;
	}

	public static void setLetras(ArrayList<String> letras) {
		Alfabeto.letras=letras;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String intepretacion) {
		this.interpretacion=intepretacion;
	}
	
	public int cantidadLetras() {
		
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String r=String.join(", ", letras);
		return r;
	}

}
