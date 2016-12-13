import main.Searching.*;

public class ExMain{
    String filename = "map.txt";

    Map map = new Map(filename);
    System.out.println(map.map);    //迷路インスタンスの生成

    Player player = new Player();
    System.out.println(player.map); //プレイヤーインスタンス

    map.printMap(map[][],plyer.place);

    //移動
    // 左
    plyer.moveLeft();
    map.printMap(map[][],plyer.place);

    // 下
    plyer.moveDown();
    map.printMap(map[][],plyer.place);

    // 右→できない
    plyer.moveRight();
    map.printMap(map[][],plyer.place);  //位置が変わっていないことの確認


}
