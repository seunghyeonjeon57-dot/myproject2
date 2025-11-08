package com.example.day1.day2;

import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CharacterAbility heroAbility = new CharacterAbility();
        Warlord hero = new Warlord(heroAbility);

        MonsterAbility monster = new MonsterAbility();

        System.out.println("=====게임 시작 =====");

        while(true){
            System.out.println("\n1.사냥 2.인벤토리 3 스텟 4.캐릭터 정보 5. 종료");
            System.out.println("선택:");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("공격을 선택하시오-1.기본 2.힘스킬 3.민첩 4.지력");
                    int attackchoice = scanner.nextInt();

                    switch (attackchoice){
                        case 1: hero.attack(monster,heroAbility); break;
                        case 2: hero.strSkill(monster,heroAbility); break;
                        case 3: hero.dexSkill(monster,heroAbility); break;
                        case 4: hero.knowledgeSkill(monster,heroAbility); break;
                        default:
                            System.out.println("잘못된 선택입니다."); break;
                    }break;


                case 2:
                    System.out.println("1.체력 포션 2.마력 포션 3. 포션 목록");
                    int Portion = scanner.nextInt();
                    switch (Portion){
                        case 1:heroAbility.useHpPortion(); break;
                        case 2:heroAbility.useMpPortion(); break;
                        case 3: heroAbility.choosePortion(); break;
                        default:
                            System.out.println("잘못된 선택입니다."); break;
                    }break;

                case 3:
                    System.out.println("1.힘 2.민첩 3.지략");
                    int sChoice = scanner.nextInt();
                    switch (sChoice){
                        case 1:heroAbility.increaseStr();break;
                        case 2:heroAbility.increaseDex();break;
                        case 3:heroAbility.increaseKnowledge();break;
                        default:
                            System.out.println("잘못된 선택");break;
                    }break;

                case 4:
                   heroAbility.showStatus();
                   break;

                case 5:
                    System.out.println("게임 종료");
                    scanner.close();
                    break;
            }

        }



    }

}
