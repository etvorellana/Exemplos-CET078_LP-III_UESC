
import random as rdn

def main():
    print("Teste do jogo das três portas.")
    print("Segundo a Wikipedia: https://pt.wikipedia.org/wiki/Problema_de_Monty_Hall")
    print(' " O problema de Monty Hall, também conhecido por paradoxo de Monty Hall é um" ')
    print(' "problema matemático e paradoxo que surgiu a partir de um concurso televisivo" ')
    print(' "dos Estados Unidos chamado Let’s Make a Deal, exibido na década de 1970." ')
    print(" ")
    print(' " O jogo consistia no seguinte: Monty Hall, o apresentador, apresentava três" ')
    print(' "portas aos concorrentes. Atrás de uma delas estava um prêmio (um carro) e, " ')
    print(' "atrás das outras duas, dois bodes." ')
    print(' "  Na 1.ª etapa o concorrente escolhe uma das três portas (que ainda não é aberta);" ')
    print(' "  Na 2.ª etapa, Monty abre uma das outras duas portas que o concorrente não" ')
    print(' "  escolheu, revelando que o carro não se encontra nessa porta e revelando um" ')
    print(' "  dos bodes;" ')
    print(' "  Na 3.ª etapa Monty pergunta ao concorrente se quer decidir permanecer com a " ')
    print(' "  porta que escolheu no início do jogo ou se ele pretende mudar para a outra " ')
    print(' "  porta que ainda está fechada para então a abrir. Agora, com duas portas apenas" ')
    print(' "  para escolher — pois uma delas já se viu, na 2.ª etapa, que não tinha o prêmio" ')
    print(' "  — e sabendo que o carro está atrás de uma das restantes duas, o concorrente tem" ')
    print(' "  que tomar a decisão." ')
    print(' " Qual é a estratégia mais lógica? Ficar com a porta escolhida inicialmente ou mudar" ')
    print(' "de porta? Com qual das duas portas ainda fechadas o concorrente tem mais " ')
    print(' "probabilidades de ganhar? Por quê?" ')
    print(" ")
    print(" Vamos mostrar como funciona:")
    print("Coloquei um premio em uma das três portas disponíveis.")
    print("Escolha uma porta")
    choice = input("A, B u C:")
    print("Vicê escolheu ", choice)
    premioNaPorta = rdn.randint(1, 3)
    mudar = input("Vc quer mudar de porta (s/n): ")
    portas = {1:"A", 2:"B", 3:"C"}
    print("O premio esta na porta ", portas[premioNaPorta])
    if (choice.upper() == portas[premioNaPorta]):
        if (mudar.lower() == "s"):
            print("Você perdeu! kkkkkkkk (;-)")
        else:
            print("Você ganhou, PARABENS!!!!!!")
    elif (mudar.lower() == "n"):
        print("Você perdeu! kkkkkkkk (;-)")
    else:
        print("Você ganhou, PARABENS!!!!!!")

    print("Vou simular 1000 jogos para vc.")
    N = 10000 # número de repetições
    jogador_muda = 0
    jogador_fica = 0
    for i in range(N):
        premioNaPorta = rdn.randint(1, 3)
        choice = rdn.randint(1, 3)
        if (portas[premioNaPorta] == portas[choice]):
            jogador_fica += 1
        else:
            jogador_muda += 1
    print("Jogador que fica ganhou ", jogador_fica, " Vezes (", (jogador_fica/N), ")")
    print("Jogador que muda ganhou ", jogador_muda, " Vezes (", (jogador_muda/N), ")")

main()
