package com.denis.benutzer;
import java.util.Arrays;

/**
 * 
 * @author denis
 *
 */
public class Benutzer {

	String userId;
	char[] passWort;
	
	public Benutzer() {
		
	}
	
	Benutzer(String userId, char[] passWort) {
		this.userId = userId;
		this.passWort = passWort;
	}

	public String toString() {
		return "Benutzer [userId=" + userId + ", passWort=" + Arrays.toString(passWort) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Benutzer other = (Benutzer) obj;
		if (!Arrays.equals(passWort, other.passWort))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
}
