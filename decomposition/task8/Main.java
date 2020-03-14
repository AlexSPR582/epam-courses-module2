package by.epam.courses.module2.decomposition.task8;

public class Main {
    public static void main(String[] args) {
        DecompositionTask8 task8 = new DecompositionTask8();
        int[] array = {5, 6, 3, 4, 43};
        System.out.println("Сумма последовательно стоящих трёх элементов: ");
        System.out.println(task8.sumThreeElement(1, array));
    }
}
