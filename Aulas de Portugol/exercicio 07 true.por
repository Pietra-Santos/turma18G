programa
{

    funcao inicio()
    {

        real base, altura, area

        escreva("Informe a base: ")
        leia(base)

        escreva("Informe a altura: ")
        leia(altura)

        se ((base > 0) e (altura > 0)) 
        {
            area = (base * altura) / 2
            escreva("O valor da área do triângulo é de ", area)
        } 
        senao 
        {
            escreva("Os valores informados são inválidos")
        }

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */