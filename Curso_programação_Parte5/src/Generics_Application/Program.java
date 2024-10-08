/*
 * ESTE PROGRAMA DEMONSTRA O USO DE GENERICS EM JAVA.
 * ELE PERMITE AO USUÁRIO INSERIR UM CONJUNTO DE VALORES INTEIROS E, EM SEGUIDA,
 * IMPRIME TODOS ESSES VALORES EM ORDEM E RETORNA O PRIMEIRO ELEMENTO DA LISTA.
 * 
 * A CLASSE PrintService UTILIZA O CONCEITO DE GENERICS PARA PODER TRABALHAR COM
 * QUALQUER TIPO DE DADO (NESTE CASO, NÓS USAMOS INTEGER).
 * 
 * FLUXO DA APLICAÇÃO:
 * 1. O USUÁRIO INFORMA QUANTOS VALORES DESEJA INSERIR.
 * 2. O PROGRAMA LÊ OS VALORES E OS ADICIONA À LISTA UTILIZANDO O PrintService.
 * 3. OS VALORES SÃO IMPRIMIDOS EM FORMATO DE LISTA.
 * 4. O PRIMEIRO VALOR DA LISTA É RETORNADO E EXIBIDO.
 */
package Generics_Application;

import java.util.Scanner;
import Generics_Services.PrintService;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CRIAÇÃO DE UM OBJETO PrintService DO TIPO INTEGER (USO DE GENERICS)
        PrintService<Integer> ps = new PrintService<>();

        // SOLICITA AO USUÁRIO QUANTOS VALORES ELE DESEJA INSERIR
        System.out.print("How many values? ");
        int n = sc.nextInt();  // ARMAZENA O NÚMERO DE VALORES

        // LAÇO PARA RECEBER OS VALORES DO USUÁRIO E ADICIONÁ-LOS AO PrintService
        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();  // LÊ O PRÓXIMO VALOR
            ps.addValue(value);  // ADICIONA O VALOR À LISTA
        }

        // IMPRIME OS VALORES ARMAZENADOS NA LISTA USANDO O MÉTODO print() DO PrintService
        ps.print();

        // OBTÉM E IMPRIME O PRIMEIRO VALOR DA LISTA USANDO O MÉTODO first()
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
