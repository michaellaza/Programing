package com.Lab;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class Lab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 byte i;
		 byte j=0;
		 short a[];
		 a = new short[(15 - 2) +1];
		 for(i=15;i>=2;i--)
		 {
			a[j] = i;
			j++;
		 }	 
		 System.out.println(Arrays.toString(a));
	     float x[];
		 x = new float[19];
		 for(i=0;i<19;i++)
		 {
			 x[i] = (float)((Math.random()*19)-9);
		 }
		 System.out.println(Arrays.toString(x));
		 double p[][];
		 p = new double[14][19];
		 for(i=0;i<14;i++)
		 {
			 for(j=0;j<19;j++)
			 {
				 switch(a[i])
				 {
				 case 6:
				 {
					 p[i][j] =   (Math.pow(Math.log(Math.pow(((2*(Math.PI)) * (Math.abs(x[j] +1))), 2)), 3))/(0.5);
					 break;
				 }
				 case 5:
				 case 7:
				 case 8:
				 case 10:
				 case 12:
				 case 13:
				 case 15:
				 {
					 p[i][j] =   Math.log(Math.exp(Math.tan(Math.pow((x[j]/2),3))));
					 break;
				 }
				 default:
				 {
					 p[i][j] =    Math.tan(Math.exp(Math.log(Math.abs(x[j]))));
					 break;
				 }
				 }
				 System.out.printf("%6.2f",p[i][j]);
			 } 
		 }
		 sc.close();
	 }
}
