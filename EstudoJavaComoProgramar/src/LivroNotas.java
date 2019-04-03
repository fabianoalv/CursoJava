
public class LivroNotas {

	private String nomeCurso;
	private int[] notas;

	public LivroNotas(String nomeCurso, int[] notas) {
		this.nomeCurso = nomeCurso;
		this.notas = notas;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	// realiza várias operações nos dados
	public void processarNotas() {
		
		mostrarNotas();
		System.out.printf("%nA média da classe é: %.2f%n", getMedia());
		System.out.printf("Maior nota é %d%nMenor nota é: %d%n", getMaximo(), getMinimo());
		barraGrafico();
	}
	
	public int getMinimo() {
		int menorNota = notas[0];

		for (int n : notas) {

			if (n < menorNota)
				menorNota = n;
		}

		return menorNota;
	}

	public int getMaximo() {
		int maiorNota = notas[0];

		for (int n : notas) {

			if (n > maiorNota)
				maiorNota = n;

		}

		return maiorNota;
	}
	
	public double getMedia() {
		int total = 0;
		
		for (int n : notas) {
			total += n;
		}
		
		return (double) total / notas.length;
	}
	
	public void barraGrafico() {
		
		System.out.println("Distribuíção de Notas: ");
		
		//Armazena a frequencia de nota em cada intervalo de 10 notas
		int[]frequencia = new int[11];
		
		for (int n : notas) {
			++frequencia[n/10];
		}
		
		//Gera a saída do rótulo de barras
		for (int count = 0; count < frequencia.length; count++) {
			if(count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			
			//Gera o gráfico com asteristico
			for (int stars = 0; stars < frequencia[count]; stars++) {
				System.out.print("*");
			}
			
			System.out.println();
		} 
		
	}
	
	public void mostrarNotas() {
		System.out.printf("As notas são:%n%n");
		
		for(int estudante = 0; estudante < notas.length; estudante++) {
			System.out.printf("Estudante %2d: %3d%n", estudante + 1, notas[estudante]);
		}
		
	}
	
}
