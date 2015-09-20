/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/DOUGHNUT/
 */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner Liczba = new Scanner(System.in);
		
		int t = Liczba.nextInt();
		for(int i=0; i<t;i++)
		{
		int c = Liczba.nextInt();
		int k = Liczba.nextInt();
		int w = Liczba.nextInt();
		if ( k >= c*w)
		{
		System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
		
		Liczba.close();

	}

}

