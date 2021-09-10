package com.java;
import java.util.Arrays;
import java.lang.Math;
public class Lab1 {
	public static void main(String[] args) {
		byte i;
		byte j = 0;
		long a[];
		a = new long[(21-1)/2 +1];
		for(i=1;i<=21;i++)
		{
			if(i%2!=0)
			{
				a[j] = i; 
			}
			else
			{
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
		double x[];
		x = new double[12];
		for(i=0;i<12;i++)
		{
			x[i] = (double)(Math.random()*13) - 6;
		}
		System.out.println(Arrays.toString(x));
		double g[][];
		g = new double [11][12];
		for(i=0;i<11;i++)
		{
			for(j=0;j<12;j++)
			{
				switch((int)a[i])
				{
				case 19:
				{
					g[i][j] = Math.pow((1/3) * (1 - (Math.pow(Math.cos(x[j]), (Math.exp(x[j]))/2))), Math.log((Math.abs(x[j]))/5));
					break;
				}
				case 3:
				case 5:
				case 7:
				case 9:
				case 21: 
				{
					g[i][j] = Math.cos(Math.sin(Math.pow((x[j]/((1/2)-x[j])), 3)));
					break;
				}
				default:
				{
					 
					g[i][j] = Math.asin(1/(Math.exp((Math.pow(Math.sin(Math.tan(Math.cbrt(x[j]))), 2)) * (Math.pow(Math.PI + Math.sqrt(Math.pow(Math.tan(x[j]), 2)), 2)))));
					break;
				}
				
				
				}
				System.out.printf("%6.2f",g[i][j]);	
			}
			
		}
		
		 
	}

	}

 
