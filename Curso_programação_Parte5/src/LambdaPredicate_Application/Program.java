// CLASSE PRINCIPAL PARA EXECUTAR O PROGRAMA DE FILTRAGEM DE PRODUTOS
package LambdaPredicate_Application;

import java.util.ArrayList;
import java.util.List;
import GenericsDelimitados_Entities.Product;

public class Program {

    // EXERCÍCIO:
    // CRIAR UMA LISTA DE PRODUTOS, ADICIONAR ALGUNS PRODUTOS À LISTA E UTILIZAR UMA EXPRESSÃO LAMBDA COM O MÉTODO removeIf
    // PARA REMOVER OS PRODUTOS QUE POSSUEM PREÇO IGUAL OU MAIOR QUE UM VALOR MÍNIMO DEFINIDO.
    // EM SEGUIDA, IMPRIMIR OS PRODUTOS RESTANTES NA LISTA.

    public static void main(String[] args) {

        // CRIAÇÃO DE UMA LISTA DE PRODUTOS
        List<Product> list = new ArrayList<>();

        // ADIÇÃO DE PRODUTOS À LISTA
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // VALOR MÍNIMO PARA FILTRAGEM
        double min = 100.0;

        // EXPRESSÃO LAMBDA UTILIZADA COMO PREDICATE:
        // A FUNÇÃO removeIf RECEBE UM PREDICATE COMO PARÂMETRO, QUE É UMA CONDIÇÃO LÓGICA APLICADA SOBRE OS ELEMENTOS DA LISTA.
        // NESTE CASO, A EXPRESSÃO LAMBDA (p -> p.getPrice() >= min) VERIFICA SE O PREÇO DE CADA PRODUTO É MAIOR OU IGUAL A min.
        // SE A CONDIÇÃO FOR VERDADEIRA, O PRODUTO É REMOVIDO DA LISTA.
        list.removeIf(p -> p.getPrice() >= min);

        // IMPRESSÃO DOS PRODUTOS RESTANTES NA LISTA
        for (Product p : list) {
            System.out.println(p);
        }  
    }
}
