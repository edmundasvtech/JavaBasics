package com.example.javabasics;

// Pirma užduotis:
public class JavaBasics {
    public static void main(String[] args) {
        /*
            Antra užduotis:
             Edmundas Kaminskas PRIF20/3 20184342
         */
        String vardas="Edmundas";
        String pavarde="Kaminskas";
        int n=vardas.length();
        int m=pavarde.length();

        // Trečia užduotis:

        int[][] masyvas = new int [n][m];

        // Ketvirta užduotis

        int balses=0;
        for (int i=0 ; i<vardas.length(); i++){
            char ch = vardas.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                balses ++;
            }
        }

        int a=balses;
        int b=vardas.length()+pavarde.length();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                masyvas[i][j]=a+(int)(Math.random()*((b-a)+1));

            }
        }


    }

}
