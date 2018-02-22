public class test {
  public static void main(String args[]){}
public long longTest() {return 42L; }
public void logicTest() {
  long a = 1, b = 2, c = 3, d = 4;
  //if (a == b) {}
  //if (c > d) {}
  //if (a <= b) {}
  if (a > b && c < d || a <= c) {
    System.out.println("yo");
  }
  boolean test = a > b && c < d || a >= c || b <= c;
  }

  public void typeTest(boolean b, byte c, char d, int e, long f) {}

  public void powTest() {
    double res = Math.pow(1, 2);
  }

  public void paramTest(int... a) {}
  public void paramTest2(Object... o) {}
  public void paramTest3(Object o[]) {}

  public void strTest(String a, String b){
    String c = a + b;
  }
  public void strTest2(String a, String b){
    String c = a.concat(b);
  }

  public void ifTest(boolean c) {
    boolean t, f;
    if (c) {
      t = c;
    } else {
      f = c;
    }
  }
}
