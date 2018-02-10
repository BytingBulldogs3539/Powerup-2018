package org.usfirst.team3539.generator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	FileWriter fileWriter;
	PrintWriter printer;
	String pack;
	String className;

	Main() throws IOException
	{
		fileWriter = new FileWriter("C:\\Users\\3539\\Desktop\\elliotIsTrash.java");
		printer = new PrintWriter(fileWriter);
	}

	public static void main(String args[]) throws IOException
	{
		Main run = new Main();
		run.getInput();
		run.output();
	}

	public void output() throws IOException
	{
		printer.println("package " + pack + ";");
		printer.println("public class " + className + "{");

		for (int x = 1; x <= 100; x++)
			printTheLine(x, x + 1, x + 2);

		printer.print("}");
		printer.close();
		System.out.println("The file has been written to.");
	}

	public void printTheLine(double num1, double num2, double num3)
	{
		printer.println("\t{" + num1 + ",\t" + num2 + ",\t" + num3 + "},");
	}

	public void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Package: ");
		pack = scan.nextLine();
		System.out.print("Class name: ");
		className = scan.nextLine();

		scan.close();
	}
}
