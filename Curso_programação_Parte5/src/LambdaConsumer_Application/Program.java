// CLASSE PRINCIPAL PARA EXECUTAR O PROGRAMA DE ATUALIZAÇÃO DE PREÇOS DOS PRODUTOS
package LambdaConsumer_Application;

import java.util.ArrayList;
import java.util.List;
import GenericsDelimitados_Entities.Product;

public class Program {

    // EXERCÍCIO:
    // CRIAR UMA LISTA DE PRODUTOS, ADICIONAR ALGUNS PRODUTOS À LISTA E UTILIZAR UMA EXPRESSÃO LAMBDA COM O MÉTODO forEach
    // PARA ATUALIZAR O PREÇO DE CADA PRODUTO, MULTIPLICANDO PELO FATOR DEFINIDO.
    // EM SEGUIDA, IMPRIMIR OS PRODUTOS COM OS NOVOS PREÇOS.

    public static void main(String[] args) {

        // CRIAÇÃO DE UMA LISTA DE PRODUTOS
        List<Product> list = new ArrayList<>();

        // ADIÇÃO DE PRODUTOS À LISTA
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // FATOR DE ATUALIZAÇÃO DE PREÇO
        double factor = 1.1;

        // EXPRESSÃO LAMBDA UTILIZADA COMO CONSUMER:
        // A FUNÇÃO forEach APLICA UMA AÇÃO A CADA ELEMENTO DA LISTA. A EXPRESSÃO LAMBDA (p -> p.setPrice(p.getPrice() * factor))
        // ATUALIZA O PREÇO DE CADA PRODUTO, MULTIPLICANDO PELO FATOR DEFINIDO (1.1), OU SEJA, AUMENTANDO O PREÇO EM 10%.
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        // IMPRESSÃO DOS PRODUTOS ATUALIZADOS NA LISTA
        list.forEach(System.out::println);
    }
}
