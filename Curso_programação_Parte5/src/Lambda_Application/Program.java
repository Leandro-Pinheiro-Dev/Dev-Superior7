// CLASSE PRINCIPAL PARA EXECUTAR O PROGRAMA DE COMPARAÇÃO DE PRODUTOS
package Lambda_Application;

import java.util.ArrayList;
import java.util.List;
import GenericsDelimitados_Entities.Product;

public class Program {

    // EXERCÍCIO: 
    // CRIAR UMA LISTA DE PRODUTOS, ADICIONAR ALGUNS PRODUTOS À LISTA E UTILIZAR UMA EXPRESSÃO LAMBDA PARA ORDENAR OS PRODUTOS 
    // PELO NOME EM ORDEM ALFABÉTICA IGNORANDO A CAPITALIZAÇÃO (MAIÚSCULAS E MINÚSCULAS).
    // EM SEGUIDA, IMPRIMIR A LISTA DE PRODUTOS ORDENADA NO CONSOLE.
    
    public static void main(String[] args) {

        // CRIAÇÃO DE UMA LISTA DE PRODUTOS
        List<Product> list = new ArrayList<>();

        // ADIÇÃO DE PRODUTOS À LISTA
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // ORDENAÇÃO DA LISTA UTILIZANDO UMA EXPRESSÃO LAMBDA PARA COMPARAR OS PRODUTOS PELO NOME EM MAIÚSCULAS
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        // IMPRESSÃO DA LISTA ORDENADA NO CONSOLE
        for (Product p : list) {
            System.out.println(p);
        }
    } 
}
