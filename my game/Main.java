import java.util.*;

public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Hello! World!!");
    System.out.println(" ");

    Yusya y = God.born();

    System.out.println("準備は整えた！さあ出発だ！");

    System.out.println("\n．．．迷宮に入ります"+"\n");
    Maze.enterRoom(y);


  }
}
