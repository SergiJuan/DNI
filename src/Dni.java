public class Dni {
    private int number;
    private char letter;
    private final static char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Dni() {
        this.number = 0;
    }

    public Dni(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    public Dni(int number) {
        this.number = number;
        this.letter = letterForDni(number);
    }

    public Dni(String s) {
        String numStr = s.substring(0, s.length() - 1);
        this.number = Integer.parseInt(numStr);
        this.letter = s.charAt(s.length() - 1);
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static char letterForDni(int number) {
        return LETTERS[number % 23];
    }

    public static String nifForDni(int number) {
        return ""+ number + letterForDni(number);
    }

    public boolean isCorrect() {
        return number >=0;
    }

    @Override
    public String toString() {
        return nifForDni(number);
    }

    public String toFormattedString() {
        return String.format("%,d",getNumber())  + "-" + getLetter();
    }
}
