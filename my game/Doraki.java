import java.util.*;

public class Doraki extends Monster{



    public Doraki(){
      this.setName("ドラーキ");
      this.setHp(30);
      this.setMp(0);
      this.setMax_hp(30);
      this.setMax_mp(0);
      this.setPower(8);
      this.setDefence(5);

      System.out.println("ドラーキが現れた！！");
    }

    public void battle(Character c){
      int possible = new Random().nextInt(3)+1;
      switch(possible){
        case 1: case 2:
          this.attack(c);
          break;
        case 3:
          this.lip(c);
          break;
          }
    }

    public void attack(Character c){
      System.out.println("\n"+"ドラーキの攻撃！");
      int damage = this.getPower()-c.getDefence()/(new Random().nextInt(4)+2);
      if(damage<0){damage = 0;}
      c.setHp(c.getHp()-damage);
      System.out.println(c.getName()+"に"+damage+"ダメージ！！");
      c.deadCheak();
    }

    public void lip(Character c){
      System.out.println("\n"+"ドラーキが舌で舐めてきた！！");
      int possible = new Random().nextInt(3) + 1;
      switch(possible){
        case 1: case 2:
          System.out.println(c.getName()+"は寒気した");
          break;
        case 3:
          System.out.println(c.getName()+"は腰が抜けてしまった");
          God.wait(1);
          this.battle(c);
          break;
      }
    }

  }
