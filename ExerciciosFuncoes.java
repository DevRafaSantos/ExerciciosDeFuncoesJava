        /* > Exercicio 1: Funcao para converter temperatura
            Crie uma funcao que converta uma temperatura de Celsius para Fahrenheit.
            A funcao deve receber a temperatura em Celsius como argumento e retornar
            o valor correspondente em Fahrenheit.
            Exiba o resultado encapsulado em uma variável.

            > Exercicio 2: Funcao para calcular o fatorial de um número
             Crie uma funcao que calcule o fatorial de um número inteiro.
             Teste a funcao com um número de sua escolha.

            > Exercicio 3: Funcao com if-else para verificar paridade
             Crie uma funcao que receba um número inteiro e retorne uma string
             indicando se o número é "Par" ou "Ímpar".
             Use condicionais if-else para determinar a paridade.

            > Exercicio 4: Funcao com switch para classificar notas
            Crie uma funcao que receba uma nota de 0 a 10 e retorne
            uma classificação de letra (A, B, C, D, F) usando um switch.
            A = 10 e 9
            B = 8
            C = 7
            D = 6
            E = < 6
            Inclua uma verificação para garantir que a nota está dentro do intervalo válido.

            > Exercicio 5: Funcao com System.exit para Verificar Idade
             Crie uma funcao que receba a idade de uma pessoa.
             Se a idade for menor que 18 anos, use System.exit(0) para encerrar o programa
             com uma mensagem de "Acesso negado".
             Caso contrário, exiba "Acesso permitido".

            > Exercicio 6 (Desafio): Funcao que recebe um array e retorna o maior numero
              Crie um funcao que receba um array de inteiros e retorne
              o maior número presente no array.
              Utilie um loop para percorrer os elementos do array e identificar o maior valor.
            
         

         */


package secao8;


public class ExerciciosFuncoes {
    public static void main(String[] args) {

        // Execucoes:
        // >> Exercício 1:

        double celsius = 25.0;
        double fahrenheit = converterTemperatura(celsius);
        System.out.println("A temperatura de " + celsius + "C é equivalente a " + fahrenheit + "F");

        // >> Exercicio 2:
        System.out.println("O fatorial de 10 é: " + calcularfatorial(10));

        // >> Exercicio 3:
        System.out.println(verificarParidade(10));
        System.out.println(verificarParidade(11));

        // >> Exercicio 4:
        System.out.println(classificarNota(11));
        System.out.println(classificarNota(10));
        System.out.println(classificarNota(8));
        System.out.println(classificarNota(3));

        // >> Exercicio 5:
        verificarIdade(17);
        verificarIdade(55);

        // >> Exercicio 6:
        int[] numeros = {10, 5, 22, 44, 5};
        System.out.println(encontrarMaior(numeros));


        
    }

    // Funções:
    // Funcao Exercicio 1:
    public static double converterTemperatura(double celsius) {

        return (celsius * 9/5) + 32;
    }

    // Funcao Exercicio 2:
    public static int calcularfatorial(int numero) {
        if(numero == 0 || numero == 1) {
            return 1;

        } else {
            return numero * calcularfatorial(numero -1);
        }
    }

    // Funcao Exercicio 3:
    public static String verificarParidade(int paridade) {
        if(paridade % 2 == 0) {
            return "O número " + paridade + " é par!";

        } else {
            return "O número " + paridade + " NÃO é par!";
        }
    }

    // Funcao Exercicio 4:
    public static String classificarNota(int nota) {
        if(nota < 0 || nota > 10) {
            return "Nota inválida!";
        }

        switch(nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";

        }
    }

    // Funcao Exercicio 5:
    public static void verificarIdade(int idade){
        if(idade < 18) {
            System.out.println("Acesso negado!");
            
            
        }

            System.out.println("Acesso permitido!");
            System.exit(0);
    }

    // Funcao Exercicio 6:
    public static int encontrarMaior(int[] numeros) {
        
        int maior = numeros[0];

        for(int i = 1; i < numeros.length; i++) {
            if(numeros [i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }
    

}
