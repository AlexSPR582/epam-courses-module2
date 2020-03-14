package by.epam.courses.module2.array_sort.task8;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction fraction3 = new Fraction(2, 3);
        FractionLogic fl = new FractionLogic();
        System.out.println("Общий знаменатель: " + fl.findCommonDenominator(fraction1, fraction2, fraction3));
        System.out.println("Сортировка дробей:");
        fl.print(fl.sort(fraction1, fraction2, fraction3));
    }
}
