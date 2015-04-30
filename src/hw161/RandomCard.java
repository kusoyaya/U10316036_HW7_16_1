package hw161;

import java.util.ArrayList;
import java.util.Collections;


public class RandomCard {
	char[] flower = {'a','b','c','d'};
	
	
	
	public String getRandomCard(){
		int[] ii = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		ArrayList<Integer> i = new ArrayList<Integer>();
		for(int iii :ii)
			i.add(iii);
		Collections.shuffle(i);
		return ""+flower[(int)(Math.random()*4)]+i.get(0);//得到牌名
	}
}
