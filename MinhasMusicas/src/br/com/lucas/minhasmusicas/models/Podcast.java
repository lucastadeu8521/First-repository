package br.com.lucas.minhasmusicas.models;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost(){
        return this.host;
    }
    public void setHost(String host){
        this.host = host;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public void mostraDescricao(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracao: " + getDuracao() + " minutos");
        System.out.println("Total de reproducoes: " + getTotalReproducoes());
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Classificacao: " + getClassificacao());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Host: " + getHost());
    }
}
