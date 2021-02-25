programa
{

    inclua biblioteca Matematica --> mat

    funcao inicio()
    {

        real peso = 0.0, excesso = 0.0, multa = 0.0

        escreva("Informe o peso de tomates: ")
        leia(peso)

        se (mat.arredondar(peso,0) > 50) {
            excesso = mat.arredondar(peso,0) - 50
            multa = excesso * 4
        } 

        escreva("O peso é de ", peso, ", o excesso é ", excesso, " e a multa é de R$ ", multa, " reais")

    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */