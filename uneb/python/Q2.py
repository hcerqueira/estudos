 '''
Lista de exercícios n° 1 
    Professor: Marcos Simões
    Disciplina: Algoritmos
    Resolvida em Python e pseudo-código por: @author Carlos Henrique
    
    Questão 2: Dadas duas posições em um plano cartesiano, descritas por dois números reais X e Y,
    Informe se os dois pontos estão na mesma posição ou em posições diferentes. 
        
'''

# Observações: 
    # Sempre que você ver um 'Leia', 'Escreva' ou qualquer outra ação, entenda como uma ordem ao computador...
    # Por exemplo: Computador Leia o valor da variável num1 em inteiro (int(input)) e escreva na tela o resultado (print)
    # Abaixo ficará mais claro... eu espero. 

# Leia valor de *num1* nos números Reais (Ex: -2.5, +2, 0.0001) -- abrindo o teclado p/ o usuário digitar
x = float(input("Digite a posição de X: "))

# Leia valor de *num1* nos números Reais (Ex: -2.5, +2, 0.0001) -- abrindo o teclado p/ o usuário digitar
y = float(input("Digite a posição de Y: "))

# Se x for maior que y:       
if (x > y): 
    # Escreva (Mensagem  abaixo...)
    print ("X e Y estão em posições diferentes, X está à frente de Y, pois é valor é maior. ")

# Se x for menor que y: 
elif (x < y): 
    # Escreva (Mensagem  abaixo...)
    print ("X e Y estão em posições diferentes, Y está à frente de X, pois é valor é menor. ")

# Se não:
else: 
    # Escreva (Mensagem  abaixo...)
    print ("X e Y estão na mesma posição!!!")


# Lembrando que nem sempre os comentários estarão bonitinhos assim, mas é somente pra entender de maneira rápida
# Mas a identação do código é importante em Python, minha dica é: Seja organizado e dará tudo certo (ou não)! 
