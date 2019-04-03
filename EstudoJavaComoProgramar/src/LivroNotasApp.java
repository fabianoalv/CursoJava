
public class LivroNotasApp {

	public static void main(String[] args) {
		int[]notasArray = {87,68,94,100,83,78,85,91,76,87};
		
		LivroNotas nota = new LivroNotas("Java", notasArray);
		System.out.printf("Bme vindo ao Livro de Notas para %s%n%n",
				nota.getNomeCurso());
		 nota.processarNotas();
	
	}	
}
