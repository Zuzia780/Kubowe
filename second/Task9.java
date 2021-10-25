package task9;

public class Task9 {
static boolean checkIfPrime(int number) {
	if(number==2) {
		return true;
	}
	for(int i=2;i<=Math.sqrt(number);i++) {
		if (number%i==0) {
			return false;
		}		
	}
	return true;
}
static int sumOfPrime(int number) {
	int count=0;
	if (number<2) return 0;
	for(int i=2; i<=number;i++) {
		if (checkIfPrime(i)) count=count+i;
	}
	return count;
}
public static void main(String[] args) {
	System.out.println(sumOfPrime(1000000));
}

}
