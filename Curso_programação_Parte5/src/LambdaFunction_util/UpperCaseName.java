// CLASSE QUE IMPLEMENTA A INTERFACE FUNCTION PARA TRANSFORMAR O NOME DOS PRODUTOS EM MAIÚSCULAS
package LambdaFunction_util;

import java.util.function.Function;
import GenericsDelimitados_Entities.Product;

public class UpperCaseName implements Function<Product, String> {

    // MÉTODO APPLY: IMPLEMENTA A OPERAÇÃO PARA CONVERTER O NOME DO PRODUTO EM LETRAS MAIÚSCULAS
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
