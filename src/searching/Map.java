/**
 * Created by Cokoten on 2016/11/29.
 */
package searching;

import java.util.Scanner;
import java.io.FileNotFoundException;     //ファイルがなかった時の例外処理
import java.io.File;


public class Map {
    int start_x,start_y;
    int mapsize[];
    char map[][];               //マップ(char型二次元配列)
    String goal;                //ゴール位置



    public static void main(String args[]) {
        try {

            File file = new File("map.txt");
            Scanner scan = new Scanner(file);
            scan.useDelimiter("¥¥r¥¥n");
            int line = 1;
            String str = scan.next();
            //System.out.println(str);

            String[] str1 = str.split("\n");
            String[] Start = str1[0].split(" ");
            String[] Size = str1[1].split(" ");

            start_x = Integer.perseInt(Start[0]);
            //start_y = (int)Start[1];


            //mapSize

            //char start_x = str.charAt(1);
            //int X = Integer.parseInt(""+start_x);
            //start_y = str.charAt(1);
            System.out.println(start_x);

            /*scan.useDelimiter("¥¥r¥¥n");



            char mapdata[][]= new char[][100];

            int i = 0;
            while(i<100){
                mapdata[i] = str.charAt(i);
                System.out.println(mapdata[i]);
                i++;
                if(i==20)break;
            }


            //char start_X = str.charAt();
            //char start_Y = str.charAt();
            //System.out.println(start_X + start_Y);
            //char mapData[][];
            //str.toCharArray();



            /*while (scan.hasNext()) {
                String str = scan.next();
                System.out.println(line + ":\n" + str);
                line++;
            }*/

            //System.out.println(line);


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
