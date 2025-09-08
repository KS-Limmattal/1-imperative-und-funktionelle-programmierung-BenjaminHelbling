public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static void primeFactorisation(int n) {
        str zahlen;
        int zahl;
        while(n!=1){
            if (n % zahl < 1){
                zahlen.apppend((str)zahl)
                n = n % zahl
            }
            else{
                zahl++
         }
        System.out.println(zahlen);
    }
    public static void main(String[] args){
       
        // TODO: Schreibe mehr Testcode
        System.out.println(primeFactorisation(8));

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}
