public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.duracaoEmSegundos = 160;
        musica.popularidade = 8;

        Musica musica1 = new Musica();
        musica1.duracaoEmSegundos = 120;
        musica1.popularidade = 9;

        Album album = new Album();
        album.nome = "My Everything";
        album.nomeArtista = "Ariana Grande";

        album.musicas.add(musica);
        album.musicas.add(musica1);

        Musica musicaComMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaComMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println(musicaComMaiorPopularidade.popularidade);
        System.out.println(musicaComMenorDuracao.duracaoEmSegundos);
    }
}