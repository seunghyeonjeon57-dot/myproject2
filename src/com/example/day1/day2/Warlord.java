package com.example.day1.day2;

public class Warlord implements Character{
    private CharacterAbility ability;

    public Warlord(CharacterAbility ability){
        this.ability=ability;

        ability.setStr(30);
        ability.setDex(17);
        ability.setKnowledge(10);
    }

    @Override
    public void attack(MonsterAbility monster,CharacterAbility hero){
        if(hero.getMp()<6){
            System.out.println("마력이 부족해 공격할 수 없습니다.");
            return;
        }
       int damageToMonster  = (int)Math.round(hero.getStr()*1.3);
        System.out.println("몬스터가"+ damageToMonster+"만큼 피해를 입었습니다.");
        monster.setHp(monster.getHp()-damageToMonster);
        hero.setMp(hero.getMp()-6);

        if(monster.getHp()<=0){
            System.out.println("몬스터 사냥을 성공하셧습니다.");
            hero.setExperience(hero.getExperience()+13);
            hero.checkLevelup();
            return;
        }
        monsterAttack(monster,hero);


    }
    @Override
    public void strSkill(MonsterAbility monster,CharacterAbility hero){
        if(hero.getMp()<15){
            System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
            return;
        }
        int damage=(int)Math.round(hero.getStr()*1.8);
        System.out.println("몬스터가" + damage +"만큼 피해를 입엇습니다.");
        monster.setHp(monster.getHp()-damage);
        hero.setMp(hero.getMp()-15);

        if(monster.getHp()<0){
            System.out.println("몬스터 사냥을 성공하셨습니다.");
            hero.setExperience(hero.getExperience()+13);
            hero.checkLevelup();
            return;
        }


    monsterAttack(monster,hero);

    }

    @Override
    public void dexSkill(MonsterAbility monster, CharacterAbility hero) {
        if (hero.getMp() < 19) {
            System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
            return;
        }


        for(int i=0;i<3;i++){
        int dmg = (int) Math.round(hero.getDex() * 0.7);
        System.out.println("몬스터가 민첩스킬로 인해" + dmg + "만큼 피해를 입었습니다.");
        monster.setHp(monster.getHp() - dmg);}


        if (monster.getHp() <= 0) {
            System.out.println("몬스터 사냥을 성공하셨습니다.");
            hero.setExperience(hero.getExperience() + 13);
            hero.checkLevelup();
            return;
        }
    }
    @Override
    public void knowledgeSkill(MonsterAbility monster,CharacterAbility hero){
        if(hero.getMp()<28){
            System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
            return;
        }
        int dmg = (int)Math.round(hero.getKnowledge()*3.6);
        System.out.println("몬스터가 지력 스킬로 인해" + dmg + "의 피해를 입엇습니다.");
        monster.setHp(monster.getHp()-dmg);
        hero.setMp(hero.getMp()-28);

        if(monster.getHp()<=0){
            System.out.println("몬스터 사냥을 성공하셨습니다.");
            hero.setExperience(hero.getExperience()+13);
            hero.checkLevelup();
            return;
        }
        monsterAttack(monster,hero);
    }

    public void monsterAttack(MonsterAbility monster,CharacterAbility hero){
        System.out.println("몬스터가 공격했습니다!");
        int damage= monster.getDamage();
        System.out.println("케릭터가" + damage+"만큼 피해를 입었습니다.");
        hero.setHp(hero.getHp()- monster.getDamage());

        if(hero.getHp()<=0){
            System.out.println("케릭터 사망");
            hero.setHp(70);
            hero.setMp(70);
            hero.setExperience(hero.getExperience()-30);
        }
    }
}
