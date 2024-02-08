package br.com.lucas.minhasmusicas.models;
import java.util.Scanner;
public class Musica extends Audio{

    //Scanner
    Scanner sc = new Scanner(System.in);
    private String album;
    private String artista;
    private String genero;


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Metodos
    @Override
    public void mostraDescricao(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracao: " + getDuracao() + " minutos");
        System.out.println("Total de reproducoes: " + getTotalReproducoes());
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Classificacao: " + getClassificacao());
        System.out.println("Genero: " + getGenero());
        System.out.println("Album: " + getAlbum());
        System.out.println("Artista: " + getArtista());
    }
}
