package opgave02;

import opgave02.models.Range;

public class Opgave02 {
    public static void main(String[] args) {
        Range range = new Range(1, 10);
        for (int number : range) {
            System.out.println(number);
        }
    }
}
