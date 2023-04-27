public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();

        grupo.adicionarHeroi(new Heroi(1, "Tempestade", 20));
        grupo.adicionarHeroi(new Heroi(2, "Ravena", 45));
        grupo.adicionarHeroi(new Heroi(3, "Vampira", 15));
        grupo.adicionarHeroi(new Heroi(3, "Vampira", 15));

        grupo.removerHeroiDoGrupo(1);

        System.out.println("O total de moedas de ouro do grupo é: " + grupo.getTotalMoedasDeOuro());
    }
}
