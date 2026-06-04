using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{

		double raio, volume;
		double pi = 3.14159;
			raio = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
			//raio = Math.Pow(raio, 3);

	//Realizando o calculo;
		volume = (4.0/3) * pi * (raio*raio*raio);

	//Imprimindo resultado;
		Console.WriteLine("VOLUME = " +volume.ToString("F3", CultureInfo.InvariantCulture));
	}
}
