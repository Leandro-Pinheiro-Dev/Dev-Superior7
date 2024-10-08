package HashCode_Equals_Application;

import HashCode_Equals_Entities.clients;

public class Program {

    public static void main(String[] args) {

        // CRIA DOIS OBJETOS clients, C1 E C2, COM NOMES E EMAILS DIFERENTES.
        clients C1 = new clients("Maria", "maria@gmail.com");
        clients C2 = new clients("Leandro", "leandro@gamil.com");

        // AQUI ESTAMOS CHAMANDO O MÉTODO hashCode().
        // O MÉTODO hashCode() RETORNA UM NÚMERO INTEIRO ÚNICO PARA CADA OBJETO BASEADO NO ATRIBUTO name.
        // ESSE NÚMERO É USADO PARA IDENTIFICAR OBJETOS EM ESTRUTURAS COMO TABELAS HASH.
        // OBJETOS QUE SÃO IGUAIS SEGUNDO O MÉTODO equals() DEVEM TER O MESMO hashCode().
        System.out.println(C1.hashCode()); // EXIBE O CÓDIGO HASH DE C1.
        System.out.println(C2.hashCode()); // EXIBE O CÓDIGO HASH DE C2.

        // AQUI ESTAMOS CHAMANDO O MÉTODO equals().
        // O MÉTODO equals() É SOBRESCRITO PARA COMPARAR DOIS OBJETOS clients BASEADOS NO ATRIBUTO name.
        // SE O name DOS DOIS OBJETOS FOR IGUAL, equals() RETORNARÁ TRUE, CASO CONTRÁRIO, FALSE.
        // NO CASO DE C1 E C2, COMO OS NOMES SÃO DIFERENTES, O RESULTADO SERÁ FALSE.
        System.out.println(C1.equals(C2)); // EXIBE SE C1 E C2 SÃO IGUAIS (FALSE, NESSE CASO).
    }
}
