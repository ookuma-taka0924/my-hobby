public abstract class Monster{

    private String name;
    private int hp;
    private int mp;
    private int max_hp;
    private int max_mp;
    private int power;
    private int defence;

    public boolean deadCheak(){
      if(this.getHp()<=0){
        System.out.println(this.getName()+"を倒した！"+"\n");
        return true;
      }else{return false;}
    }

    public abstract void battle(Character c);

    public void setName(String name){this.name = name;}
    public void setHp(int hp){this.hp=hp;}
    public void setMp(int mp){this.mp=mp;}
    public void setMax_hp(int max_hp){this.max_hp=max_hp;}
    public void setMax_mp(int max_mp){this.max_mp=max_mp;}
    public void setPower(int power){this.power=power;}
    public void setDefence(int defence){this.defence=defence;}

    public String getName(){return this.name;}
    public int getHp(){return this.hp;}
    public int getMp(){return this.mp;}
    public int getMax_hp(){return this.max_hp;}
    public int getMax_mp(){return this.max_mp;}
    public int getPower(){return this.power;}
    public int getDefence(){return this.defence;}

  }
