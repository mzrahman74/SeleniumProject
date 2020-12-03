package org.Java;

public class string {
  public static void main(String[] args) {

      String a = "Hello World";
      // String b = "Hello World";

      String b = new String ("Hello World");

    System.out.println(a.charAt(2));
    System.out.println(b.indexOf("r"));
    Sub();
    rever();
  }

  public static void Sub(){
      String c ="JavaTraining is very good  training course ever  take.";
    System.out.println(c.substring(3,6));
    System.out.println(c.substring(5));
    System.out.println(c.concat (" Mohammad teaches."));
    System.out.println(c.trim());
    System.out.println(c.toUpperCase());

    c.toLowerCase();

    String arr[] = c.split("T");
    System.out.println(arr[0]);
   System.out.println(arr[1]);
    System.out.println(c.replace("T", "S"));
  }

  public static void rever(){
      String sr = "madam";
      String reverse = "";
      for(int i=sr.length()-1; i>=0; i--){
          reverse= reverse + sr.charAt(i);
      }
    System.out.println(reverse);
  }
}
// Plidrome 