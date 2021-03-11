/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  */



programa
{

inclua biblioteca Matematica --> mat
    funcao inicio()
    {
    real salario, somaSalario=0.0, somaFilhos=0.0,mediaSalario=0.0, mediaFilhos=0.0, 
    maiorSalario=0.0, percentual=0.0
    inteiro filhos //numero de filhos de cada um 
    const inteiro HABITANTES = 3



        para (inteiro contador= 1; contador<= HABITANTES; contador ++)
        {
                escreva("Informe o seu salário:")
                leia (salario)
                escreva("Informe o numero de filhos:")
                leia(filhos)
                somaSalario = somaSalario + salario
                somaFilhos = somaFilhos + filhos

                se(salario>maiorSalario){
                    maiorSalario=salario 
                }

                se(salario<=100){
                    percentual++
                }
        }
                mediaSalario= somaSalario/HABITANTES
                mediaFilhos= somaFilhos/HABITANTES

                percentual=(percentual/HABITANTES)*100

                escreva("A média de salario é ", mat.arredondar(mediaSalario, 2),
                "\n A média de filhos é ", mat.arredondar(mediaFilhos, 2),
                "\n O maior salario é ", maiorSalario,
                "\n O percentual de salarios até 100 é ", percentual)


    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */