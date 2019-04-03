
public class EstudoArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		System.out.printf("%s%8s%n","Index", "Valor");
		
		for (int i = 0; i < array.length; i++) {
			array[i]= 10 + i;
			System.out.printf("%d%8d%n",i, array[i]);
			
		}

	}

}
