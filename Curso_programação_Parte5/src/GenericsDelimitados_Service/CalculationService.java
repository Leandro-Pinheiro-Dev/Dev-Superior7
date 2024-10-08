/*
 * SERVIÇO DE CÁLCULO (CalculationService) QUE UTILIZA GENERICS DELIMITADOS PARA 
 * ENCONTRAR O VALOR MÁXIMO EM UMA LISTA DE ELEMENTOS.
 * O MÉTODO max() FUNCIONA COM QUALQUER TIPO QUE IMPLEMENTE A INTERFACE Comparable.
 */
package GenericsDelimitados_Service;

import java.util.List;
 
public class CalculationService {

    // MÉTODO ESTÁTICO QUE ENCONTRA O MAIOR ELEMENTO EM UMA LISTA DE ELEMENTOS COMPARÁVEIS
    // UTILIZA GENERICS DELIMITADOS PARA GARANTIR QUE O TIPO T IMPLEMENTA Comparable
    public static <T extends Comparable<T>> T max(List<T> list) {
        // VERIFICA SE A LISTA ESTÁ VAZIA, SE SIM, LANÇA UMA EXCEÇÃO
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        } 
        // INICIA O VALOR MÁXIMO COMO O PRIMEIRO ELEMENTO DA LISTA
        T max = list.get(0);
        // PERCORRE A LISTA PARA ENCONTRAR O MAIOR ELEMENTO
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        // RETORNA O ELEMENTO MÁXIMO ENCONTRADO
        return max;
    }
}
