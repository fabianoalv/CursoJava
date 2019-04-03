
public class ArrayBidimencional {

	public static void main(String[] args) {
		
		float n1 = 4.5f;
		
		int[][] a = new int[3][5];
		
		a[0][2]= 10;
		
		for (int i = 0; i < a.length; i++) {
			for(int k = 0; k < a[i].length; k++) {
				
				
				System.out.print(a[i][k] + "  ");
			}
			
			System.out.println();
		}

	}

}
