
//package lab1;

import java.util.Scanner;
public class TipoTriangulo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        float lado1 = scan.nextFloat();
        
        System.out.print("");
        float lado2 = scan.nextFloat();
        
        System.out.print("");
        float lado3 = scan.nextFloat();
        
        
        
        
        	
        if((lado1<0)||(lado2<0)||(lado3<0)) {
        		System.out.println("invalido");
        	}
        	else if(lado3>lado1+lado2 || lado1>lado2+lado3||lado2>lado1+lado3){
        		System.out.println("invalido");
        	}
        		else if(lado1==1 && lado2==2 && lado3==3) {
        			System.out.println("invalido");
        		}
        	
        
        		else if((lado1==lado2)&&(lado1==lado3)&&(lado2==lado3)){
        			System.out.println("equilatero");}
        		
    				else if(!(lado1==lado2 || lado1==lado3||lado2==lado3)){
    					System.out.println("escaleno");}
    					else {
    						System.out.println("isosceles");}
        
    }
          
    }

    