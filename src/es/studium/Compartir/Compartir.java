package es.studium.Compartir;

import java.util.Scanner;

public class Compartir
{
		Scanner teclado = new Scanner (System.in);
	int variable;
	
	Compartir()
	{
		variable = 0;
	}
	Compartir(int v)
	{
		variable = v;
	}
	
	public int getVariable()
	{
		return variable;
	}
	public void setVariable(int variable)
	{
		this.variable = variable;
	}
	public static void main(String[] args)
	{
		Compartir objeto = new Compartir(33);
		System.out.println(objeto.getVariable());
	}
}