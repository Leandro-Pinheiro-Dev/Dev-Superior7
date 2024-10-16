package LambdaPraticando_Entities;

public class Employee {

    private String name; // NOME DO EMPREGADO
    private String email; // E-MAIL DO EMPREGADO
    private Double salary; // SALÁRIO DO EMPREGADO

    // CONSTRUTOR PARA INICIALIZAR O EMPREGADO COM NOME, E-MAIL E SALÁRIO
    public Employee(String name, String email, Double salary) {
        this.name = name; // INICIALIZA O NOME
        this.email = email; // INICIALIZA O E-MAIL
        this.salary = salary; // INICIALIZA O SALÁRIO
    }

    // MÉTODO PARA OBTER O NOME DO EMPREGADO
    public String getName() {
        return name; // RETORNA O NOME
    }

    // MÉTODO PARA DEFINIR O NOME DO EMPREGADO
    public void setName(String name) {
        this.name = name; // ATUALIZA O NOME
    }

    // MÉTODO PARA OBTER O E-MAIL DO EMPREGADO
    public String getEmail() {
        return email; // RETORNA O E-MAIL
    }

    // MÉTODO PARA DEFINIR O E-MAIL DO EMPREGADO
    public void setEmail(String email) {
        this.email = email; // ATUALIZA O E-MAIL
    }

    // MÉTODO PARA OBTER O SALÁRIO DO EMPREGADO
    public Double getSalary() {
        return salary; // RETORNA O SALÁRIO
    }

    // MÉTODO PARA DEFINIR O SALÁRIO DO EMPREGADO
    public void setSalary(Double salary) {
        this.salary = salary; // ATUALIZA O SALÁRIO
    }
}
