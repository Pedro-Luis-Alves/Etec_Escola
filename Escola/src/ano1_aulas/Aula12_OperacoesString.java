package ano1_aulas;

public class Aula12_OperacoesString {

	public static void main(String[] args) {
		
		// construction
		
		char c = 'J';
		char[] vetorChar = {'J', 'A', 'V', 'A'};
		String s;
		String s1 = "String JAVA";
		String s2 = new String(vetorChar);
		String s3 = s1 + " " + s2;
		
		System.out.println(c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		for(int i=0; i<4; i++){		
			System.out.print(vetorChar[i]+ " ");
		}
		
		
		// Operações
		
		System.out.println();
		
		int tamanho = s3.length();
		System.out.println(tamanho);
		
		String texto = s3.toString();
		System.out.println(texto);
		
		//Localizaço
		
		System.out.println(s3.charAt(7));
		
		
		
	}

}
