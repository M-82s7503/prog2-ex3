import searching.Map;
import searching.Player;

public class ExMain{
    public static void main(String[] args) {
        Map map = new Map();

        System.out.println(map.val);    //迷路インスタンスの生成

        int[] place = {map.start_x, map.start_y};
        Player player = new Player(place, Map.getmap());

        place = player.getPlace(); //プレイヤーインスタンス
        System.out.println(place);

        map.printMap(player.getPlace());

        player.moveLeft();               //移動

        map.printMap(player.getPlace());

        player.moveDown();

        map.printMap(player.getPlace());

        player.moveRight();              //右に移動（できない）

        map.printMap(player.getPlace());  //位置が変わっていないことの確認
    }

}
