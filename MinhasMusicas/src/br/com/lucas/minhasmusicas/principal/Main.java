 package br.com.lucas.minhasmusicas.principal;
import br.com.lucas.minhasmusicas.models.Musica;
import br.com.lucas.minhasmusicas.models.Podcast;

public class Main {
    public static void main(String[] args) {


        //Musica 01
        Musica godsPlan = new Musica();


        godsPlan.setTitulo("God's Plan");
        godsPlan.setDuracao("3");
        godsPlan.setAlbum("Scorpion");
        godsPlan.setArtista("Drake");
        godsPlan.setGenero("Rap/Pop");
        godsPlan.mostraDescricao();

        godsPlan.daEspaco();

        godsPlan.reproduz();
        godsPlan.curte();


        //Podcast 01
        Podcast nerdcast = new Podcast();
        nerdcast.setDescricao("Um podcast sobre a serie de filmes do universo compartilhado da Marvel");
        nerdcast.setHost("Nilce e Leon");
        nerdcast.setTitulo("Vingadores");
        nerdcast.setDuracao("45");
        nerdcast.mostraDescricao();
        nerdcast.daEspaco();

        nerdcast.reproduz();
        nerdcast.curte();
    }
}
