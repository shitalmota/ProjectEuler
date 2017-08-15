import java.util.*;
public class WordtoSum {
	static Map<Integer, Integer> wordSum = new HashMap<Integer, Integer>();
	
	public static void main (String[] args){
		long startTime = System.currentTimeMillis();
		int sum =0;
		wordSum.put(1,3);
		wordSum.put(2,3);
		wordSum.put(3,5);
		wordSum.put(4,4);
		wordSum.put(5,4);
		wordSum.put(6,3);
		wordSum.put(7,5);
		wordSum.put(8,5);
		wordSum.put(9,4);
		wordSum.put(10,3);
		wordSum.put(11,6);
		wordSum.put(12,6);
		wordSum.put(13,8);
		wordSum.put(14,8);
		wordSum.put(15,7);
		wordSum.put(16,7);
		wordSum.put(17,9);
		wordSum.put(18,8);
		wordSum.put(19,8);
		wordSum.put(20,6);
		wordSum.put(30,6);
		wordSum.put(40,5);
		wordSum.put(50,5);
		wordSum.put(60,5);
		wordSum.put(70,7);
		wordSum.put(80,6);
		wordSum.put(90,6);
		wordSum.put(100,7);
		wordSum.put(1000,8);
		
		for (int i=1;i<=1000;i++)
		  {
			
			sum+=calculate(i);
			
		}
	
		

	System.out.println("sum: "+ sum);
	System.out.println("Time Elapsed: "+ (System.currentTimeMillis() - startTime));
	}
	public static int calculate (int number){
		
		
		if (number<=20 || ((number%10==0) && (number<=99)))
		{
			return wordSum.get(number);
		}
		else if (number>=20 && number <100)
		{
			return wordSum.get(((int)(number/10))*10)+ wordSum.get(number%10);
			
		}
		else if (number < 1000 && number >=100)
		{
			if (number%100 ==0)
			{
				return wordSum.get((int)(number/100)) + wordSum.get(number/((int)(number/100)));
			}
			else if (number%100 > 0){
				
				return calculate(number- (number%100)) +  3 + calculate(number%100);
			}
			
		
		}
		else if (number == 1000)
			return 3 + wordSum.get(1000);
		
		return 0;
		
		
	}	
		

	
	

}
