public class Main {
    public static void main(String[] args) {
        DNI dni1 = new DNI(54788926, 'E');
        System.out.println(dni1);
        System.out.println(dni1.isCorrectDNI());

        DNI dni2 = new DNI("54788926E");
        System.out.println(dni2);
    }
}
