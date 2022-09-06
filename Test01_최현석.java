import java.util.Scanner;

public class Test01_최현석 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		int tot=0;
		double avg =0;
		String name;
		
		for(int i=0; i<2; i++) {
			System.out.print("이름을 입력해 주세요 : ");
			name=in.nextLine();//문자열을 읽을때 엔터까지 읽어요
			System.out.println("세과목 점수를 입력하세요.");
			System.out.print("국어 : ");
			kor=in.nextInt();
			System.out.print("영어 : ");
			eng=in.nextInt();
			System.out.print("수학 : ");
			mat=in.nextInt();
			in.nextLine();//버퍼에 남은 엔터를 제거하기위한
			tot=(kor+eng+mat);
			
			System.out.println("총합 :"+tot);
			avg=(double)tot/3;
			System.out.println(String.format("평균 : %.2f\n",avg));
		}
		in.close();
		
	}
	
}
