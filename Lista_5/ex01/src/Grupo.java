import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;

    public Grupo() {
        this.herois = new ArrayList<>();
    }

    public void adicionarHeroi(Heroi heroi) {
        for (Heroi h : herois) {
            if (h.getId() == heroi.getId()) {
                System.out.println("A heroína já está no grupo");
                return;
            }
        }

        herois.add(heroi);
        totalMoedasDeOuro += heroi.getQuantidadeDeMoedasDeOuro();
        System.out.println("A heroína " + heroi.getNome() + " foi adicionada ao grupo!");
    }

    public void removerHeroiDoGrupo(int idHeroi) {
        for (Heroi heroi : herois) {
            if (heroi.getId() == idHeroi) {
                totalMoedasDeOuro -= heroi.getQuantidadeDeMoedasDeOuro();
                herois.remove(heroi);
                System.out.println("A heroína: " + heroi.getNome() + " foi removida do grupo!");
                return;
            }
        }
        System.out.println("A heroína não está no grupo");
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public int getTotalMoedasDeOuro() {
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}

