package LambdaPraticando_Application;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Locale; 
import java.util.Scanner; 
import java.util.stream.Collectors; 

import LambdaPraticando_Entities.Employee; 

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        // SOLICITA AO USUÁRIO O CAMINHO DO ARQUIVO
        System.out.print("Enter full file path: ");
        String path = sc.nextLine(); // LÊ O CAMINHO DO ARQUIVO DIGITADO PELO USUÁRIO

        // TENTA LER O ARQUIVO ESPECIFICADO PELO CAMINHO
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // INICIALIZA UMA LISTA PARA ARMAZENAR OS EMPREGADOS
            List<Employee> list = new ArrayList<>();
            
            // LÊ A PRIMEIRA LINHA DO ARQUIVO
            String line = br.readLine();
            // CONTINUA LENDO ENQUANTO HOUVER LINHAS NO ARQUIVO
            while (line != null) {
                // SEPARA OS CAMPOS DA LINHA UTILIZANDO A VÍRGULA COMO DELIMITADOR
                String[] fields = line.split(",");
                // CRIA UM NOVO EMPREGADO E ADICIONA À LISTA
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                // LÊ A PRÓXIMA LINHA DO ARQUIVO
                line = br.readLine();
            }

            // SOLICITA AO USUÁRIO UM SALÁRIO PARA FILTRAR OS EMPREGADOS
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble(); // LÊ O SALÁRIO INFORMADO PELO USUÁRIO
            
            // FILTRA A LISTA DE EMPREGADOS PARA ENCONTRAR OS E-MAILS DOS QUE TÊM SALÁRIO MAIOR QUE O INFORMADO
            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salary) // FILTRA EMPREGADOS COM SALÁRIO MAIOR QUE O INFORMADO
                    .map(x -> x.getEmail()) // MAPEA A LISTA PARA OBTER APENAS OS E-MAILS
                    .sorted() // ORDENA OS E-MAILS EM ORDEM ALFABÉTICA
                    .collect(Collectors.toList()); // COLETA OS RESULTADOS EM UMA LISTA

            // EXIBE OS E-MAILS DOS EMPREGADOS COM SALÁRIO MAIOR QUE O INFORMADO
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            // IMPRIME CADA E-MAIL FILTRADO
            emails.forEach(System.out::println);
            
            // CALCULA A SOMA DOS SALÁRIOS DE EMPREGADOS CUJO NOME COMEÇA COM 'M'
            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M') // FILTRA EMPREGADOS CUJO NOME COMEÇA COM 'M'
                    .map(x -> x.getSalary()) // MAPEA A LISTA PARA O SALÁRIO
                    .reduce(0.0, (x, y) -> x + y); // REDUZ OS VALORES PARA CALCULAR A SOMA
            
            // EXIBE A SOMA DOS SALÁRIOS FILTRADOS
            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
            
        } catch (IOException e) { // TRATA EXCEÇÕES DE ENTRADA/SAÍDA
            // IMPRIME A MENSAGEM DE ERRO SE OCORRER UM PROBLEMA AO LER O ARQUIVO
            System.out.println("Error: " + e.getMessage());
        }
        // FECHA O SCANNER APÓS O USO
        sc.close(); 
    }
}
