package Set2_Application;
// O PROGRAMA UTILIZA CONJUNTOS (Set) PARA ARMAZENAR OS NÚMEROS DE IDENTIFICAÇÃO DOS ALUNOS MATRICULADOS EM TRÊS CURSOS: A, B E C.
// CADA CURSO TEM UM CONJUNTO PRÓPRIO, E OS ALUNOS SÃO IDENTIFICADOS POR NÚMEROS INTEIROS.
// O USO DE Set GARANTE QUE UM MESMO ALUNO NÃO SERÁ CONTADO MAIS DE UMA VEZ, MESMO QUE ESTEJA MATRICULADO EM MAIS DE UM CURSO.
// NO FINAL, O PROGRAMA CALCULA E IMPRIME O NÚMERO TOTAL DE ALUNOS ÚNICOS QUE ESTÃO MATRICULADOS EM QUALQUER UM DOS TRÊS CURSOS.

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        // CRIAÇÃO DOS CONJUNTOS PARA ALUNOS DOS CURSOS A, B E C.
        // OS CONJUNTOS (Set) SÃO USADOS PARA GARANTIR QUE NÃO HAJA ELEMENTOS DUPLICADOS.
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        // SOLICITA AO USUÁRIO O NÚMERO DE ALUNOS NO CURSO A E ADICIONA OS NÚMEROS AO CONJUNTO.
        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            a.add(number); // ADICIONA CADA NÚMERO DE ALUNO AO CONJUNTO "A".
        }

        // SOLICITA AO USUÁRIO O NÚMERO DE ALUNOS NO CURSO B E ADICIONA OS NÚMEROS AO CONJUNTO.
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            b.add(number); // ADICIONA CADA NÚMERO DE ALUNO AO CONJUNTO "B".
        }

        // SOLICITA AO USUÁRIO O NÚMERO DE ALUNOS NO CURSO C E ADICIONA OS NÚMEROS AO CONJUNTO.
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            c.add(number); // ADICIONA CADA NÚMERO DE ALUNO AO CONJUNTO "C".
        }

        // CRIA UM NOVO CONJUNTO "total" E INICIALIZA COM O CONJUNTO "a" (CURSO A).
        Set<Integer> total = new HashSet<>(a);

        // ADICIONA TODOS OS ALUNOS DO CURSO B AO CONJUNTO "total".
        total.addAll(b);

        // ADICIONA TODOS OS ALUNOS DO CURSO C AO CONJUNTO "total".
        total.addAll(c);

        // IMPRIME O NÚMERO TOTAL DE ALUNOS ÚNICOS.
        // O MÉTODO size() RETORNA O TAMANHO DO CONJUNTO, QUE REPRESENTA O NÚMERO DE ALUNOS DISTINTOS.
        System.out.println("Total students: " + total.size());

        // FECHA O Scanner PARA LIBERAR RECURSOS.
        sc.close();
    }
}
