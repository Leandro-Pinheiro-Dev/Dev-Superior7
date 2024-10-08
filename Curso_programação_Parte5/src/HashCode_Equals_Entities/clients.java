package HashCode_Equals_Entities;

import java.util.Objects;

public class clients {

    private String name;
    private String email;

    // CONSTRUTOR PARA INICIALIZAR O OBJETO clients COM name E email.
    public clients(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // MÉTODOS GETTERS E SETTERS PARA name E email.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // O MÉTODO hashCode() GERA UM CÓDIGO INTEIRO QUE REPRESENTA O OBJETO.
    // AQUI ELE UTILIZA O ATRIBUTO name PARA GERAR O CÓDIGO HASH.
    // ISSO É ÚTIL EM ESTRUTURAS DE DADOS COMO TABELAS HASH, ONDE OBJETOS IGUAIS DEVEM TER O MESMO CÓDIGO HASH.
    @Override
    public int hashCode() {
        return Objects.hash(name); // GERA O HASH A PARTIR DO ATRIBUTO name.
    }

    // O MÉTODO equals() COMPARA ESTE OBJETO clients COM OUTRO OBJETO PASSADO COMO PARÂMETRO.
    // PRIMEIRO, ELE VERIFICA SE O OBJETO É O MESMO (MESMO ENDEREÇO DE MEMÓRIA).
    // SE NÃO FOR, ELE VERIFICA SE O OBJETO NÃO É NULO E SE É DA MESMA CLASSE.
    // FINALMENTE, COMPARA O ATRIBUTO name DOS DOIS OBJETOS PARA DETERMINAR SE SÃO IGUAIS.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // SE OS OBJETOS FOREM IGUAIS (MESMO ENDEREÇO DE MEMÓRIA), RETORNA TRUE.
        if (obj == null)
            return false; // SE O OBJETO FOR NULO, RETORNA FALSE.
        if (getClass() != obj.getClass())
            return false; // SE NÃO FOREM DA MESMA CLASSE, RETORNA FALSE.
        clients other = (clients) obj; // CONVERTE O OBJETO PARA clients.
        return Objects.equals(name, other.name); // COMPARA O ATRIBUTO name DOS DOIS OBJETOS.
    }
}
