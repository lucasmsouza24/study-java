# studyJava

## Estrutura básica de um arquivo java

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

Os tipos primitivos do java são extremamente simples, nem mesmo aceitam o valor **null**. Portanto, as classes Wraper são mais utilizadas, pois as mesmas aceitam o valor **null** e possuem métodos úteis de conversão 

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
  Double height = 1.68
  ~~~~ 
- Boolean
  ~~~java
  Boolean isHappy = true;
  ~~~
- String
  ~~~java
  String nome = "Lucas";
  ~~~~ 

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
