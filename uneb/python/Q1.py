'''
Lista de exercícios n° 1 
    Professor: Marcos Simões
    Disciplina: Algoritmos
    Resolvida em Python e pseudo-código por: @author Carlos Henrique
    
    Questão 1: 
        Dados dois números inteiros, X e Y, retorne a soma e a multiplicação entre eles. 
        Caso um dos valores seja igual a 0, imprima essa informação;
'''

# Observações: 
    # Sempre que você ver um 'Leia', 'Escreva' ou qualquer outra ação, entenda como uma ordem ao computador...
    # Por exemplo: Computador Leia o valor da variável num1 em inteiro (int(input)) e escreva na tela o resultado (print)
    # Abaixo ficará mais claro... eu espero. 

# Leia valor de *num1* em inteiro -- abrindo o teclado p/ o usuário digitar
num1 = int(input("Digite o primeiro número: "))

# leia valor de *num2* em inteiro -- abrindo o teclado p/ o usuário digitar
num2 = int(input("Digite o segundo número: "))

# Se (*num1* e *num2* são maiores que 0(Zero)): 
if (num1 > 0 and num2 > 0):
    
    # Realizando as operações simples: 
    soma = num1 + num2
    multi = num1 * num2

    # Escreva: ('A soma entre entre *num1* e *num2* é igual a *soma*, e a multiplicacao dos mesmos é igual a *multi*')
    print ("A soma entre {} e {} é {}, e a multiplicação dos mesmos é igual a {} ".format(num1, num2, soma, multi))

# Se não:
else:
    # Escreva: ('Os numeros informados não são maiores que 0 (Zero).)
    print ("Os números informados não são maiores que 0 (Zero).")
    

# Lembrando que nem sempre os comentários estarão bonitinhos assim, mas é somente pra entender de maneira rápida
# Mas a identação do código é importante em Python, minha dica é: Seja organizado e dará tudo certo (ou não)! 
