// PACOTE QUE CONTÉM O SERVIÇO PrintService UTILIZANDO GENERICS
package Generics_Services;

import java.util.ArrayList;
import java.util.List;

// CLASSE PrintService COM GENERICS PARA ACEITAR QUALQUER TIPO DE DADO
public class PrintService<T> {

    // LISTA PRIVADA QUE ARMAZENA OS ELEMENTOS DE TIPO GENÉRICO T
    private List<T> list = new ArrayList<>();

    // MÉTODO PARA ADICIONAR UM VALOR DO TIPO GENÉRICO À LISTA
    public void addValue(T value) {
        list.add(value);  // ADICIONA O VALOR À LISTA
    }

    // MÉTODO QUE RETORNA O PRIMEIRO ELEMENTO DA LISTA
    public T first() {
        // SE A LISTA ESTIVER VAZIA, LANÇA UMA EXCEÇÃO
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);  // RETORNA O PRIMEIRO ELEMENTO DA LISTA
    }

    // MÉTODO QUE IMPRIME OS ELEMENTOS DA LISTA NO CONSOLE
    public void print() {
        System.out.print("[");  // INICIA A IMPRESSÃO COM COLCHETE ABERTO
        if (!list.isEmpty()) {
            System.out.print(list.get(0));  // IMPRIME O PRIMEIRO ELEMENTO
        }
        // LAÇO PARA IMPRIMIR OS DEMAIS ELEMENTOS, SE EXISTIREM, SEPARADOS POR VÍRGULA
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");  // FINALIZA A IMPRESSÃO COM COLCHETE FECHADO
    }
}
