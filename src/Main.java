public class Main {
    public static void main(String[] args) {
        Pizza p1= new Pizza("margarita", "mitjana");
        Pizza p2= new Pizza("funghi", "familiar");
        p2.sirve();
        System.out.println(p1);
        System.out.println("demanades: ");
    }
}