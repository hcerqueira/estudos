using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{
		int tempo, velMedia;
		int kmPorLitro = 12;
			tempo = int.Parse(Console.ReadLine());
			velMedia = int.Parse(Console.ReadLine());

	//Primeiro se realiza o calculo da distancia;
		double distancia = tempo * velMedia;

	//Em seguida o consumo, lembrando que Km por litro é um valor constante, igual a 12.
		double qtdLitros = distancia / kmPorLitro;

	//Imprimindo o resultado do consumo.
		Console.WriteLine(qtdLitros.ToString("F3"), CultureInfo.InvariantCulture);

	}
}
