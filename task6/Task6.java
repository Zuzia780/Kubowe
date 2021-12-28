package task6;
import java.util.ArrayList;
import java.util.Collections;
public class Task6{
	int[] sortList(int[] list) {
		int tmp=0;
		int uno=0, dos=0;
		for(int i=0;i<list.length;i++) {
			uno = list[i];
			for(int k=0;k<list.length;i++) {
				if(uno>dos) {
					tmp=uno;
					uno=dos;
					dos=tmp;
				}
			}
		}
		return list;
	}
}

	



