package second;
public class Part2 {
//task 8
	int checkWhoWon (char a, char b) {
		if(a==b) return 0;
		if (a=='K') {
			if(b=='P') 
				return -1;
			else return 1;
			}
		if (a=='P') {
			if (b=='K')
				return 1;
			else return -1;
			}
		if (a=='N') {
			if (b=='K')
				return -1;
			else  return 1;
			}
		return 0;
		}
	int countDeficit (String a, String b) {
		int counta=0, countb=0, result=0;
		for(int i=0;i<a.length();i++) {
			result=checkWhoWon(a.charAt(i),b.charAt(i));
			if (result==1) counta++;
			if(result==-1) countb++;		}
		return Math.abs(counta-countb);
	}
}
