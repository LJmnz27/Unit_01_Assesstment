package org.pursuit;

public class Overloader {

  public static double doubleDivision (int firstNumber, int secondNumber){
    double firstDouble = firstNumber;
    double secondDouble = secondNumber;
    double var1 = firstDouble/secondDouble;
    return var1;
  }
  public static double doubleDivision (int firstNumber, double secondNumber){
    double firstDouble = firstNumber;
    double var2 = firstDouble / secondNumber;
    return var2;
  }
  public static double doubleDivision ( double firsNumber, int secondNumber){
    double secondDouble = secondNumber;
    double var3 = firsNumber/secondDouble;
    return  var3;
  }
  public static double doubleDivision ( double firstNumber, double secondNumber){
     double var4 = firstNumber/secondNumber;
     return var4;
  }
}
