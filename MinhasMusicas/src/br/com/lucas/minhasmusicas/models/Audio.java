package br.com.lucas.minhasmusicas.models;
import java.util.Scanner;
public class Audio {

    //Scanner
    Scanner sc = new Scanner(System.in);

    private String titulo;
    private String duracao;
    private int totalReproducoes = 0;
    private int totalCurtidas = 0;
    private int classificacao;


    //Getters e Setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public String getClassificacao() {

        String classificacao;
        if(totalCurtidas > (3*totalReproducoes/4)){
            classificacao = " top curtidas";
        } else if(totalReproducoes > (totalReproducoes/2)){
            classificacao = " queridinhas do povo";
        } else {
            classificacao = " baixa";
        }
        return classificacao;
    }

    public String getDuracao(){
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    //Metodos
    public void reproduz(){
        int reproducao;
        do {
        System.out.println("deseja reproduzir ?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        reproducao = sc.nextInt();


            if (reproducao == 1) {
                System.out.println("Reproduzida (finge que ouviu a musica)");
                totalReproducoes++;
            } else if (reproducao
                    == 2) {
                System.out.println("skip");
            } else {
                System.out.println("nao processado");
            }
        } while(reproducao > 2 || reproducao <= 0);
    }

    public void curte() {
        int curtida;
        do {
        System.out.println("deseja curtir ?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        curtida = sc.nextInt();

            if (curtida == 1) {
                System.out.println("Like");
                totalCurtidas++;
            } else if (curtida == 2) {
                System.out.println("Deslike");
            } else {
                System.out.println("nao processado");
            }
        } while(curtida > 2 || curtida <= 0);

    }

    public void mostraDescricao(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracao: " + getDuracao() + " minutos");
        System.out.println("Total de reproducoes: " + getTotalReproducoes());
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Classificacao: " + getClassificacao());
    }
    public void daEspaco(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

