package com.example.day1.day2;

public class CharacterAbility {

    private int str =0;
    private int dex =0;
    private int knowledge =0;

    private int level = 1;
    private int experience =1;

    private int hp=100;
    private int mp=100;

    private int unusedStatus =0;
    private int hpPortionCount = 10;
    private int mpPortionCount = 10;

    public CharacterAbility(){}

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience =experience;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.min(hp,100);
        if(this.hp<0)this.hp=0;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = Math.min(mp,100);
        if(this.mp<0)this.mp=0;
    }

    public int getUnusedStatus() {
        return unusedStatus;
    }

    public void setUnusedStatus(int unusedStatus) {
        this.unusedStatus = unusedStatus;

    }

    public int getHpPortionCount() {
        return hpPortionCount;
    }

    public void setHpPortionCount(int hpPortionCount) {
        this.hpPortionCount = hpPortionCount;
    }

    public int getMpPortionCount() {
        return mpPortionCount;
    }

    public void setMpPortionCount(int mpPortionCount) {
        this.mpPortionCount = mpPortionCount;
    }

    public void checkLevelup(){
        while(experience>=100){
            experience -= 100;
            level +=1;
            unusedStatus+=5;
            System.out.println("레벨업!현재 레벨" + level + "사용가능스탯 5 증가");

        }
    }
    public void useHpPortion(){
        if(hpPortionCount>=1){
            System.out.println("체력 포션을 사용했습니다.");
            hpPortionCount--;
            setHp(hp+60);
            System.out.println("포션 사용후 현재 체력 :" +hp);
        }else{
            System.out.println("인벤토리 체력 포션이 없습니다.");
    }

}
    public void useMpPortion(){
        if(mpPortionCount>=5){
            System.out.println("마력 포션을 사용했습니다.");
            mpPortionCount--;
            setMp(mp+60);
            System.out.println("포션 사용 후 현재 마력:"+ mp);
        }else{
            System.out.println("인벤토리 마력 포션이 없습니다.");
        }
    }
    public void choosePortion(){
        System.out.println("소지중인 체력 포션은" + hpPortionCount);
        System.out.println("소지중인 마력 포션은" + mpPortionCount);
    }
    public void increaseStr(){
        if(unusedStatus>=5){
            System.out.println("힘이 5 증가하였습니다.");
            setStr(str+5);
            setUnusedStatus(unusedStatus-5);
            System.out.println("증가된후 힘:" + str);
        }else{
            System.out.println("사용 가능한 스탯이 없습니다.");
        }
    }
    public void increaseDex(){
        if(unusedStatus>=5){
            System.out.println("민첩이 5 증가하였습니다.");
            setDex(dex+5);
            setUnusedStatus(unusedStatus-5);
            System.out.println("증가 된 후 민첩 : " + dex);
        }else{
            System.out.println("사용 가능한 스탯이 없습니다.");
        }
    }
    public void increaseKnowledge(){
        if(unusedStatus>=1){
            System.out.println("지력이 5 증가하였습니다.");
            setKnowledge(knowledge+5);
            setUnusedStatus(unusedStatus-5);
            System.out.println("증가된 후 지력:"  + knowledge);
        }else{
            System.out.println("사용 가능한 스탯이 없습니다");
        }
    }

    public void showStatus() {
        System.out.println("체력 : " + hp);
        System.out.println("마나 : " + mp);
        System.out.println("힘 : " + str);
        System.out.println("민첩 : " + dex);
        System.out.println("지력 : " + knowledge);
        System.out.println("현재 레벨 : " + level);
        System.out.println("현재 경험치 : " + experience);
        System.out.println("사용 가능 스텟 : " + unusedStatus);
    }
}

