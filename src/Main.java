public class Main {
    public static void main(String[] args) {
        Dni dni = new Dni(20925583);

        System.out.println(dni);
        System.out.println(dni.getNumber());
        System.out.println(dni.getLetter());
        System.out.println(Dni.nifForDni(dni.getNumber()));
        System.out.println(dni.isCorrectDni());
        System.out.println(dni.toFormattedString());

        System.out.println();

        Dni dni2 = new Dni("43411697W");
        System.out.println(dni2);
        System.out.println(dni2.getNumber());
        System.out.println(dni2.getLetter());
        System.out.println(Dni.nifForDni(dni2.getNumber()));
        System.out.println(dni2.isCorrectDni());
        System.out.println(dni2.toFormattedString());
    }
}