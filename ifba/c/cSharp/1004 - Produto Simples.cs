using System;

public class Program
{
	public static void Main()
	{
	//Declarando variáveis;
		int a, b;
	//Abrindo o console para o usuário digitar;
			a = int.Parse(Console.ReadLine());
			b = int.Parse(Console.ReadLine());
	//Realizando operação;
		int prod = a*b;
	//Imprimindo o resultado;
		Console.WriteLine("PROD = "+ prod);
	}
}
