public class mainmamalia {

    public static void main(String[] args) {


        mamalia mama=new mamalia();
        monyet kera=new monyet();
        paus ikan=new paus();

        System.out.println("Paus berjenis tulang : "+ikan.tulang);
        mama.tulang();

        System.out.println("Monyet bernafas dengan : "+kera.nafas);

        kera.habitat();
        ikan.habitat();

    }
}
