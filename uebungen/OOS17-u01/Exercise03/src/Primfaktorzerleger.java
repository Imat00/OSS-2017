import java.util.*;

public class Primfaktorzerleger {

	public static void main(String[] args) {

		List<Integer> primeFactorList = new ArrayList<>();
		
		// Eingabezahl
		final int n = 555;
		
		// Nur wenn keine Primzahl dann gibt es Teiler
		if(!checkIfPrime(n)) {
			
			findPrimeFactors(primeFactorList, n);
			
			for (Iterator<Integer> iterator = primeFactorList.iterator(); iterator.hasNext();) {
				System.out.print((Integer) iterator.next() + (iterator.hasNext() ? " * " : " "));
			}
			System.out.print("= " + n);
			
		}
		else {
			System.out.println("Die Zahl " + n + " ist eine Primzahl!");
		}
		
	}

	static void findPrimeFactors(List<Integer> primeFactorList, int n) {
				
		for (int i = 2; i < Math.sqrt(n);) {

			if(n % i == 0 && checkIfPrime(i)) {
				primeFactorList.add(i);			
			}
			else {
				i++;
			}
		}
		
	}
	
	
	static boolean checkIfPrime(int zahl) {
		if(zahl == 2) return true;
		for (int i = 2; i < zahl / 2; i++) {
			if(zahl % i  == 0)return false;
		}
		
		return true;
	}
	
}
