import java.util.*;

public class God{

  public static void wait(int i){
    try{
      Thread.sleep(i*1000);
    }catch(InterruptedException e){
      System.out.println("Errorが発生しました");
      System.out.println(e.getMessage());
    }
  }

  public static Yusya born(){
    Scanner sc = new Scanner(System.in);
    System.out.print("あなたの名前は... :");
    String name = sc.nextLine();
    Yusya y = selectJob(name);
    return y;
  }

  public static Yusya selectJob(String name){
    Scanner sc = new Scanner(System.in);
    System.out.print("あなたの天職は...1,勇者 :");
    int job = sc.nextInt();
    System.out.println(" ");
    if(job>1){
      System.out.println("表示から選択してください");
      selectJob(name);
    }else{
      switch(job){
        case 1:
          Yusya y = new Yusya(name);
          return y;
      }
    }
    return null;
  }
}
