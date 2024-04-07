package View;

import Model.ComplexNumber;

public interface View {
    public void greeting();
    public void menu();
    public void inputFirst();
    public void inputSecond();
    public void mergeFirstInputs();
    public void mergeSecondInputs();
    public void printDoubleResult(double[] arr);
    public void printFirstExpression(ComplexNumber complexNumber);
    public void printSecondExpression(ComplexNumber complexNumber);

}
