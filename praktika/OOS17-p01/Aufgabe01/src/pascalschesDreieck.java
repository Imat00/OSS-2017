
public class pascalschesDreieck {

	public static void main(String[] args) {

		final int tiefe = 9;
		int[][] dreieck = new int[tiefe][];

		for (int i = 0; i < dreieck.length; i++) {
			dreieck[i] = new int[i+1];
			for (int j = 0; j < dreieck[i].length; j++) {
				if(j == 0 || j == dreieck[i].length - 1) {
					dreieck[i][j] = 1;
				}
				else {
					dreieck[i][j] = dreieck[i-1][j-1] + dreieck[i-1][j];
				}
				
			}
			
		}
		
		for (int i = 0; i < dreieck.length; i++) {
			for (int j = 0; j < dreieck[i].length; j++) {
				System.out.print(dreieck[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
