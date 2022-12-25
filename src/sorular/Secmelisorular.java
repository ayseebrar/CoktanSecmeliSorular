package sorular;

import java.util.Scanner;

public class Secmelisorular {

	public static void main(String[] args) {
		String s1;
		String s2;
		String s3;
		String s4;
		String s5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Yakın mesafelere giderken otomobil/toplu taşıma araçları kullanmak yerine yürümeyi/bisiklete binmeyi tercih ederim.");
		String s1s[] = {"1\n", " 2\n","3\n","4\n", "5\n","6\n","7\n"};
		for(int counter=0; counter<s1s.length; counter++) {
			 System.out.printf(s1s[counter]); }
		System.out.print("Degerlendiriniz...");
		s1=sc.nextLine();
		
		System.out.println("Hangisi küresel ısınmanın bir etkisi olabilir?");
		String s2s[] = {"A-Deniz seviyesinin yükselmesİ\n" ,"B-Daha fazla ada tarımı\n","C-Daha çok volkanik püskürme\r\n", " D-Daha fazla heyelan gerçekleşmesi\n"};
		for(int counter=0; counter<s2s.length; counter++) {
			 System.out.printf(s2s[counter]); }
		System.out.print("Cevabinizi giriniz..");
		s2=sc.nextLine();
		if(s2.equals("A")) {
			System.out.print("Dogru");
		}
		else {
			System.out.print("Yanlis");
		}
		System.out.println("Bunlardan hangisi toksik bir sera gazıdır?");
		String s3s[] = {"A-Nitrojen\r\n", "B-Oksijen\r\n" ," C-Karbonmonoksit\r\n","D-Metan"};
		for(int counter=0; counter<s3s.length; counter++) {
			 System.out.printf(s3s[counter]); }
		System.out.print("Cevabinizi giriniz..");
		s3=sc.nextLine();
		if(s3.equals("A")) {
			System.out.print("Dogru");
		}
		else {
			System.out.print("Yanlis");
		}
		System.out.println(" Kirlilik havaya yayıldıkça ne azalır?");
		String s4s[] = {"A-Ozon tabakası\r\n","B-Okyanuslar\r\n","C-Yağmur ormanları\r\n","D,Karbondioksit"};
		for(int counter=0; counter<s4s.length; counter++) {
			 System.out.printf(s4s[counter]); }
		System.out.print("Cevabinizi giriniz..");
		s4=sc.nextLine();
		if(s4.equals("A")) {
			System.out.print("Dogru");
		}
		else {
			System.out.print("Yanlis");
		}
				
		
		System.out.println(" Aşağıdakilerden hangisi küresel ısınmanın olumsuz bir etkisi değildir?");
		String s5s[] = {"A-Daha büyük balık nüfusu.\r\n","B-Yeni bulaşıcı hastalıkların ortaya çıkması.\r\n","C-Türlerin yok olması.\r\n","D-Kıyı alanlarının kaybı."};
		for(int counter=0; counter<s5s.length; counter++) {
			 System.out.printf(s5s[counter]); }
		System.out.print("Cevabinizi giriniz..");
		s5=sc.nextLine();
		if(s5.equals("A")) {
			System.out.print("Dogru");
		}
		else {
			System.out.print("Yanlis");
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
