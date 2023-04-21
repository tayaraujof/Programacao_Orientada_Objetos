import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos;
    private ArrayList<Heroi> herois;

    public Mapa() {
        inimigos = new ArrayList<>();
        herois = new ArrayList<>();
    }

    public Mapa(String nome, int altura, int largura, ArrayList<Inimigo> inimigos, ArrayList<Heroi> herois) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.inimigos = inimigos;
        this.herois = herois;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public ArrayList<Inimigo> getInimigos() {
        return inimigos;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public Inimigo getInimigoMaiorAtaque() {
        int maiorAtaque = 0;
        int index = 0;
        for (int i =0; i < inimigos.size(); i++){
            if(inimigos.get(i).getAtaque() > maiorAtaque){
                maiorAtaque = inimigos.get(i).getAtaque();
                index = i;
            }
        }
        return inimigos.get(index);
    }
}

