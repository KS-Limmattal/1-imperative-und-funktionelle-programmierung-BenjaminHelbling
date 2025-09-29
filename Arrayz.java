import java.util.Arrays;

public class Arrayz {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static double[] sort(double[] liste){
        int n = 0;
        double a;
        double b;
        while (n < liste.length-1){
            if (liste[n]> liste[n+1]){
                a = liste[n];
                b = liste[n+1];
                liste[n] = b;
                liste[n+1] = a;
                n = 0;
            }
            else {
                n++;
            }
        }
        return(liste);
    }
    public static void isMagicSquare(int[][] square){
        int zahl1;
        int zahl2 = 0;
        zahl1 = square[0][0] + square[0][1] + square[0][2];
        for(int a = 0; a == square.length; a++){
            for(int b = 0; b ==square.length; b++){
                zahl2 = zahl2 + square[a][b];
                if (zahl2 != zahl1){
                    return("Ist kein Magic Square");
                }
                else{
                    for(int a = 0; a == square.length; a++){
                        for(int b = 0; b ==square.length; b++){
                            zahl2 = zahl2 + square[b][a];
                            if (zahl2 != zahl1){
                                return("Ist kein Magic Square");
                            }
                        }
                    }
                }
            }
        }
    }
        for(int a = 0; a == square.length; a++){
            for(int b = 0; b ==square.length; b++){
                zahl2 = zahl2 + square[b][a];
                if (zahl2 != zahl1){
                    return("Ist kein Magic Square");
                }
                if(b == square.length){
                    zahl2 = 0;
                }
            }
        }
        return("ist ein Magice Square");
    }
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        System.out.println(Arrays.toString(sort(new double[] {5,4,3,2,1})));
        System.out.println();
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe f)
       System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
               { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }
}
