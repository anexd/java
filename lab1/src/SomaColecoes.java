//package lab1;

import java.util.Scanner;
public class SomaColecoes {
	public static void main(String[] args) {
		int acm = 0;
		int acm2 = 0;
		int acm3 = 0;
		int num[] = new int[4];
		int num2[] = new int[4];
		int num3[] = new int[4];

		Scanner entrada = new Scanner(System.in);
		
		
		for(int i=0;i<num.length; i++){
		    while(num[i]!=-1){
		        System.out.printf("");
			    num[i]=entrada.nextInt();
	            acm = acm + num[i];
		    }
		    break;
		}
		for(int i=0;i<num2.length; i++){
		    while(num2[i]!=-1){
		        System.out.printf("");
			    num2[i]=entrada.nextInt();
	            acm2 = acm2 + num2[i];
		    }
		    break;
		}
		for(int i=0;i<num3.length; i++){
		    while(num3[i]!=-1){
		        System.out.printf("");
			    num3[i]=entrada.nextInt();
	            acm3 = acm3 + num3[i];
		    }
		    break;
		}
	    System.out.println(acm+1);
	    System.out.println(acm2+1);
	    System.out.println(acm3+1);

	}
}	

