using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{

	//Declarando variáveis;
		double a, b;

	//Abrindo o console para o usuário digitar;
			a = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
			b = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

	//Realizando operação;
		double media = (a *3.5 + b *7.5)/11;

	//Imprimindo o resultado;
		Console.WriteLine("MEDIA = "+ media.ToString("F5", CultureInfo.InvariantCulture));
    }
}
