// CLASSE QUE IMPLEMENTA A INTERFACE COMPARATOR PARA COMPARAR DOIS PRODUTOS
package Lambda_Application;

import java.util.Comparator;
import GenericsDelimitados_Entities.Product;

// A CLASSE Mycomparator IMPLEMENTA COMPARATOR PARA ORDENAR OS PRODUTOS PELO NOME
public class Mycomparator implements Comparator<Product> {

    // MÉTODO QUE COMPARA DOIS PRODUTOS PELO NOME EM MAIÚSCULAS
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
