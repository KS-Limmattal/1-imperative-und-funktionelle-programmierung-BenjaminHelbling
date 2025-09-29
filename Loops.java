public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static void primeFactorisation(int n) { 
        System.out.print("Prime factorisation of " + n + " = ");
        int factor = 2;
        while (n!=1){
            if (n % factor == 0) {
                System.out.print(factor);
                n = n / factor ;
                if (n != 1) {
                    System.out.print(" * ");
                }
            }
            else{
                factor++;
            }
        
        }
        System.out.println(  );
        
    } 

    public static double pi(int digits){
        long precision = (long) Math.pow(10, digits) * 4 +2;
        double zahl = 0;
        for (int n = 0; n < precision; n++){
            int i = 0;
            zahl = zahl + ((hoch(n)) / (2.0* n +1  ));
        }
        return zahl  * -4;
    }

    public static int hoch(int digits){
        int a = -1;
        for (int i = 0; i < digits; i++){
            a = a * -1;
        }
        return a;
    }

    public static void main(String[] args){
       
        // TODO: Schreibe mehr Testcode
        //.out.println(primeFactorisation(8));
        primeFactorisation(12);
        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}
