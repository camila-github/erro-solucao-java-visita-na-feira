//SOLUCAO 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int pimentoesAmarelos = Integer.parseInt(st.nextToken());
    int pimentosVermelhos = Integer.parseInt(st.nextToken());
    int totalDePimentoes = pimentoesAmarelos + pimentosVermelhos;
    System.out.println("X = " + totalDePimentoes);
  }
}

//SOLUCAO 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int pimentoesAmarelos = Integer.parseInt(st.nextToken());
    int pimentosVermelhos = Integer.parseInt(st.nextToken());
    System.out.println("X = " + (pimentoesAmarelos + pimentosVermelhos));
  }
}

//SOLUCAO 3

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    System.out.println("X = " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
  }
}