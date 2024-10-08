/*
 * ESTE PROGRAMA DEMONSTRA O USO DE GENERICS DELIMITADOS EM JAVA.
 * ELE LÊ UMA LISTA DE PRODUTOS A PARTIR DE UM ARQUIVO TEXTO ("C:\\temp\\in.txt", UTILIZA UM SERVIÇO 
 * DE CÁLCULO (CalculationService) PARA DETERMINAR O PRODUTO MAIS CARO, E EXIBE 
 * O RESULTADO NO CONSOLE.
 * 
 * A CLASSE CalculationService UTILIZA GENERICS DELIMITADOS PARA GARANTIR QUE O 
 * MÉTODO DE CÁLCULO DE MAXIMO (max) SÓ FUNCIONE COM OBJETOS QUE IMPLEMENTAM A 
 * INTERFACE Comparable.
 * 
 * FLUXO DA APLICAÇÃO:
 * 1. O PROGRAMA LÊ OS DADOS DOS PRODUTOS DE UM ARQUIVO TEXTO.
 * 2. ADICIONA OS PRODUTOS EM UMA LISTA.
 * 3. CALCULA QUAL PRODUTO TEM O MAIOR PREÇO USANDO A FUNÇÃO max().
 * 4. EXIBE O PRODUTO MAIS CARO NO CONSOLE.
 */
package GenericsDelimitados_Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import GenericsDelimitados_Entities.Product;
import GenericsDelimitados_Service.CalculationService;

public class Program {  

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        // CRIA UMA LISTA VAZIA DE PRODUTOS
        List<Product> list = new ArrayList<>();

        // CAMINHO DO ARQUIVO QUE CONTÉM OS DADOS DOS PRODUTOS
        String path = "C:\\temp\\in.txt";

        // BLOCO try-with-resources PARA LER O ARQUIVO E GARANTIR QUE ELE SERÁ FECHADO
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // LÊ CADA LINHA DO ARQUIVO
            String line = br.readLine();
            while (line != null) {
                // DIVIDE A LINHA EM CAMPOS USANDO A VÍRGULA COMO DELIMITADOR
                String[] fields = line.split(",");
                
                // VERIFICA SE A LINHA TEM PELO MENOS 2 CAMPOS (NOME E PREÇO)
                if (fields.length >= 2) {
                    try {
                        // ADICIONA UM NOVO PRODUTO À LISTA COM O NOME E O PREÇO LIDO DO ARQUIVO
                        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                    } catch (NumberFormatException e) {
                        // SE OCORRER ERRO NA CONVERSÃO DO PREÇO PARA DOUBLE, EXIBE MENSAGEM
                        System.out.println("Erro ao converter o preço: " + fields[1]);
                    }
                } else {
                    // CASO A LINHA ESTEJA INCORRETA, EMITE UM AVISO
                    System.out.println("Linha inválida: " + line);
                }

                // LÊ A PRÓXIMA LINHA
                line = br.readLine();
            }
            
            // CHAMA O MÉTODO max() PARA ENCONTRAR O PRODUTO MAIS CARO NA LISTA
            if (!list.isEmpty()) {
                Product x = CalculationService.max(list);
                // EXIBE O PRODUTO MAIS CARO
                System.out.println("Most expensive:");
                System.out.println(x);
            } else {
                System.out.println("A lista de produtos está vazia.");
            }

        // TRATA EXCEÇÕES RELACIONADAS À LEITURA DO ARQUIVO
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
