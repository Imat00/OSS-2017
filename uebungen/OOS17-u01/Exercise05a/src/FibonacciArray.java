
public class FibonacciArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[] fibonacci = new long[50];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		
		for (int i = 0; i < 50; i++) {
			if(i<48)
			fibonacci[i+2] = fibonacci[i+1] + fibonacci[i];
			System.out.println(i + "->" + fibonacci[i]);
		}
		
		
	}
	

}
