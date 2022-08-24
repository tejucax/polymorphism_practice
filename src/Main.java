public class Main {
    public static void main(String[] args) {
        Printer colored = new Colored();
        colored.print();
        Printer blackandwhite = new BlackandWhite();
        blackandwhite.print();
    }
}
