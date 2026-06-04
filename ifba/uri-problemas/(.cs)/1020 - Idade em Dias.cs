using System;

public class Program
{
	public static void Main()
	{
		int idade;
			idade = int.Parse(Console.ReadLine());

			int ano = idade / 365;
			int mes = ((idade % 365)/30);
			int dias = (idade % 365) % 30;

			Console.WriteLine(ano +" ano(s)");
			Console.WriteLine(mes +" mes(es)");
			Console.WriteLine(dias +" dia(s)");
	}
}
