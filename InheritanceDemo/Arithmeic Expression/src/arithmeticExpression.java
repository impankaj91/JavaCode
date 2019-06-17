public class arithmeticExpression {
    // create an constructor of class.
    double number1,number2;
    public arithmeticExpression(double number1,double number2)
    {
      this.number1=number1;
      this.number2=number2;
    }
    public void addition()
    {
        double add=number1+number2;
        System.out.println("Your Resultant Value Of sum: "+add);

    }
    public void subtraction()
    {
        double sub=number1-number2;
        System.out.println("Your Resultant Value Of subtraction: "+sub);

    }
    public void multiplication()
    {
        double mul=number1*number2;
        System.out.println("Your Resultant Value Of multiplication "+mul);
    }
    public void division()
    {
        double div=number1/number2;
        System.out.println("Your Resultant Value Of division "+div);
    }
}
