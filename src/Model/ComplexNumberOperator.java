package Model;

public class ComplexNumberOperator implements ComplexNumberSum, ComplexNumberMulty, ComplexNumberDiv{
    ComplexNumber complexNumber1;
    ComplexNumber complexNumber2;

    public ComplexNumberOperator(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        this.complexNumber1 = complexNumber1;
        this.complexNumber2 = complexNumber2;
    }

    @Override
    public double[] division() {
        double[] arr = new double[2];
        int num1 = (int)Math.pow(complexNumber2.getFirstNum(),2);
        int num2 = (int)Math.pow(complexNumber2.getSecondNum(),2);
        if(complexNumber2.getSecondNum() > 0){
            int down = num1 + num2;

            double number1 = complexNumber1.getFirstNum() * complexNumber2.getFirstNum();
            double number1i = complexNumber1.getFirstNum() * complexNumber2.getSecondNum() * -1;
            double number2i = complexNumber1.getSecondNum() * complexNumber2.getFirstNum();
            double numberPowI = complexNumber1.getSecondNum() * complexNumber2.getSecondNum() * -1;
            double res1 = number1 + numberPowI * ComplexNumber.powI;
            double res2 = number1i + number2i;

            arr[0] =  res1 / down;
            arr[1] = res2 / down;
        }
        else if(complexNumber2.getSecondNum() < 0){
            int down = num1 + num2;

            double number1 = complexNumber1.getFirstNum() * complexNumber2.getFirstNum();
            double number1i = complexNumber1.getFirstNum() * complexNumber2.getSecondNum() * -1;
            double number2i = complexNumber1.getSecondNum() * complexNumber2.getFirstNum();
            double numberPowI = complexNumber1.getSecondNum() * complexNumber2.getSecondNum() * -1;
            double res1 = number1 + numberPowI * ComplexNumber.powI;
            double res2 = number1i + number2i;

            arr[0] =  res1 / down;
            arr[1] = res2 / down;
        }
        return arr;
        // example. (2 + 3i) / (4 - 5i)
        // (2 + 3i) * (4 + 5i) / 16 + 25
        // 8 + 10i + 12i + 15i(2) / 41
        // 8 - 15 + 22i / 41
        // -7 / 41 + 22i / 41
    }

    @Override
    public double[] multiply() {
        double[] arr = new double[2];
        double num1 = complexNumber1.getFirstNum() * complexNumber2.getFirstNum();
        double num1i = complexNumber1.getFirstNum() * complexNumber2.getSecondNum();
        double num2i = complexNumber1.getSecondNum() * complexNumber2.getFirstNum();
        double numPowI = complexNumber1.getSecondNum() * complexNumber2.getSecondNum();
        arr[0] = num1 + numPowI * ComplexNumber.powI;
        arr[1] = num1i + num2i;
        return arr;
    }

    @Override
    public double[] sum() {
        double[] arr = new double[2];
        arr[0] = complexNumber1.getFirstNum() + complexNumber2.getFirstNum();
        arr[1] = complexNumber1.getSecondNum() + complexNumber2.getSecondNum();
        return arr;

    }
}
