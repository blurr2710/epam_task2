package practice;
class Practice
{
//function to add
public static int add(int a,int b)
{
    return a+b;
}
//overloaded function to add decimal values
public static double add(double a,double b)
{
    return a+b;
}
//function to subtract
public static int subtract(int a,int b)
{
    return a-b;
}
//overloaded function to subtract decimal values
public static double subtract(double a,double b)
{
    return a-b;
}
//function to divide
public static int divide(int a,int b)
{int result;
    try
    {
        result=a/b;
    }
    catch(ArithmeticException e)
    {
        return -1;
    }
    return result;
}
//function to divide decimal values
public static double divide(double a,double b)
{  double result=a/b;
    try
    {
        result=a/b;}
    catch(ArithmeticException e)
    {
        return 0.0;
    }
    return result;
}

