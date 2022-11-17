package cases;

import java.util.Scanner;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // 
		System.out.println("donner le jour : ");
		int day=sc.nextInt(); // lire à partir de la console 
		switch(day)
		{
		case 1:
			System.out.print("Lundi");
			break;
		case 2:
			System.out.print("Mardi");
			break;
		case 3:
			System.out.print("Mercredi");
			break;
		case 4:
			System.out.print("Jeudi");
			break;
		case 5:
			System.out.print("Vendredi");
			break;
		case 6:
			System.out.print("Samedi");
			break;
		case 7:
			System.out.print("dimanche");
			break;
		}

	}

}
