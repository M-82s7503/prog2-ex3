package searching;

/**
 * Created by M.R on 2016/12/20.
 */
public class Player {
    private int[] place;   //プレイヤーの位置。[縦, 横](原点左上端)
    private int count;   //歩数
    private char[][] map;

    public Player(int[] place, char[][] map){
        this.place = place;
        this.count = 0;
        this.map = map;
    }

    public void moveUp(){     // 上に一歩移動するメソッド
        if (map[place[0]-1][place[1]] != '#'){
            place[0]--;
            count++;
        }
    }
    public void moveDown(){   // 下に一歩移動するメソッド
        if (map[place[0]+1][place[1]] != '#'){
            place[0]++;
            count++;
        }
    }
    public void moveRight(){  // 右に一歩移動するメソッド
        place[0]++;
        if (map[place[0]][place[1]+1] != '#'){
            place[1]++;
            count++;
        }
    }

    public void moveLeft(){   // 左に一歩移動するメソッド
        if (map[place[0]+1][place[1]] != '#'){
            place[1]--;
            count++;
        }
    }

    public int[] getPlace(){
        return place;
    }
    public int getCount(){
        return count;
    }


}
