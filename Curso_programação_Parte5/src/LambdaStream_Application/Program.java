package LambdaStream_Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import GenericsDelimitados_Entities.Product;

public class Program {

    public static void main(String[] args) {

        // DEFINE O FORMATO LOCAL COMO O FORMATO DOS ESTADOS UNIDOS PARA TRABALHAR COM PONTOS DECIMAIS
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // SOLICITA O CAMINHO COMPLETO DO ARQUIVO AO USUÁRIO
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        
        // BLOCO try-with-resources PARA LER O ARQUIVO, QUE FECHA AUTOMATICAMENTE APÓS O USO
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // CRIA UMA LISTA DE PRODUTOS
            List<Product> list = new ArrayList<>();
            
            // LÊ A PRIMEIRA LINHA DO ARQUIVO
            String line = br.readLine(); 
            
            // ENQUANTO EXISTIR UMA LINHA PARA LER, OS PRODUTOS SÃO ADICIONADOS À LISTA
            while (line != null) {
                // SEPARA OS CAMPOS DA LINHA PELO CARACTERE VÍRGULA
                String[] fields = line.split(",");
                // CRIA UM NOVO PRODUTO A PARTIR DOS CAMPOS DO ARQUIVO E ADICIONA À LISTA
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                // LÊ A PRÓXIMA LINHA
                line = br.readLine();
            }
            
            // ESTE PROGRAMA LÊ UM ARQUIVO CONTENDO PRODUTOS, CALCULA A MÉDIA DOS PREÇOS, 
            // FILTRA OS PRODUTOS COM PREÇOS ABAIXO DESSA MÉDIA E IMPRIME SEUS NOMES EM ORDEM DECRESCENTE.
            // AS OPERAÇÕES SÃO REALIZADAS DE MANEIRA EFICIENTE UTILIZANDO STREAMS E EXPRESSÕES LAMBDA DO JAVA,
            // ALÉM DE APROVEITAR O try-with-resources PARA GARANTIR O FECHAMENTO CORRETO DOS RECURSOS.

            // CALCULA A MÉDIA DOS PREÇOS USANDO STREAMS:
            // map(p -> p.getPrice()) EXTRAI OS PREÇOS,
            // reduce(0.0, (x,y) -> x + y) SOMA TODOS OS PREÇOS,
            // DIVIDE PELO TAMANHO DA LISTA PARA OBTER A MÉDIA
            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size();
            
            // IMPRIME A MÉDIA FORMATADA COM DUAS CASAS DECIMAIS
            System.out.println("Average price: " + String.format("%.2f", avg));
            
            // DEFINE UM COMPARADOR PARA ORDENAR OS NOMES EM ORDEM ALFABÉTICA, IGNORANDO MAIÚSCULAS E MINÚSCULAS
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            
            // FILTRA OS PRODUTOS COM PREÇO INFERIOR À MÉDIA E ORDENA OS NOMES EM ORDEM DECRESCENTE
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg) // FILTRA PRODUTOS COM PREÇOS MENORES QUE A MÉDIA
                    .map(p -> p.getName()) // TRANSFORMA OS PRODUTOS EM SEUS NOMES
                    .sorted(comp.reversed()) // ORDENA OS NOMES EM ORDEM DECRESCENTE
                    .collect(Collectors.toList()); // COLETA OS RESULTADOS EM UMA NOVA LISTA
            
            // IMPRIME OS NOMES FILTRADOS E ORDENADOS
            names.forEach(System.out::println);

        } catch (IOException e) {
            // TRATA EXCEÇÕES RELACIONADAS À LEITURA DE ARQUIVOS
            System.out.println("Error: " + e.getMessage());
        }
        sc.close(); // FECHA O SCANNER
    }
}
