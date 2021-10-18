package second;
public class Part2 {
//task 8
	int checkWhoWon (char a, char b) {
		if (a=='K') {
			if (b=='K')
				return 0;
			else if(b=='P') 
				return 2;
			else return 1;
			}
		if (a=='P') {
			if (b=='K')
				return 1;
			else if(b=='P') 
				return 0;
			else return 2;
			}
		if (a=='N') {
			if (b=='K')
				return 2;
			else if(b=='P') 
				return 1;
			else return 0;
			}
		return 0;
		}
	int countDeficit (String a, String b) {
		int counta=0, countb=0, result=0;
		for(int i=0;i<a.length();i++) {
			result=checkWhoWon(a.charAt(i),b.charAt(i));
			if (result==1) counta++;
			if(result==2) countb++;		}
		return Math.abs(counta-countb);
	}
}
