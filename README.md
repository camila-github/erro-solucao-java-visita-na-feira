## Exercicio (Java): Visita na Feira

O exercicio publicado é referente ao treinamento do Bootcamp Java Developer - Introdução a Programação com Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Você está na feira com a sua sacola e parou em uma banca. O feirante lhe entregou pimentões amarelos e vermelhos. Agora iremos somar os pimetões amarelos e vermelhos para descobrir o total de pimentões na sacola.  Você receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A (pimentões amarelos) e B (pimentões vermelhos). Faça a soma de A e B atribuindo o seu resultado na variável X (total de pimentões). Apresente X como descrito na mensagem de exemplo abaixo. Não apresente outra mensagem além da mensagem especificada.

#### Entrada: 

A entrada contém 2 valores inteiros, separados por um espaço.

#### Saída: 

Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Assegure que exista um espaço antes e depois do sinal de igualdade.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
11 7 | X = 18
-11 6 | X = -5
11 -2 | X = 9


#### Java　

```java
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
```

