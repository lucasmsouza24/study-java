package br.com.bandtec.aula05encapsulamento.ex01;

public class App {
    
    public static void main(String[] args) {
        Aluno al1 = new Aluno("Nikolas Bhaskara", "02211055", "CCO");
        al1.setNota1(8);
        al1.setNota2(8.9);
        Aluno al2 = new Aluno("Luqinha Menezola", "02211043", "CCO", 9.8d, 10d);

        System.out.println(al1);
        System.out.println(al2);
    }
}

class Aluno {

    // construtctor
    public Aluno(String nome, String ra, String curso) {
        this.ra = ra;
        this.curso = curso;
        this.nome = nome;
        this.nota1 = 0d;
        this.nota2 = 0d;
    }

    public Aluno(String nome, String ra, String curso, Double nota1, Double nota2) {
        this.ra = ra;
        this.curso = curso;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Attributes
    private String ra;
    private String curso;
    private String nome;
    private Double nota1;
    private Double nota2;

    // ra
    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    // curso
    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // nota 1
    public Double getNota1() {
        return this.nota1;
    }

    public void setNota1(Double nota1) {
        if(0 <= nota1 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }
    public void setNota1(Integer nota1) {
        this.setNota1(Double.valueOf(nota1));
    }

    // nota 2
    public Double getNota2() {
        return this.nota2;
    }

    public void setNota2(Double nota2) {
        if (0 <= nota2 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    public  void setNota2(Integer nota2) {
        this.setNota2(Double.valueOf(nota2));
    }

    // get media
    public Double getMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    // to string override
    @Override
    public String toString() {
        String str = 
        "=".repeat(30) +
        "\nNome: %s\n" +
        "Curso: %s\n" +
        "Ra: %s\n" +
        "Nota 1: %.2f\n" + 
        "Nota 2: %.2f\n" + 
        "Média: %.2f\n" +
        "=".repeat(30);

        return String.format(
            str,
            this.getNome(),
            this.getCurso(),
            this.getRa(),
            this.getNota1(),
            this.getNota2(),
            this.getMedia()
        );
    }

}
