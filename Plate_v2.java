package Seminar_6_HW.Folder_1;

import java.util.Scanner;

public class Plate_v2 {
    public int food;
    public int plate;
    private Scanner iScanner = new Scanner(System.in);
 
    

    Plate_v2(int food){
        this.food = food;
    }

    public boolean decreaseFood(int foodToDecrease){
        if (food >= foodToDecrease) {
            food = food - 1;
            return true;
        }
        return false;
    }

    public void increaseFood(){
            System.out.println("In plate " + food + " food.");
            System.out.println("add food? -> ");
            food = food + iScanner.nextInt();
    }

    @Override
    public String toString(){
        return "Plate - " + food;
    }

}
