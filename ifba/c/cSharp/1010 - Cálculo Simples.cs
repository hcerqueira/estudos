using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{
		int id1, id2, q1, q2;
		double v1, v2, calc;

	//Primeira linha
		String[] vet1 = Console.ReadLine().Split(' ');
		id1 = int.Parse(vet1[0]);
		q1 = int.Parse(vet1[1]);
		v1 = double.Parse(vet1[2], CultureInfo.InvariantCulture);

	//Segunda linha
		String[] vet2 = Console.ReadLine().Split(' ');
		id2 = int.Parse(vet2[0]);
		q2 = int.Parse(vet2[1]);
		v2 = double.Parse(vet2[2], CultureInfo.InvariantCulture);

	//Realizando o calculo;
		calc = (q1*v1) + (q2*v2);

	//Imprimindo resultado;
		Console.WriteLine("VALOR A PAGAR: R$ "+calc.ToString("F2", CultureInfo.InvariantCulture));
	}
}
