using System;

public class Program
{
	public static void Main()
	{
				//Iniciando variável(is);
			int s;  //Em segundos.
			int horas, minutos, segundos;
				//Abrindo o Console p/ o usuário;
		s = int.Parse(Console.ReadLine());

		//Cálculo do valor recebido;

			horas = s / 3600; //Para converter em HORAS basta dividir o valor dado em SEGUNDOS por 3600;
		minutos = s % 3600 / 60; //Para converter para MINUTOS, pegamos o resto de 3600 e dividimos por 60;
			segundos = s % 60; //Já para pegar o valor em SEGUNDOS, basta ver o "resto" de MINUTOS
		s = segundos - horas * 3600;

		//Impressão dos resultados;
			Console.WriteLine(horas +":"+ minutos +":"+segundos);
	}
}
