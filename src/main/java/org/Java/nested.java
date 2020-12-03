package org.Java;

import org.jetbrains.annotations.TestOnly;

public class nested {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      System.out.println("Outer loop start here.");
      for (int j = 0; j <= 4; j++) {
        System.out.println("Inner Loop start here.");
      }
    }
    loop_exr();
   loo_exer1();
   lou_exer();
  }

  public static void loop_exr() {
    int k = 1;
    for (int i = 0; i <= 4; i++) {
      for (int j = 1; j <= 4 - i; j++) {
        System.out.println(k);
        System.out.println("\t");
        k++;
      }
    }
    System.out.println("");
  }
  public static void loo_exer1(){
    for (int i=1; i<5; i++) {
      for (int j=1; j<=i; j++) {
        System.out.println(j);
        System.out.println("\t");
      }
      System.out.println("");
    }
  }


  public static void lou_exer(){
    int k= 3;
    for (int i=3; i<=5; i++) {
      for (int j=3; j<=i; j++) {
        System.out.println(k);
        System.out.println("\t");
        k+=3;
      }
      System.out.println("");
    }
  }

}
