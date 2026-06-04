using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{
	//Declarando variáveis;
		double a, b, c;

	//Abrindo o console para o usuário digitar;
			a = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
			b = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
			c = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

	//Realizando operação;
		double media = (a * 2 + b * 3 + c * 5) / ( 3 + 2 + 5);

	//Imprimindo o resultado;
		Console.WriteLine("MEDIA = "+ media.ToString("f1", CultureInfo.InvariantCulture));
	}
}
