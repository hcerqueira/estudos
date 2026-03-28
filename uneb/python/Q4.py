'''
Lista de exercícios n° 1 
    Professor: Marcos Simões
    Disciplina: Algoritmos
    Resolvida em Python e pseudo-código por: @author Carlos Henrique
    
    Questão 4: 
        Dado um número inteiro N, indique se ele é, ou não, um palíndromo e imprima uma mensagem que informe isso.
        Números palíndromos são aqueles que possuem o primeiro dígito igual
        ao último dígito, o segundo igual ao penúltimo e assim por diante. 
        
        Por exemplo, o número 2552 é um palíndromo, mas o número 2525 não é. 
        
'''


# Leia um numero inteiro 
numero = int(input("Digite um número: "))

# Escreva (...)
print ("Você digitou o numero {} ".format(numero))
auxiliar = numero 
inverso = 0
  
while (auxiliar != 0):
      inverso = inverso * 10 + auxiliar % 10    # Acrescenta mais um digito
      auxiliar = auxiliar / 10                  # Joga fora esse digito
      
     if (reverso == numero):
        print ("É palíndromo: ", numero)
    
     else:
        print("Não é palíndromo: ", numero)
