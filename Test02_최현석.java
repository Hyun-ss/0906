import java.util.Scanner;

public class Test02_최현석 {
	public static void main(String[] args) {
		
		
		
		int n;
		System.out.println("n값을 입력해주세요.");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		in.close();
		for(int j=0; j<n; j++) {
			for(int i=0; i<=j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
