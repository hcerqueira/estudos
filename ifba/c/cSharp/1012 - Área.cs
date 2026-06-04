using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{

	//Iniciando variáveis;
		double a, b, c, d, tri, qua, cir, ret, tra;

	//Pegando os valores;
		  String[] vet = Console.ReadLine().Split(' ');
			a = double.Parse(vet[0], CultureInfo.InvariantCulture);
			b = double.Parse(vet[1], CultureInfo.InvariantCulture);
			c = double.Parse(vet[2], CultureInfo.InvariantCulture);

	//Realizando o calculo;
		double pi = 3.14159;
		d = a + b;
		tri = 0.5 * a * c; //base x altura dividido por 2;
		cir = pi * (Math.Pow(c, 2)); //pi x raio²;
		tra = d * c / 2; //(base + base) x altura dividido por 2;
		qua = Math.Pow(b, 2); //Lado²;
		ret = b * a; //bas x altura;

	//Imprimindo resultado;
		Console.WriteLine("TRIANGULO: "+tri.ToString("F3"), CultureInfo.InvariantCulture);
		Console.WriteLine("CIRCULO: "+cir.ToString("F3"), CultureInfo.InvariantCulture);
		Console.WriteLine("TRAPEZIO: "+tra.ToString("F3"), CultureInfo.InvariantCulture);
		Console.WriteLine("QUADRADO: "+qua.ToString("F3"), CultureInfo.InvariantCulture);
		Console.WriteLine("RETANGULO: "+ret.ToString("F3"), CultureInfo.InvariantCulture);
    }
}
