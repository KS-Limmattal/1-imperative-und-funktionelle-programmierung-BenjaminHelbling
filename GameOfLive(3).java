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

    public static int tod(){
        new_map[a][b] = 0;
    }

    public static int leben(){
        new_map[a][b] = 1;
    }

    public static int next(){
        anzahl_tod = 0;
        anzahl_leben = 0;
        for(int i = a-1; i<= a+1; i++){
            for(int j = b-1; j<= b+1; j++){
                if (i!= 0 && j!= 0){
                    if(old_map[i][j] == 0){
                        anzahl_tod ++;
                    }
                    else {
                        anzahl_leben ++;
                    }
                }
            }
        }
        statusVerändern()
    }

    public static int statusVerändern(){
        if (old_map[a][b] == 0 && anzahl_leben == 3){
            leben(a,b);
        }
        if (old_map[a][b] ==1 && ( anzahl_leben ==2 || anzahl_leben == 3) ){

        }
        else {
            tod(a,b);
        }
    }

    
    
}
