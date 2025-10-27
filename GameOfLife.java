import java.util.Arrays;


public class GameOfLife{


    public static int anzahl_leben = 0;
    public static int anzahl_tod = 0;

    public static int a = 0;
    public static int b = 0;

    public static int[][] new_map = {{0,1,0,0},
        {1,1,0,1},
        {1,1,0,0},
        {0,0,1,1,}
    };

    public static int[][] old_map = {{0,1,0,0},
        {1,1,0,1},
        {1,1,0,0},
        {0,0,1,1,}
    };

    public static int grösseFeld = new_map.length * new_map.length;

    public static void tod(){
        new_map[a][b] = 0;
    }

    public static void leben(){
        new_map[a][b] = 1;
    }

    public static void next(){
        anzahl_tod = 0;
        anzahl_leben = 0;
        for(int i = a-1+ old_map.length % old_map.length; i<= a+1+old_map.length % old_map.length; i++){
            for(int j = b-1+ old_map.length % old_map.length; j<= b+1+ old_map.length % old_map.length ; j++){
                if (i!= a+old_map.length && j!= b+old_map.length){
                    if (old_map[i][j] == 0){
                        anzahl_tod ++;
                    }
                    else {
                        anzahl_leben ++;
                    }
                }
            }
        }
        statusVerändern();
    }

    public static void statusVerändern(){
        if (old_map[a][b] == 0 && anzahl_leben == 3){
            leben();
        }
        if (old_map[a][b] ==1 && ( anzahl_leben ==2 || anzahl_leben == 3) ){

        }
        else {
            tod();
        }
    }

    public static void zyklus(){
        a = 0;
        b = 0;
        for (int c = 1; c < grösseFeld ; c++ ){
            next();
            a++;
            b++;
        }
        old_map = new_map.clone();
        System.out.println(old_map);
    }

    public static void main(String[] args) {
        for (int d = 1; d< 10; d++){
            zyklus();
        }
    }

}
