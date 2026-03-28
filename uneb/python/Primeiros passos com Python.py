		#Imprimir mensagem no Python:
	print("Olá mundo!")

		#Add um número para realização de alguma conta:
	print(7+4) # vai imprimir 11;
	print('7'+'4') #vai imprimir '74';

		#Recebendo variáveis:
	nome = 'Henrique'
	idade = 25
	peso = 75.8
          print(nome, idade, peso)

	    #Recebendo o valor da variáveis do console:
	nome = input('Qual o seu nome?')
	idade = input('Qual a sua idade?')
	peso = input ('Qual o seu peso?')

		#Desafio 1: Crie um script python que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas de acordo com o valor digitado:

	nome = input('Qual o seu nome?')
         print ('Olá' + nome +'! Prazer em te conhecer!')

		#Desafio 2: Crie um script python que leia o dia, o mês e o ano de nascimento de uma pessoa e mostre a data formatada;

	dia = input('Dia =')
	mes = input('Mês =')
	ano = input('Ano =')
         print(' Você nasceu no dia ' +dia + 'de '+mes +'de '+ ano +'. Correto?')

	    #Desafio 3: Crie um script python que leia dois numeros e tente mostrar a soma entre eles:
	x = input('Primeiro numero: ')
	y = input(segundo numero:')
	soma = x + y
         print(x+y)
         print ('O resultado da soma dos dois n° é: '+soma)

	    #Pegando os valores digitados pelo usuário e somando.
n1 = int(input('Digite um valor: '))
n2 = int(input('Digite um valor: '))
s = n1 + n2

  		#print ('A soma vale', s); Contatenando
  		#print ('A soma entre', n1, 'e', n2 'vale', s)
	print ('A soma entre {} e {} vale {}'.format(n1, n2, s))
