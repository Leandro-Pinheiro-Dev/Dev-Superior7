package Map_Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {


	    // EXERCÍCIO: LER UM ARQUIVO COM NOMES DE CANDIDATOS E A QUANTIDADE DE VOTOS RECEBIDOS POR ELES.
	    // O PROGRAMA DEVE SOMAR OS VOTOS PARA CADA CANDIDATO E IMPRIMIR O TOTAL NO FINAL.

	    // A CLASSE Map É USADA PARA ARMAZENAR PARES CHAVE-VALOR.
	    // NESTE CASO, A CHAVE É O NOME DO CANDIDATO (STRING) E O VALOR É O TOTAL DE VOTOS (INTEGER).
	    // O LinkedHashMap É USADO PARA MANTER A ORDEM DE INSERÇÃO DOS ELEMENTOS.
	    public static void main(String[] args) throws ParseException {

	        Scanner sc = new Scanner(System.in);

	        // CRIA UM MAP PARA ARMAZENAR O NOME DO CANDIDATO COMO CHAVE E A QUANTIDADE DE VOTOS COMO VALOR.
	        Map<String, Integer> votes = new LinkedHashMap<>();

	        // SOLICITA AO USUÁRIO O CAMINHO COMPLETO DO ARQUIVO QUE CONTÉM OS DADOS DOS VOTOS.
	        System.out.print("Enter file full path: ");
	        String path = sc.nextLine();

	        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

	            String line = br.readLine();
	            // LÊ O ARQUIVO LINHA POR LINHA ATÉ O FIM.
	            while (line != null) {
	                
	                // DIVIDE A LINHA USANDO VÍRGULA COMO DELIMITADOR.
	                // A PRIMEIRA PARTE É O NOME DO CANDIDATO E A SEGUNDA É A QUANTIDADE DE VOTOS.
	                String[] fields = line.split(",");
	                String name = fields[0];
	                int count = Integer.parseInt(fields[1]);

	                // SE O CANDIDATO JÁ EXISTIR NO MAP, SOMA OS NOVOS VOTOS AOS VOTOS EXISTENTES.
	                if (votes.containsKey(name)) {
	                    int votesSoFar = votes.get(name);  // PEGA O TOTAL DE VOTOS ATÉ O MOMENTO.
	                    votes.put(name, count + votesSoFar);  // ATUALIZA O TOTAL DE VOTOS.
	                }
	                else {
	                    // SE O CANDIDATO NÃO ESTIVER NO MAP, INSERE-O COM O NÚMERO DE VOTOS ATUAL.
	                    votes.put(name, count);
	                }
	                
	                // LÊ A PRÓXIMA LINHA DO ARQUIVO.
	                line = br.readLine();
	            }
	            
	            // IMPRIME O RESULTADO: NOME DO CANDIDATO E O TOTAL DE VOTOS RECEBIDOS.
	            for (String key : votes.keySet()) {
	                System.out.println(key + ": " + votes.get(key));
	            }
	            
	        } catch (IOException e) {
	            // TRATA POSSÍVEIS EXCEÇÕES DE ENTRADA E SAÍDA.
	            System.out.println("Error: " + e.getMessage());
	        }

	        sc.close();  // FECHA O Scanner PARA LIBERAR RECURSOS.
	    }
	}
