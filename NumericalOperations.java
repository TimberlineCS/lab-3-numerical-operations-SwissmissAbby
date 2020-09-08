public class NumericalOperations{

  public static void main(String args[]){

    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;

    System.out.println(57.2 * (i1 / i2) + 1);
    System.out.println(57.2 * ((double)i1 / i2) + 1);
    System.out.println(15 - i1 * (d1 * 3) + 4);
    System.out.println(15 - i1 * ((int)d1 * 3) + 4);
    System.out.println(15 - i1 * (int)(d1 * 3) + 4);
    

    int n = 1234;
    int n1 = 1234;
    int rev;
    String revNum = "";
    rev = n % 10;
    n/=10;
    revNum = revNum + rev;
    rev = n % 10;
    n/=10;
    revNum = revNum + rev;
    rev = n % 10;
    n/= 10;
    revNum = revNum + rev;
    revNum += n;
    System.out.print(revNum + " " + n1);

  }

}