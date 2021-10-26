import java.lang.Math;
public class Tasks1to5 {
	boolean areEqual(int a, int b) {
		return a==b;
	 }
	 double divide(double a, double b) {
			if(b==0) {
				return 0;
			} return a/b;
			
	}
	int countChar(String word, char let) {
		int count = 0;
		for(int i=0;i<word.length();i++) {
			if (word.charAt(i)==let) {
				count++;
			}
		}
		return count;
	}
	boolean checkIfPrime(int number) {
		if (number==1) {
			return false;
		}
		if(number==2) {
			return true;
		}
		for(int i=2;i<Math.sqrt(number);i++) {
			if (number%i==0) {
				return false;
			}	
		}
		return true;
	}
	int countPrimeFactors(int number) {
		int count=0;
		for (int i=2;i<=number/2;i++) {
			
			if(number%i==0&&checkIfPrime(i)) {
				count++;
			}
		}
		return count;
	}
	String reverseString(String word) {
		byte[] bytes = word.getBytes();
		byte[] result = new byte[word.length()];
		for(int i=0;i<word.length();i++) {
			result[i]=bytes[word.length()-i-1];
		}
		String reversed=new String(result);
		return reversed;
	}
}
