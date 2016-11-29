package Searchig;


public class ExMain{
    Map map = new Map();
    System.out.println(map.val);    //迷路インスタンスの生成

    Player player = new Player();
    System.out.println(player.val); //プレイヤーインスタンス

    map.printMap(map[][],plyer.place);

    plyer.moveLeft();               //移動

    map.printMap(map[][],plyer.place);

    plyer.moveDown();

    map.printMap(map[][],plyer.place);

    plyer.moveRight();              //右に移動（できない）

    map.printMap(map[][],plyer.place);  //位置が変わっていないことの確認


}
