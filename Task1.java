public class Task1 {
	
 boolean areEqual(int a, int b) {
	 if (a==b) {
		 return true;
	 } return false;
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
	for(int i=2;i<number/2;i++) {
		if (number%i==0) {
			return false;
		}		
	}
	return true;
}
int countPrimeFactors(int number) {
	int count=0;
	for (int i=2;i<number/2;i++) {
		
		if(number%i==0&&checkIfPrime(i)==true) {
			count++;
		}
	}
	return count;
}
String reverseString(String word) {
	String reversed="";
	for(int i = word.length()-1;i>=0;i--) {
		reversed=reversed + word.charAt(i);
	}
	return reversed;
}
}
