/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author hp
 */
/**
 *
 * @author ASUS
 */
import java.util.Scanner;

class Genshin {
  String username = "ai-chan";
  String cekGenshin() { 
    return "Ini berasal dari class Genshin"; 
  }
};
 
class Character extends Genshin {
  String chara1="hutao";
  String chara2="mona";
  String cekCharacter() { 
    return "Ini berasal dari class Character"; 
  }
};
 
class Task1 {
  public static void main(String args[]){
    Character CharacterBunga = new Character();
    Scanner input = new Scanner(System.in);
    int level;
    System.out.println(CharacterBunga.username);
    System.out.print("masukkan level : ");
    level = input.nextInt();
    int n=4,i;
    
    if (level>=30){
        for(i=0;i<n;i++){
        System.out.println(CharacterBunga.chara1);}
    }
    else{
        for(i=0;i<n;i++){
        System.out.println(CharacterBunga.chara2);}
    }
    System.out.println(CharacterBunga.cekGenshin());
    System.out.println(CharacterBunga.cekCharacter());
  }
}
