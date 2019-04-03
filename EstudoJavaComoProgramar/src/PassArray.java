
public class PassArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		System.out.printf("Effects of passing reference to entire array:%n" +
				 "The values of the original array are:%n");
		//Mostra o valor do array original
		for (int i : array) {
		    System.out.printf("	%d", i);
		}
		
		//Altera do valor do array 
		modifyArray(array);
		
		System.out.printf("%nArray modificado:%n");
		
		for (int i : array) {
			System.out.printf("	%d", i);
		}
		
		modifyElemento(array[4]);
		
		

	}
	
	public static void modifyArray(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			array2[i] *=2;
		}
	}
	
	public static void modifyElemento(int elemento) {
		
		elemento*=2;
		System.out.printf("%nElemento modificado "+ elemento);
		
	}

}
