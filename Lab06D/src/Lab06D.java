//Matteo Cordray
//December 11th, 2017
//Lab 06D

import java.io.IOException;

import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

import java.lang.Math;

public class Lab06D {
	public static void main( String args[] ) throws IOException {

		// write a program to read in the data file and process each line
		Scanner file = new Scanner(new File ("resources/Lab06D.dat"));	//open dat file
		while(file.hasNext()) {
			int num1 = file.nextInt();
			Prime thing = new Prime(num1);								//instantiate new Prime object
			out.println("Number: " + num1);
			out.println("is Prime: " + thing.isPrime());
			out.println("is Perfect: " + thing.isPerfect());
		}
		out.println("\nProcess completed");
		



	}
}
