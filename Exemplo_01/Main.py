def main():
    # definindo o ponto médio
    pontoMedio = 5

    # criando duas listas vazias
    menores = []; maiores = []

    # Separando os números entre menores e maiores
    for i in range(10):
        if(i < pontoMedio):
            menores.append(i)
        else:
            maiores.append(i)

    print("menores:", menores)
    print("maiores:", maiores)

main()
