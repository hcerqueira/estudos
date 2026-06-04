

# 	Exercicio n° 0: 
#			Escreva um programa em Python que receba uma temperatura em °F e converta em °C
#			Faça a conversão e imprima o resultado.

# 	Resolução:	
print ('Olá, usuário, esse programa vai auxiliar você na conversão da temperatura de °F p/ °C.')
f = int(input('Digite uma temperatura em ° Fahrenheit: '))	
c = (f - 32) * 5 / 9
print ('Ok, realizamos o cálculo e a temperatura em ° Celsius é: ',c)

#----------------------------------------------------------------------------------------------------------

#	Exercicio n° 1: 
#			Faça um programa em Python que receba (entrada de dados) o valor correspondente ao lado de um quadrado, 
#			calcule e imprima (saída de dados) seu perímetro e sua área.

#	Resolução: 
lado = int(input('Digite o valor correspondente ao lado de um quadrado: '))
perimetro = lado * 4
area = lado ** 2
print('perímetro: ', perimetro, ' - ', 'área: ', area)

#----------------------------------------------------------------------------------------------------------

#	Execicio n° 2: 
#			Faça um programa em Python que receba quatro notas, 
#			calcule e imprima a média aritmética. 

#	Resolução: 
n1 = float(input('Digite a primeira nota: '))
n2 = float(input('Digite a segunda nota: '))
n3 = float(input('Digite a terceira nota: '))
n4 = float(input('Digite a quarta nota: '))
media = (n1+n2+n3+n4) / 4
print ('A média aritmética é: ', media)

----------------------------------------------------------------------------------------------------------

#	Execicio n° 3: 
#			Escreva um programa que receba (entrada de dados através do teclado) o nome do cliente, 
#			o dia de vencimento, o mês de vencimento e o valor da fatura e imprima (saída de dados) 
#			a mensagem com os dados recebidos, no mesmo formato da mensagem acima. Note que o programa 
#			imprime a saída em duas linhas diferentes. Note também que, como não é preciso realizar cálculos, 
#			o valor não precisa ser convertido para número, pode ser tratado como texto.

#	Resolução: 
nome = str(input('Digite o nome do cliente: '))
dia = str(input('Digite o dia de vencimento: '))
mes = str(input('Digite o mês de vencimento: '))
valor = str(input('Digite o valor da fatura: '))

print ('Olá, ',nome)
print ('A sua fatura com vencimento em ', dia, ' de ', mes, 'no valor de R$', valor, 'está fechada.')

#----------------------------------------------------------------------------------------------------------

#	Exercicio n° 4: 
#			Faça um programa em Python que recebe um número inteiro e imprime seu dígito das dezenas. 
	

#	Resolução: 
numero = int(input('Digite um número inteiro:'))
unidade = numero % 10
    # Eliminando a unidade de nosso número
numero = (numero - unidade)/10
dezena = numero % 10
    # Eliminando a dezena do número original, fica a centena
numero = (numero - dezena)/10
centena = numero
    # Fazendo ser inteiros
dezena = int(dezena)
centena = int(centena)
print(centena,'centena(s),',dezena,'dezena(s) e',unidade,'unidade(s)')
	
#----------------------------------------------------------------------------------------------------------

#	Exercicio n° 5: 
#			Reescreva o programa contaSegundos para imprimir também a quantidade de dias, ou seja, 
#			faça um programa em Python que, dada a quantidade de segundos, "quebre" esse valor em 
#			dias, horas, minutos e segundos. A saída deve estar no formato: a dias, b horas, c minutos e d segundos. 
#			Seja cuidadoso com o formato! 

#	Resolução: 
s = int(input("Por favor, entre com o número de segundos que deseja converter: "))
d = s // 86400
s_rest = s % 86400
h = s_rest // 3600
s_rest = s_rest % 3600
m = s_rest // 60
s_rest = s_rest % 60
print(d,"dia(s),",h,"hora(s),",m,"minuto(s) e",s_rest,"segundo(s).")

#----------------------------------------------------------------------------------------------------------

#	Exercicio n° 6: 
#			