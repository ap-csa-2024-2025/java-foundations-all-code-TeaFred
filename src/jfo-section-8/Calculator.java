public class Calculator 
{
    public int add(int x, int y)
    {
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) 
    {
        return x / y;
    }

    try
    {
        double divResult = Calculator.divide(15,0);
        System.out.println("Division result: " + divResult);
    }

    catch (ArithmeticException Exception)
    {
        System.out.println("No division by 0.");
        Exception.printStackTrace();
    }
    System.out.println("Yay?");
}
