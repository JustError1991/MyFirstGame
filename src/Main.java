import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static String name, command = "";
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя персонажа");
        try {
            name = br.readLine();
        }catch (IOException e){
            e.getMessage();
        }
        Player player = new Player(name, 100, 20, 20);
        System.out.println("Игра началась!");
        while ((player.xp > 0) && (!command.equals("3"))){
            System.out.println("Куда вы хотите пойти?");
            System.out.println("1. К торговцу");
            System.out.println("2. В тёмный лес");
            System.out.println("3. На выход");
            try {
                command = br.readLine();
            }catch (IOException e){
                e.getMessage();
            }
            switch (command){
                case ("1"): {
                    gotovendor();
                    break;
                }
                case ("2"): {
                    gotodarkwood();
                    break;
                }
                case ("3"): {
                    gotoexit();
                    break;
                }
            }
        }

    }

    static public void gotovendor(){
        System.out.println("Вендор еще не открыт");
    }

    static public void gotodarkwood(){
        System.out.println("Темный лес еще не открыт");
    }

    static public void gotoexit(){
        System.out.println("Спасибо, что играли. До свидания");
    }

}
