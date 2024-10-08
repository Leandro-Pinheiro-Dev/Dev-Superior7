package Set_Entities;

import java.util.Date;

public class LogEntry {

    private String username;
    private Date moment;

    // CONSTRUTOR QUE RECEBE username E moment COMO PARÂMETROS.
    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    // MÉTODOS GETTER E SETTER PARA username E moment.
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    // O MÉTODO hashCode() GERA UM NÚMERO INTEIRO QUE REPRESENTA O OBJETO.
    // AQUI É BASEADO NO ATRIBUTO username, POIS O OBJETIVO É GARANTIR QUE
    // CADA USUÁRIO TENHA UM CÓDIGO ÚNICO PARA SER UTILIZADO EM ESTRUTURAS DE HASH.
    // O "31" É UM NÚMERO PRIMO USADO PARA GERAR UM HASH MAIS ROBUSTO.
    @Override
    public int hashCode() {
        final int prime = 31; // NÚMERO PRIMO PARA AUMENTAR A DISTRIBUIÇÃO DOS VALORES DO HASH.
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode()); // USA username PARA GERAR O HASH.
        return result;
    }

    // O MÉTODO equals() COMPARA DOIS OBJETOS PARA VER SE ELES SÃO IGUAIS.
    // NESTE CASO, ELE COMPARA APENAS O username DOS OBJETOS LogEntry.
    // SE DOIS OBJETOS LogEntry TIVEREM O MESMO username, ELES SÃO CONSIDERADOS IGUAIS.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // SE OS OBJETOS FOREM IGUAIS (MESMO ENDEREÇO DE MEMÓRIA), RETORNA TRUE.
            return true;
        if (obj == null) // SE O OBJETO FOR NULO, RETORNA FALSE.
            return false;
        if (getClass() != obj.getClass()) // SE NÃO FOREM DA MESMA CLASSE, RETORNA FALSE.
            return false;
        LogEntry other = (LogEntry) obj; // CONVERTE O OBJETO RECEBIDO PARA LogEntry.
        if (username == null) { // SE O username DESTE OBJETO FOR NULO...
            if (other.username != null) // ...E O username DO OUTRO OBJETO NÃO FOR NULO, RETORNA FALSE.
                return false;
        } else if (!username.equals(other.username)) // COMPARA OS usernameS. SE FOREM DIFERENTES, RETORNA FALSE.
            return false;
        return true; // SE OS usernameS FOREM IGUAIS, RETORNA TRUE.
    }
}
