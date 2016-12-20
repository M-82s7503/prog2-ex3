/**
 * Created by Cokoten on 2016/11/29.
 */
package searching;

import java.util.Scanner;
import java.io.FileNotFoundException;     //ファイルがなかった時の例外処理
import java.io.File;


public class Map {
    static int start_x,start_y;
    static int mapsize[] = new int[2];
    char[][] map;               //マップ(char型二次元配列)
    String goal;                //ゴール位置



    public static void main(String args[]) {
        try {

            File file = new File("/Users/Cokoten/soft2/prog2-ex3/src/map.txt");
            Scanner scan = new Scanner(file);
            scan.useDelimiter("\\r\\n");
            int line = 1;
            // マップ
            String str = scan.next();

            // 改行で区切る
            String[] str1 = str.split("\n");
            // 一行目を読み込み
            String[] start = str1[0].split(" ");
            // スペースで区切る
            String[] size = str1[1].split(" ");

            start_x = Integer.parseInt(start[0]);
            start_y = Integer.parseInt(start[1]);

            mapsize[0] = Integer.parseInt(size[0]);
            mapsize[1] = Integer.parseInt(size[1]);

            //mapSize
            System.out.println("" + start_x +","+ start_y);
            System.out.println("" + mapsize[0] +","+ mapsize[1] );



//            int i = 0;
//            while(i<100){
//                mapdata[i] = str.charAt(i);
//                System.out.println(mapdata[i]);
//                i++;
//                if(i==20)break;
//            }



        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
