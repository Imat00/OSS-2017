
public class FakultätIterativ {

	public static void main(String[] args) {
		
		final long in = 20;
		long out = 1;
		for (long i = 2; i <= in; i++) {
			out *= i;
		}
		
		System.out.println(out);
		
	}
	
}
