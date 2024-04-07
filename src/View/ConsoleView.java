package View;

import Model.ComplexNumber;

public class ConsoleView implements View {
    @Override
    public void greeting() {
        System.out.println("Здравствуйте, ознакомьтесь с меню: ");
    }

    @Override
    public void menu() {
        System.out.println("Выберите арифметическую операцию: \n" +
                "1. Сложение\n" +
                "2. Умножение\n" +
                "3. Деление");
    }

    @Override
    public void inputFirst() {
        System.out.println("Введите первое число: ");
    }

    @Override
    public void inputSecond() {
        System.out.println("Введите второе число: ");
    }

    @Override
    public void mergeFirstInputs() {
        System.out.println("Введите значение для первого комплексного числа: ");
    }
    public void mergeSecondInputs() {
        System.out.println("Введите значение для второго комплексного числа: ");
    }

    public void printDoubleResult(double[] arr) {
        if(arr[1] < -1 && arr[0] != 0){
            System.out.printf("Ответ: %.3f%.3fi\n", arr[0], arr[1]);
        } else if (arr[1] == -1 && arr[0] != 0) {
            System.out.printf("Ответ: %.3f-i\n", arr[0]);
        } else if (arr[1] == 0 && arr[0] != 0) {
            System.out.printf("Ответ: %.3f\n", arr[0]);
        } else if (arr[1] == 1 && arr[0] != 0) {
            System.out.printf("Ответ: %.3f+i\n", arr[0]);
        } else if (arr[0] == 0 && arr[1] == -1) {
            System.out.println("Ответ: -i\n");
        } else if (arr[0] == 0 && arr[1] == 1) {
            System.out.println("Ответ: i\n");
        } else if (arr[0] == 0 && arr[1] < -1) {
            System.out.printf("Ответ: %.3fi\n", arr[1]);
        } else if (arr[0] == 0 && arr[1] > 1) {
            System.out.printf("Ответ: %.3fi\n", arr[1]);
        } else System.out.printf("Ответ: %.3f+%.3fi\n", arr[0], arr[1]);
    }

    @Override
    public void printFirstExpression(ComplexNumber complexNumber) {
        if(complexNumber.getSecondNum() < -1 && complexNumber.getFirstNum() != 0){
            System.out.printf("Первое число: %.1f%.1fi\n", complexNumber.getFirstNum(), complexNumber.getSecondNum());
        } else if (complexNumber.getSecondNum() == -1 && complexNumber.getFirstNum() != 0) {
            System.out.printf("Первое число: %.1f-i\n", complexNumber.getFirstNum());
        } else if (complexNumber.getSecondNum() == 0 && complexNumber.getFirstNum() != 0) {
            System.out.printf("Первое число: %.1f\n", complexNumber.getFirstNum());
        } else if (complexNumber.getSecondNum() == 1 && complexNumber.getFirstNum() != 0) {
            System.out.printf("Первое число: %.1f+i\n", complexNumber.getFirstNum());
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() == -1) {
            System.out.println("Первое число: -i\n");
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() == 0) {
            throw new RuntimeException("Такое число невозможно");
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() == 1) {
            System.out.println("Первое число: i\n");
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() < -1) {
            System.out.printf("Первое число: %.1fi\n", complexNumber.getSecondNum());
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() > 1) {
            System.out.printf("Первое число: %.1fi\n", complexNumber.getSecondNum());
        } else System.out.printf("Первое число: %.1f+%.1fi\n", complexNumber.getFirstNum(), complexNumber.getSecondNum());
    }
    @Override
    public void printSecondExpression(ComplexNumber complexNumber) {
        if(complexNumber.getSecondNum() < -1 && complexNumber.getFirstNum() != 0){
            System.out.printf("Второе число: %.1f%.1fi\n", complexNumber.getFirstNum(), complexNumber.getSecondNum());
        } else if (complexNumber.getSecondNum() == -1 && complexNumber.getFirstNum() != 0) {
            System.out.printf("Второе число: %.1f-i\n", complexNumber.getFirstNum());
        } else if (complexNumber.getSecondNum() == 0 && complexNumber.getFirstNum() != 0) {
            System.out.printf("Второе число: %.1f\n", complexNumber.getFirstNum());
        } else if (complexNumber.getSecondNum() == 1 && complexNumber.getFirstNum() != 0) {
            System.out.printf("Второе число: %.1f+i\n", complexNumber.getFirstNum());
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() == -1) {
            System.out.println("Второе число: -i\n");
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() == 0) {
            throw new RuntimeException("Такое число невозможно");
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() == 1) {
            System.out.println("Второе число: i\n");
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() < -1) {
            System.out.printf("Второе число: %.1fi\n", complexNumber.getSecondNum());
        } else if (complexNumber.getFirstNum() == 0 && complexNumber.getSecondNum() > 1) {
            System.out.printf("Второе число: %.1fi\n", complexNumber.getSecondNum());
        } else System.out.printf("Второе число: %.1f+%.1fi\n", complexNumber.getFirstNum(), complexNumber.getSecondNum());
    }

}
