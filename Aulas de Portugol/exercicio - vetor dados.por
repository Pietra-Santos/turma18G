/*2-Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/

programa{
inclua biblioteca Util
    funcao inicio() {
    inteiro dado[10], maiornumero=0
    real media, soma=0.00, vezes=0.00
    para(inteiro x=0; x<10; x++){
    dado[x] = Util.sorteia(1,6)
    se (dado[y] maiornumero){
        maiornumero=dado[x]
        }
    } 
    para (inteiro y=0; y<10; y++)
    escreva("\nvalor: ",dado[y],"\n")
    soma=soma+dado[y]
    se (dado[y] ==maiornumero){
        vezes=vezes+1
        }
    }
    escreva("quantidade de vezes que o numero apareceu maior é: ",vezes)
    media=soma/10
    escreva("a media é ",media)
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */