# Java Bandtec

## Sumário
- [Estrutura básica](#estrutura-básica)
- [Método Main](#metodo-main)
- [Tipos](#tipos)
- [Operadores](#operadores)
- [Exibição (print)](#exibicao)
- [Input](#input)

## Estrutura básica

Um arquivo java deve começar com a primeira letra maiúscula e ter a extensão **.java**.

Exemplo:

> App.java

Todo arquivo **.java** contêm uma classe principal, e essa classe deve ser nomeada de acordo com o nome do arquivo.

~~~java
class App {
    // conteúdo da classe
}
~~~~

### Método main
Para tornar um arquivo **.java** executável, é necessário criar um método **main** dentro da classe principal.

~~~java
public static void main(String[] args) {
    // bloco de código
}
~~~

Sendo assim, a estrutura básica de um arquivo java (executável) é a seguinte:

~~~java
class App {
    public static void main(String[] args) {
        // bloco de código
    }
}
~~~

## Tipos

Os tipos primitivos do java são extremamente simples, nem mesmo aceitam o valor **null**. Portanto, as classes Wraper são mais utilizadas, pois as mesmas aceitam o valor **null** e possuem métodos úteis de conversão.

Tipos primitivos:
- int
- double
- boolean
- char

Classes Wrapper:
- Integer
  ~~~java
  Integer age = 20;
  ~~~
- Double
  ~~~java
  Double height = 1.68;
  ~~~~ 
- Boolean
  ~~~java
  Boolean isHappy = true;
  ~~~
- String
  ~~~java
  String nome = "Lucas";
  ~~~~ 
  
## Operadores

Operadores aritméticos

~~~java
2 + 3;   // Adição
2 - 3;   // Subtração
2 * 3;   // Multiplicação
2 / 3;   // Divisão
2 % 3;   // Resto da divisão
~~~

Operadores Unários

~~~java
i++;    // Incremento
i--;    // Decremento
!true;  // Opedador de complemento lógico, inverte o valor de um boleano
~~~

Operadores Relacionais
~~~java
1 == 1;  // Igualdade
1 != 1;  // Diferente
1 > 1;   // Maior que
1 >= 1;  // Maior ou igual à
1 < 1;   // Menor que
1 <= 1;  // Menor ou igual à
~~~

Operadores condicionais
~~~java
true && false;   // e (and)
true || false;   // ou (or)
true ? "do it" : "do that";  // Operador ternário
~~~

## Exibição

Hello World
~~~java
System.out.println("Hello World");
~~~

Interpolação
~~~java
String txt = "Olá %s, você tem %d anos";
txt = String.format(txt, name, age);
System.out.println(txt);
~~~

Output:
> Olá Lucas, você tem 20 anos

## Input

Para realizar inputs, é necessária a importação da biblioteca Scanner:

~~~java
import java.util.Scanner;
~~~

> A importação deve acontecer fora da classe principal.

O uso do Scanner é muito simples, basta instanciar a classe e usar seus métodos de acordo com o tipo do dado desejado.

~~~java
Scanner sc = new Scanner(System.in);    // Instanciando a classe Scanner

String name = sc.nextLine();            // Capturando input do tipo String
Integer age = sc.nextInt();             // Capturando input do tipo Integer
Double age = sc.nextDouble();           // Capturando input do tipo Double

sc.close();                             // Fechando instancia do Scanner
~~~

> Diferente da importação, o uso do Scanner deve ocorrer dentro do método main, ou seja, dentro da classe principal.

