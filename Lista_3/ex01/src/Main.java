public class Main {
    public static void main(String[] args) {
    Inimigo inimigo = new Inimigo();
    inimigo.ataque = 75;
    inimigo.defesa = 66;
    inimigo.pontos = 80;

    Inimigo inimigo1 = new Inimigo();
    inimigo1.ataque = 78;
    inimigo1.defesa = 70;
    inimigo1.pontos = 91;

    Heroi heroi = new Heroi();
    heroi.ataque = 77;
    heroi.defesa = 67;
    heroi.pontos = 87;

    Mapa mapa = new Mapa();
    mapa.nome = "Vingadores";
    mapa.altura = 100;
    mapa.largura = 75;
    mapa.inimigos.add(inimigo);
    mapa.inimigos.add(inimigo1);

    Inimigo inimigoComMaiorAtaque = mapa.getInimigoMaiorAtaque();

        System.out.println(inimigoComMaiorAtaque.pontos);

    }
}