package searching;

/**
 * Created by M.R on 2016/12/20.
 */
public class Player {
    private int[] place;   //プレイヤーの位置。[横, 縦](原点左上端)
    private int count;   //歩数

    public Player(int[] place){
        this.place = place;
        this.count = 0;
    }

    //　壁にぶつかったら止まる
    public void moveUp(){     // 上に一歩移動するメソッド
        place[1]--;
        count++;
    }
    public void moveDown(){   // 下に一歩移動するメソッド
        place[1]++;
        count++;
    }
    public void moveRight(){  // 右に一歩移動するメソッド
        place[0]++;
        count++;
    }

    public void moveLeft(){   // 左に一歩移動するメソッド
        place[0]--;
        count++;
    }

    public int[] getPlace(){
        return place;
    }
    public int getCount(){
        return count;
    }


}
