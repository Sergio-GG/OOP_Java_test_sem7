package Model;

public class ComplexNumber{
    double firstNum;
    double secondNum;
    final static int powI = -1;

    public ComplexNumber(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

}
