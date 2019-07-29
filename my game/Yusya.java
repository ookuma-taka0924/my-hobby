import java.util.*;

public class Yusya extends Character{


 //コンストラクタ
  public Yusya(){}
  public Yusya(String name){
    this.setName(name);
    this.setLevel(1);
    this.setHp(100);
    this.setMax_hp(100);
    this.setMp(30);
    this.setMax_mp(30);
    this.setPower(10);
    this.setDefence(10);
    this.setExperience(0);

    System.out.println("勇者"+name+"が誕生した！");
    this.status();
  }

  public boolean battle(Monster m){
    this.status();
    System.out.print("さあどうする？　1：こうげき 2：ヒール(MP8) 3：逃げる  :");
    int choice = new Scanner(System.in).nextInt();
    if(choice <= 0){
      System.out.println("選択肢から選んでください");
      this.battle(m);
    }
    switch(choice){
      case 1:
        this.attack(m);
        return false;
      case 2:
        this.heal();
        return false;
      case 3:
        return this.run();
    }
    return false;
  }

  public void attack(Monster m){
    System.out.println("\n"+this.getName()+"の攻撃！");
    int damage = this.getPower() - m.getDefence()/(new Random().nextInt(2)+1);
    m.setHp(m.getHp()-damage);
    System.out.println(m.getName()+"に"+damage+"のダメージ");
  }

  public void heal(){
    System.out.println(this.getName()+"はヒールを唱えた！");
    if(this.getMp()-8 <= 0){
      System.out.println("しかしMPが足りなかった・・・"+"\n");
      return;
    }
    this.setMp(this.getMp()-8);
    this.healHp(15);
  }

  public boolean run(){
    int possible = new Random().nextInt(3);
    switch(possible){
      case 0: case 1:
        God.wait(1);
        System.out.println("\n"+"しかし回り込まれてしまった！");
        return false;
      case 2:
        God.wait(1);
        System.out.println("\n"+"逃げ切れた！"+"\n");
        return true;
    }
    return false;
  }

  public void healHp(int point){
    if(point > this.getMax_hp()-this.getHp()){
      int i = this.getMax_hp()-this.getHp();
      this.setHp(this.getMax_hp());
      System.out.println(this.getName()+"のHPが"+i+"回復した");
    }else{
      this.setHp(this.getHp()+point);
      System.out.println(this.getName()+"のHPが"+point+"回復した");
    }
  }

  public void healMp(int point){
    if(point > this.getMax_mp()-this.getMp()){
      this.setMp(this.getMax_mp());
      int i = this.getMax_mp()-this.getMp();
      System.out.println(this.getName()+"のMPが"+i+"回復した");
    }else{
      this.setMp(this.getMp()+point);
      System.out.println(this.getName()+"のMPが"+point+"回復した");
    }
  }

}
