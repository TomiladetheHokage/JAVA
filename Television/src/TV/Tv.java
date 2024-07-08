package TV;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Tv {
    public static Television tv = new Television();
    public static void main(String[] args) {
        menu();
    }


    public static void print (String input ){
        JOptionPane.showMessageDialog(null, input);
    }

    public static String input (String userInput ){
        return JOptionPane.showInputDialog(userInput);
    }

    public static void turnOnTv(){
            tv.turnOn();
            print("Tv is turned on");
            menu();
    }

    public static void turnOffTv(){
        tv.turnOff();
        menu();
    }

    public static void increaseVolume(){
        try {
            tv.increasetVolume();
            print("Volume increased");
        }catch(IllegalStateException e){
            print("Tv is turned off");
        }
        menu();
    }

    public static void decreaseVolume(){
        try {
            tv.decreaseVolume();
            print("Volume decreasing..");
        }catch(IllegalStateException e){
            print("Tv is turned off");
        }
        menu();
    }

    public static void mute(){
        try {
            tv.mute();
            print("Muted");
        }catch(IllegalStateException e){
            print("Tv is turned off");
        }
        menu();
    }

    public static void unmute(){
        try {
            tv.unMute();
            print("Unmuted");
        }catch(IllegalStateException e){
            print("Tv is turned off");
        }
        menu();
    }

    public static void changeChannel(){
        try {
            int chanel = Integer.parseInt(input("What channel do u want to watch? "));
            tv.changeChanel(chanel);
            print("Channel changed to "+ chanel);
        }catch(IllegalStateException e){
            print("Tv is turned off");
        }
        menu();
    }

    public static void exit(){
        print("Exit program");
    }

    public static void menu(){
        String menu = """
                Welcome to tv
                1. Turn on
                2. Turn off
                3. Increase Volume
                4. Decrease Volume
                5. Mute
                6. Unmute
                7. Change chanel
                8. Exit
                
                """;
        int choice = Integer.parseInt(input(menu));
        switch(choice) {
            case 1: turnOnTv();
            break;
            case 2: turnOffTv();
            break;
            case 3: increaseVolume();
            break;
            case 4: decreaseVolume();
            break;
            case 5: mute();
            break;
            case 6: unmute();
            break;
            case 7: changeChannel();
            break;
            case 8: exit();
            break;
            default: print("Invalid input");
            break;
        }
        menu();
    }
}
