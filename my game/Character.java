public abstract class Character{

  private String name;
  private int level;
  private int hp;
  private int max_hp;
  private int mp;
  private int max_mp;
  private int power;
  private int defence;
  private int experience;



  public String toString(){
    return this.name+" "+"Lv."+this.level+" "+"HP:"+this.hp+"/"+this.max_hp+" "+"MP:"+this.mp+"/"+this.max_mp+" "+"力:"+this.power+" "+"防:"+this.defence;
  }

  public void status(){
    System.out.println(this.toString());
    System.out.println(" ");
  }

  public void deadCheak(){
    if(this.getHp() <= 0){
      System.out.println(this.getName()+"は死んでしまった・・・！");
      God.wait(2);
      System.out.println("GAME OVER");
      System.exit(0);
    }
  }

  //setter
   public void setName(String name){
     this.name = name;
   }
   public void setLevel(int level){
     this.level = level;
   }
   public void setHp(int hp){
     this.hp = hp;
   }
   public void setMax_hp(int max_hp){
     this.max_hp = max_hp;
   }
   public void setMp(int mp){
     this.mp = mp;
   }
   public void setMax_mp(int max_mp){
     this.max_mp = max_mp;
   }
   public void setPower(int power){
     this.power = power;
   }
   public void setDefence(int defence){
     this.defence = defence;
   }
   public void setExperience(int experience){
     this.experience = experience;
   }

   //getter
    public String getName(){return this.name;}
    public int getLevel(){return this.level;}
    public int getHp(){return this.hp;}
    public int getMax_hp(){return this.max_hp;}
    public int getMp(){return this.mp;}
    public int getMax_mp(){return this.max_mp;}
    public int getPower(){return this.power;}
    public int getDefence(){return this.defence;}
    public int getExperience(){return this.experience;}


}
