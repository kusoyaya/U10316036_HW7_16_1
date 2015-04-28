package hw161;

public class RandomCard {
	char[] flower = {'a','b','c','d'};
	
	public static void main(String[] args){
		RandomCard a = new RandomCard();
		for(int i = 0; i < 10; i++)
			System.out.println(a.getRandomCard());
	}
	public String getRandomCard(){
		return ""+flower[(int)(Math.random()*4)]+(int)(Math.random()*13+1);//得到牌名
	}
}
