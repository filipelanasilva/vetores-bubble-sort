
import java.util.Scanner;  // importa a classe Scanner para a possibilitação da chamada de seus respectivos objetos e métodos

public class VetoresBubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // criação de variável para aceitar valores vindos do usuário

        int[] vetorInt = new int[5];  // vetor do tipo int com 5 posições definidas, a primeira denominada 0 e a última denominada 4

        for (int i = 0; i < vetorInt.length; i++) {  // o loop repetirá até a posição denominada 4 de vetorInt

            System.out.print("Digite um número aleatório: ");
            vetorInt[i] = scanner.nextInt();  // número digitado pelo usuário será atribuído a posição (i) de vetorInt

        }

        System.out.println();

        String[] vetorString= new String[5];  // vetor do tipo String com 5 posições definidas, a primeira denominada 0 e a última denominada 4

        for (int i = 0; i < vetorString.length; i++) {  // o loop repetirá até a posição denominada 4 de vetorString

            System.out.print("Digite uma palavra aleatória: ");
            vetorString[i] = scanner.next();  // número digitado pelo usuário será atribuído a posição (i) de vetorString

        }

        scanner.close();

        System.out.println("\nVETOR NÚMERICO ORDENADO DE MODO CRESCENTE:");
        ordenaVetorIntCrescente(vetorInt);  // chamada de um método que ordenada de forma decrescente valores do tipo int de cada posição do vetor
                                            // usado como argumento
        System.out.println("\nVETOR NÚMERICO ORDENADO DE MODO DECRESCENTE:");
        ordenaVetorIntDecrescente(vetorInt);  // chamada de um método que ordenada de forma crescente valores do tipo int de cada posição do vetor
                                              // usado como argumento
        System.out.println("\nVETOR ALFABÉTICO ORDENADO DE MODO CRESCENTE:");
        ordenaVetorStringCrescente(vetorString);  // chamada de um método que ordena de forma alfabética crescente valores do tipo String de cada
                                                  // posição do vetor de A - Z, sendo A menor que as letras seguintes
        System.out.println("\nVETOR ALFABÉTICO ORDENADO DE MODO DECRESCENTE:");
        ordenaVetorStringDecrescente(vetorString);  // chamada de um método que ordena de forma alfabética crescente valores do tipo String de
                                                    // cada posição do vetor de A - Z, sendo A menor que as letras seguintes

    }


    private static void ordenaVetorIntCrescente(int[] vetor) {  // método que espera receber como argumento um vetor do tipo int

        for (int i = 0; i < vetor.length; i++) {  // o loop repetirá até a última posição do vetor atribuído a ela

            for (int j = i; j < vetor.length; j++) {  // o loop repetirá enquanto o valor de (i) que é atribuído a variável (j) for menor que a
                                                      // quantidade total de posições do vetor

                if (vetor[j] < vetor[i]) {  // se o valor da posição (j) de vetor for menor que o valor da posição (i) ▽ ▽

                    int aux = vetor[i];  // variável de auxílio que recebe o valor da posição (i) de vetor
                    vetor[i] = vetor[j];  // valor da posição (i) de vetor recebe o valor da posição (j)
                    vetor[j] = aux;  // valor da posição (j) de vetor recebe o valor da variável aux

                }

            }

        }

        exibeValorVetorInteiro(vetor);  // chamada de método para exibir valor de cada posição do vetor usado como argumento

    }

    private static void ordenaVetorIntDecrescente(int[] vetor) {  // método que espera receber como argumento um vetor do tipo int

        for (int i = 0; i < vetor.length; i++) {  // o loop repetirá até a última posição do vetor atribuído a ele

            for (int j = i; j < vetor.length; j++) {  // o loop repetirá enquanto o valor de (i) que é atribuído a variável (j) for menor que a
                                                      // quantidade total de posições do vetor

                if (vetor[j] > vetor[i]) {  // se o valor da posição (j) de vetor for maior que o valor da posição (i) ▽ ▽

                    int aux = vetor[i];  // variável de auxílio que recebe o valor da posição (i) de vetor
                    vetor[i] = vetor[j];  // valor da posição (i) de vetor recebe o valor da posição (j)
                    vetor[j] = aux;  // valor da posição (j) de vetor recebe o valor da variável aux

                }

            }

        }

        exibeValorVetorInteiro(vetor);  // chamada de método para exibir valor de cada posição do vetor usado como argumento

    }

    private static void exibeValorVetorInteiro(int[] vetor) {  // método que espera receber como argumento um vetor do tipo int

        for (int i = 0; i < vetor.length; i++) {  // o loop repetirá e mostrará no console os valores da primeira até a última posição do vetor
                                                  // atribuído a ela
            System.out.println(vetor[i]);

        }

    }



    private static void ordenaVetorStringCrescente(String[] vetor) {  // método que espera receber como argumento um vetor do tipo String

        for (int i = 0; i < vetor.length; i++) {  // o loop repetirá até a última posição do vetor atribuído a ele

            for (int j = i; j < vetor.length; j++) {  // o loop repetirá enquanto o valor de (i) que é atribuído a variável (j) for menor que a
                                                      // quantidade total de posições do vetor

                if (vetor[j].compareTo(vetor[i]) < 0) {  // se o valor resultante da comparação lexicográfica entre a posição (j) do vetor com o
                                                         // valor da posição (i) retornar um valor menor que zero ▽ ▽

                    String aux = vetor[i];  // variável de auxílio que recebe o valor da posição (i) de vetor
                    vetor[i] = vetor[j];  // valor da posição (i) de vetor recebe o valor da posição (j)
                    vetor[j] = aux;  // valor da posição (j) de vetor recebe o valor da variável aux

                }

            }

        }

        exibeValorVetorString(vetor);  // chamada de método para exibir valor de cada posição do vetor usado como argumento

    }

    private static void ordenaVetorStringDecrescente(String[] vetor) {  // método que espera receber como argumento um vetor do tipo String

        for (int i = 0; i < vetor.length; i++) {  // o loop repetirá até a última posição do vetor atribuído a ele

            for (int j = i; j < vetor.length; j++) {  // o loop repetirá enquanto o valor de (i) que é atribuído a variável (j) for menor que a
                                                      // quantidade total de posições do vetor

                if (vetor[j].compareTo(vetor[i]) > 0) {  // se o valor resultante da comparação lexicográfica entre a posição (j) do vetor com o
                                                         // valor da posição (i) retornar um valor menor que zero ▽ ▽

                    String aux = vetor[i];  // variável de auxílio que recebe o valor da posição (i) de vetor
                    vetor[i] = vetor[j];  // valor da posição (i) de vetor recebe o valor da posição (j)
                    vetor[j] = aux;  // valor da posição (j) de vetor recebe o valor da variável aux

                }

            }

        }

        exibeValorVetorString(vetor);  // chamada de método para exibir valor de cada posição do vetor usado como argumento

    }

    private static void exibeValorVetorString(String[] vetor) {  // método que espera receber como argumento um vetor do tipo String

        for (int i = 0; i < vetor.length; i++) {  // o loop repetirá e mostrará no console os valores da primeira até a última posição do vetor
                                                  // atribuído a ela
            System.out.println(vetor[i]);

        }

    }

}
