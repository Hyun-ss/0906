import java.util.Random;

public class Test03_최현석 {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		int Random=0;
		Random random =new Random();
		
		for(int i=0;i<6;i++) {
			lotto[i]=random.nextInt(45)+1;
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
					
				}
					
			}
			
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		//for(변수:집합) {}	
		//for(int n:arr) {System.out.print(n+" ");}	
		
	}

}
