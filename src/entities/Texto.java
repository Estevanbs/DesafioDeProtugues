package entities;

public class Texto {

	public String texto;
	
	private int espacos() {
		int quantidadeEspaco = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
				quantidadeEspaco++;
			}
		}
		return quantidadeEspaco;
	}
	
	private int vogais() {
		int quantidadeVogais = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O' || texto.charAt(i) == 'U') {
				quantidadeVogais ++;
			}
		}
		return quantidadeVogais;
	}
	
	private String pluralEspaco() {
		if (espacos() == 1) {
			return "espaço";
		}
		else return "espaços";
	}
	
	private String pluralVogal() {
		if (vogais() == 1) {
			return "vogal";
		}
		else return "vogais";
	}
	
	public String toString() {
		return "\"" 
	+ texto.length() 
	+ " caracteres\", \"" 
	+ espacos() 
	+ " " + pluralEspaco() + " em branco\", \""
	+ vogais()
	+ " " + pluralVogal() + "\"";
	}
}
