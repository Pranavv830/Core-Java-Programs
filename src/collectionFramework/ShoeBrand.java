package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoeBrand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter brand name of shoe");
		String ip = sc.next();
		
		ArrayList sb1 = new ArrayList<>();
		sb1.add("Aadidas");
		sb1.add("nike");
		sb1.add("puma");
		sb1.add("redchiep");
		sb1.add("bata");
		
		if (sb1.remove(ip)) {
			System.out.println("removed");
			System.out.println(sb1);
		}
		else {
			System.out.println("brand not found");
		}
		
	}
}
