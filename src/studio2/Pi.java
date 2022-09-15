package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("How many times do you want to run it :)");
		int numOfSimul=in.nextInt();
		double x=0.0;
		double y=0.0;
		int timesOfIn=0;
		for (int i=0; i< numOfSimul
				; i++) {
			x=Math.random();
			y=Math.random();
			if ((Math.pow((x-0.5),2)+Math.pow((y-0.5),2))<=0.25){
				timesOfIn++;
			}
		}
		System.out.println(timesOfIn);
		System.out.println("pi= "+((double)(timesOfIn*4))/((double)numOfSimul));
		// TODO Auto-generated method stub

	}

}
