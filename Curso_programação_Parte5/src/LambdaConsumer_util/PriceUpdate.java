// CLASSE QUE IMPLEMENTA A INTERFACE CONSUMER PARA ATUALIZAR O PREÇO DOS PRODUTOS
package LambdaConsumer_util;

import java.util.function.Consumer;
import GenericsDelimitados_Entities.Product;

public class PriceUpdate implements Consumer<Product> {

    // MÉTODO ACCEPT: IMPLEMENTA A OPERAÇÃO PARA ATUALIZAR O PREÇO DO PRODUTO
    // AQUI, MULTIPLICA O PREÇO POR 1.1 PARA AUMENTAR EM 10%
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
