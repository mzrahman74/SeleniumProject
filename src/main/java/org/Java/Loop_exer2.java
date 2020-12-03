package org.Java;

public class Loop_exer2 {
    public static void main(String[] args) {
       int k=3;
        for (int i=3; i<=18; i++){
            // System.out.println(i);
            for (int j=3; j<=i; j++){
                System.out.print(k);
                System.out.print("\t");
                k+=3;


            }
            System.out.println("");
        }
ArrayMethod();
        MaxMethod();

    }

    public static void ArrayMethod(){
        int abc[][]={{2,5,5}, {3,4,7}, {1,2,9}};
        int min = abc [0][0];
        int minrow = 0;
        int mincol = 0;

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++){
                if (abc[i][j]<min) {
                    min =abc[i][j];
                    mincol=j;
                    minrow =i;
                }
            }
        }
    System.out.println(min);
    System.out.println(mincol);
    System.out.println(minrow);
    }

    public static void MaxMethod(){
        int cbc[][]= {{4, 5, 6}, {9,6,10},{11,15,18}};
        int max = cbc [0][0];
        for (int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if (cbc [i][j]>max) {
                    max = cbc[i][j];

                }
            }
        }
    System.out.println(max);
    }
}

// 3
// 6 9
// 12 15 18

/*
2 5 5
3 4 7
1 2 9

 */