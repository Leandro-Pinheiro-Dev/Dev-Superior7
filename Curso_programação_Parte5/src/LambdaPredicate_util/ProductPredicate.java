// CLASSE QUE IMPLEMENTA A INTERFACE PREDICATE PARA FILTRAGEM DE PRODUTOS
package LambdaPredicate_util;

import java.util.function.Predicate;
import GenericsDelimitados_Entities.Product;

public class ProductPredicate implements Predicate<Product> {

    // IMPLEMENTAÇÃO DO MÉTODO test PARA FILTRAR PRODUTOS COM PREÇO MAIOR OU IGUAL A 100
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
