package Set_Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Set_Entities.LogEntry;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // SOLICITA AO USUÁRIO O CAMINHO COMPLETO DO ARQUIVO DE LOG.
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        // AQUI É UTILIZADO try COM RECURSOS PARA ABRIR E LER O ARQUIVO, 
        // O BufferedReader LE ARQUIVOS DE FORMA EFICIENTE LINHA POR LINHA.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // CRIA UM CONJUNTO (Set) PARA ARMAZENAR OBJETOS DO TIPO LogEntry.
            // O Set É UMA COLEÇÃO QUE NÃO PERMITE ELEMENTOS DUPLICADOS.
            // AQUI É UTILIZADO HashSet, QUE ARMAZENA OS ELEMENTOS SEM ORDEM ESPECÍFICA
            // E TEM OPERAÇÕES DE INSERÇÃO E BUSCA OTIMIZADAS.
            Set<LogEntry> set = new HashSet<>();

            // LÊ A PRIMEIRA LINHA DO ARQUIVO.
            String line = br.readLine();

            // ENQUANTO HOUVER LINHAS NO ARQUIVO, O LOOP VAI CONTINUAR.
            while (line != null) {
                // DIVIDE A LINHA EM PARTES USANDO O ESPAÇO COMO DELIMITADOR.
                String[] fields = line.split(" ");
                String username = fields[0]; // O PRIMEIRO ELEMENTO É O NOME DO USUÁRIO.
                Date moment = Date.from(Instant.parse(fields[1])); // O SEGUNDO ELEMENTO É A DATA.

                // ADICIONA UM NOVO OBJETO LogEntry AO CONJUNTO. SE O USUÁRIO JÁ EXISTIR NO CONJUNTO,
                // NÃO SERÁ ADICIONADO NOVAMENTE, POIS O Set NÃO PERMITE DUPLICATAS.
                set.add(new LogEntry(username, moment));

                // LÊ A PRÓXIMA LINHA DO ARQUIVO.
                line = br.readLine();
            }

            // EXIBE O TOTAL DE USUÁRIOS ÚNICOS (TAMANHO DO CONJUNTO).
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            // TRATA EXCEÇÕES RELACIONADAS À LEITURA DO ARQUIVO.
            System.out.println("Error: " + e.getMessage());
        }

        // FECHA O Scanner PARA LIBERAR RECURSOS.
        sc.close();
    }
}
