import searching.Map;
import searching.Player;

public class ExMain{
    public main(String[] args) {
        Map map = new Map();
        int[] place = {map.start_x, map.start_y};
        Player player = new Player(place);


        System.out.println(map.val);    //迷路インスタンスの生成

        Player player = new Player();
        System.out.println(player.val); //プレイヤーインスタンス

        map.printMap(map, plyer.getplace());

        plyer.moveLeft();               //移動

        map.printMap(map[][],plyer.place);

        plyer.moveDown();

        map.printMap(map[][],plyer.place);

        plyer.moveRight();              //右に移動（できない）

        map.printMap(map[][],plyer.place);  //位置が変わっていないことの確認
    }

}
