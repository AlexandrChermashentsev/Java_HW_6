package Seminar_6_HW.Folder_1;

import java.util.Random;

public class Cat_v2 {
    String name;
    int appetite;
    int satiety;
    static Random rnd = new Random();
    


    Cat_v2(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    Cat_v2(String name){
        this(name, 10);
    }
        
    public void eat(Plate_v2 plate) throws InterruptedException{
        if (plate.decreaseFood(appetite)) { 
            for (int i = satiety + 2; i <= appetite; i++) {
                System.out.println("satiety " + name + " = " + i);
                plate.decreaseFood(appetite);
                Thread.sleep(500);
            }
        }
    }
    
    public void makeHungry(){
        satiety = rnd.nextInt(10);
    }


    @Override
    public String toString(){
        return name + " {appetite=" + appetite + ",saiety=" + satiety + "}";
    }
}
