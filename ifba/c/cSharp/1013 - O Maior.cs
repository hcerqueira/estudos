using System;

public class Program
{
	public static void Main()
	{

	//Iniciando variáveis;
		int a, b, c;

	//Pegando os valores;
		  String[] vet = Console.ReadLine().Split(' ');
			a = int.Parse(vet[0]);
			b = int.Parse(vet[1]);
			c = int.Parse(vet[2]);

	      int maiorAB = (a+b+Math.Abs(a-b))/2;
		  int maiorABC = (maiorAB+c+Math.Abs(maiorAB-c))/2;
			Console.WriteLine(maiorABC + " eh o maior");

    }
}
