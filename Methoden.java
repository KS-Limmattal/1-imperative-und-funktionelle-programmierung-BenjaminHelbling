public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static void hours(int seconds) {
        int minutes;
        minutes = seconds / 60;
        seconds = seconds % 60 ;
        int hours;
        hours = minutes / 60 ;
        minutes = minutes % 60 ;
        System.out.println(((hours > 9) ? hours : "0"+ hours) + ":" + ((minutes > 9) ? minutes : "0" + minutes) + ":" +((seconds > 9) ? seconds : "0" + seconds ));
    }
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        hours(3);
        hours(75);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
