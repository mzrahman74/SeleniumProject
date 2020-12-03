package org.Java;

public class OneLoop {
  public static void main(String[] args) {
      int t=3;
      for (int i =3; i<=18; i++) {
          for (int j=3; j<=i; j++){
              System.out.print(t);
              System.out.print("\t");
              t+=3;
          }
          System.out.println("");
      }

  }
}
