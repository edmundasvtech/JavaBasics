
package com.example.javabasics;

import java.util.Arrays;

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

        for(int i=0; i<m; i++){
            if (i == 0){
                System.out.print(" "+"\t");
            }

            System.out.print( (i) + " "+"\t");
        }

        System.out.println();

        for(int i=0; i<n; i++){
            System.out.print((i ) + "|" +"\t" );

            for(int j=0; j<m; j++){
                System.out.print(masyvas[i][j] + " "+"\t");
            }
            System.out.println("\t");
        }

        //Penkta užduotiss

        double[] eiluciuVidurkiai = new double [n];
        double[] stulpeliuVidurkiai = new double [m];

        int eiluciuSuma = 0;
        int stulpeliuSuma = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                eiluciuSuma += masyvas[i][j];
            }
            eiluciuVidurkiai[i] = (double) eiluciuSuma / n;
            eiluciuSuma = 0;
        }

        System.out.println("Eiluciu vidurkiai");
        System.out.println(Arrays.toString(eiluciuVidurkiai));

        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                stulpeliuSuma += masyvas[i][j];
            }
            stulpeliuVidurkiai[j] = (double) stulpeliuSuma / n;
            stulpeliuSuma = 0;
        }

        System.out.println();
        System.out.println("Stulpeliu Vidurkiai");
        System.out.println(Arrays.toString(stulpeliuVidurkiai));

        //Sesta uzduotis

        int kiekSkaiciu = 0;

        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(masyvas[i][j] > eiluciuVidurkiai[i]){
                    kiekSkaiciu++;
                }
            }
            System.out.println("Eilute: " + (i) + "    " + "skaiciai didesni nei eilutes vidurkis:" + kiekSkaiciu);
            kiekSkaiciu = 0;
        }

        System.out.println();

        //Septinta uzduotis

        int didziausiaReiksme = masyvas[1][1];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if ((a-1) != i && (a-1) != j && masyvas[i][j] > didziausiaReiksme){
                    didziausiaReiksme = masyvas[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Didziausia reiksme neitraukiant " + a  + " eilutes " + a  + " ir stulpelio yra: " +  didziausiaReiksme);

        //Astunta uzduotis

        int[] masyvasIsrikiuotas = masyvas[a].clone();
        Arrays.sort(masyvasIsrikiuotas);

        System.out.println();
        System.out.println("Eilute:");
        System.out.println(Arrays.toString(masyvasIsrikiuotas));

        //Devinta uzduotis

        double maziausias = stulpeliuVidurkiai[0];
        int column = 0;

        for(int i=0; i<m; i++){
            if(stulpeliuVidurkiai[i] < maziausias){
                maziausias = stulpeliuVidurkiai[i];
                column = i;
            }
        }

        System.out.println();
        System.out.println("Zemiausia vidurki turintis stulpelis: " + (column) + " kurio vidurkis yra: " + maziausias);
    }

}
