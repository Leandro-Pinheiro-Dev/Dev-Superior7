// CLASSE PRINCIPAL PARA EXECUTAR O PROGRAMA QUE TRANSFORMA O NOME DOS PRODUTOS EM LETRAS MAIÚSCULAS
package LambdaFunction_Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import GenericsDelimitados_Entities.Product;

public class Program {

    // EXERCÍCIO:
    // CRIAR UMA LISTA DE PRODUTOS E UTILIZAR UMA EXPRESSÃO LAMBDA COM O MÉTODO map PARA CONVERTER O NOME
    // DE CADA PRODUTO PARA LETRAS MAIÚSCULAS. EM SEGUIDA, COLETAR ESSES NOMES EM UMA NOVA LISTA E IMPRIMI-LA.

    public static void main(String[] args) {

        // CRIAÇÃO DE UMA LISTA DE PRODUTOS
        List<Product> list = new ArrayList<>();

        // ADIÇÃO DE PRODUTOS À LISTA
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // USO DO STREAM PARA TRANSFORMAR OS NOMES EM LETRAS MAIÚSCULAS:
        // A EXPRESSÃO LAMBDA (p -> p.getName().toUpperCase()) É USADA COM O MÉTODO map PARA CONVERTER CADA NOME DE PRODUTO EM MAIÚSCULAS.
        // O RESULTADO É COLETADO EM UMA NOVA LISTA DE STRINGS.
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        // IMPRESSÃO DOS NOMES TRANSFORMADOS
        names.forEach(System.out::println);
    }
}
