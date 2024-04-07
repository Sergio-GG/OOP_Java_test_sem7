package Controller;

import Model.*;
import View.*;

import java.util.Scanner;

public class Controller {
    ComplexNumberOperator complexNumberOperator;
    View view;
    Scanner scanner = new Scanner(System.in);

    public void runCalc(){
        this.view = new ConsoleView();
        view.greeting();
        view.menu();
        int choice = scanner.nextInt();
        switch(choice){
            case 1 -> {
                view.inputFirst();
                int first = scanner.nextInt();
                view.inputSecond();
                int second = scanner.nextInt();
                ComplexNumber complexNumber1 = new ComplexNumber(first,second);
                view.printFirstExpression(complexNumber1);
                view.inputFirst();
                int first1 = scanner.nextInt();
                view.inputSecond();
                int second1 = scanner.nextInt();
                ComplexNumber complexNumber2 = new ComplexNumber(first1, second1);
                view.printSecondExpression(complexNumber2);
                this.complexNumberOperator = new ComplexNumberOperator(complexNumber1, complexNumber2);
                double[] array = complexNumberOperator.sum();
                view.printDoubleResult(array);
            }
            case 2 -> {
                view.inputFirst();
                int first = scanner.nextInt();
                view.inputSecond();
                int second = scanner.nextInt();
                ComplexNumber complexNumber1 = new ComplexNumber(first,second);
                view.printFirstExpression(complexNumber1);
                view.inputFirst();
                int first1 = scanner.nextInt();
                view.inputSecond();
                int second1 = scanner.nextInt();
                ComplexNumber complexNumber2 = new ComplexNumber(first1, second1);
                view.printSecondExpression(complexNumber2);
                this.complexNumberOperator = new ComplexNumberOperator(complexNumber1, complexNumber2);
                double[] array = complexNumberOperator.multiply();
                view.printDoubleResult(array);
            }
            case 3 -> {
                view.inputFirst();
                int first = scanner.nextInt();
                view.inputSecond();
                int second = scanner.nextInt();
                ComplexNumber complexNumber1 = new ComplexNumber(first,second);
                view.printFirstExpression(complexNumber1);
                view.inputFirst();
                int first1 = scanner.nextInt();
                view.inputSecond();
                int second1 = scanner.nextInt();
                ComplexNumber complexNumber2 = new ComplexNumber(first1, second1);
                view.printSecondExpression(complexNumber2);
                this.complexNumberOperator = new ComplexNumberOperator(complexNumber1, complexNumber2);
                double[] array = complexNumberOperator.division();
                view.printDoubleResult(array);
            }
        }
    }
}
