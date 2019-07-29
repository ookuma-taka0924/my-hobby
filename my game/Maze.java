import java.util.*;

public class Maze{


  static int number = 1;

  public static void enterRoom(Yusya y){
    God.wait(3);
    System.out.println("<<"+number+">>");
    System.out.print("分かれ道だ...1,右の道 2,左の道 3,真っすぐ:");
    Scanner sc = new Scanner(System.in);
    int move = sc.nextInt();
    if(move>3 || move<=0){
      System.out.println("選択が適正ではありません");
      enterRoom(y);
    }else{
    go(move,y);
    }
  }

  public static void go(int move,Yusya y){
    switch(move){
      case 1:
        System.out.println("右の道を進んだ"+"\n");
        event(y);
        break;
      case 2:
        System.out.println("左の道を進んだ"+"\n");
        event(y);
        break;
      case 3:
        System.out.println("真っすぐ突き進んだ"+"\n");
        event(y);
        break;
    }
  }

  public static void event(Yusya y){
    God.wait(1);
    int ev = new Random().nextInt(6);
    switch(ev){
      case 0: case 1: case 2:
        System.out.println("モンスターが襲い掛かってきた！");
        battle(y);
        break;
      case 3:
        System.out.println("穏やかな風が吹いてきた");
        randomHeal(y);
        break;
      case 4:
        System.out.println("辺りの雰囲気が変わった");
        bossRoom(y);
        break;
      case 5:
        System.out.println("この道はいつまで続くのだろうか"+"\n");
        God.wait(2);
        break;
     }
     number ++ ;
     enterRoom(y);
 }

public static void battle(Yusya y){
  Doraki m1 = new Doraki();
  sentou(y,m1);
}

public static void sentou(Yusya y,Monster m){
  if(y.battle(m) || m.deadCheak()){
    return;
  }
  God.wait(1);
  m.battle(y);
  sentou(y,m);
}

public static void randomHeal(Yusya y){
  y.healHp(new Random().nextInt(20)+5);
  y.healMp(new Random().nextInt(10)+3);
  y.status();
}

public static void bossRoom(Yusya y){
  System.out.print("このまま進みますか？...1;進む 2;引き返す:");
  int select = new Scanner(System.in).nextInt();
  if(select > 2 || select <= 0){
    System.out.println("どちらかを選んでください"); bossRoom(y);
  }
  switch(select){
    case 1:
      System.out.println("進み続けた・・・");
      God.wait(2);
      System.out.println("光が見えてきた！");
      God.wait(1);
      System.out.println("迷宮突破！！GAME CLEAR!!");
      System.exit(0);
      break;
    case 2:
      System.out.println("道を引き返した"+"\n");
      number++;
      enterRoom(y);
      break;
  }
}
}
