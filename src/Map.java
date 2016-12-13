/**
 * Created by Cokoten on 2016/11/29.
 */
package Map;

import java.util.Scanner;
import java.io.FileNotFoundException;     //ファイルがなかった時の例外処理
import java.io.File;


public class Map {

    public static void main(String args[]) {
        try {
            File file = new File("map.txt");
            Scanner scan = new Scanner(file);
            scan.useDelimiter("¥¥r¥¥n");


            int line = 1;


            String str = scan.next();
            //System.out.println(str);

            int i = 0;
            char mapdata[];
                while(i<100){
                    mapdata[i] = str.CharAt(i);
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

            System.out.println(line);


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
