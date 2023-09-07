package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("生徒の人数を入力してください（2以上）: " );
		int student = scanner.nextInt();
		int i = 1;
		
		do {
			System.out.println(i + "人目の『英語』の点数を入力してください : " );
			int eng = scanner.nextInt();
			System.out.println(i + "人目の『数学』の点数を入力してください : " );
			int math = scanner.nextInt();
			System.out.println(i + "人目の『理科』の点数を入力してください : " );
			int sci = scanner.nextInt();
			System.out.println(i + "人目の『社会』の点数を入力してください : " );
			int soc = scanner.nextInt();
			
			int[] score;
			score = new int[4];
			score[0] = eng;
			score[1] = math;
			score[2] = sci;
			score[3] = soc;
			
			int sum = 0;
			for(int n : score) {
				sum += n;
			}
			double average = sum / score.length;
			System.out.println(i + "人目の平均点は" + average + "点です");
			System.out.println();
			
			i++;
		}while(student >= 2 && i <= student);
		
		
//		if(student >= 2) {
//			for(int i = 1; i  < student; i++) {
//				System.out.println(i + "人目の『英語』の点数を入力してください : " );
//				int eng = scanner.nextInt();
//				System.out.println(i + "人目の『数学』の点数を入力してください : " );
//				int math = scanner.nextInt();
//				System.out.println(i + "人目の『理科』の点数を入力してください : " );
//				int sci = scanner.nextInt();
//				System.out.println(i + "人目の『社会』の点数を入力してください : " );
//				int soc = scanner.nextInt();
//				int[] score;
//				score = new int[4];
//				score[0] = eng;
//				score[1] = math;
//				score[2] = sci;
//				score[3] = soc;
//				
//				int sum = 0;
//				for(int n : score) {
//					sum += n;
//				}
//				double average = sum / score.length;
//				System.out.println(i + "人目の平均点は" + average + "点です");
//				System.out.println();
//			}
//		}else {
//			System.out.println("2以上の数値を入力してください");
//		}
		scanner.close();
	}
}
