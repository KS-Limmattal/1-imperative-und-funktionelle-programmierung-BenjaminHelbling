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
    public static void distance(int x1, int y1, int x2, int y2) {
        int distance_x;
        distance_x = x2 - x1; 
        int distance_y;
        distance_y = y2 -y1;
        int distance_xy;
        distance_xy =(int) Math.sqrt(Math.pow(distance_x,2) + Math.pow(distance_y,2));
        System.out.println(distance_xy);
    }
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        hours(3);
        hours(75);
        hours(300);
        hours(123456789);
        System.out.println();

        // Test-Code für Teilaufgabe b)
        distance(0,0,10,10);
        distance(25,25,290,286);
        distance(8934,38447,345,4533);
        distance(-25,-5, 3,7 );
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
