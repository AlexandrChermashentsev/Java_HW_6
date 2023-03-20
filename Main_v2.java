package Seminar_6_HW.Folder_1;
/*
ДЗ:
while (true) -> while (!plate.isEmpty())
1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
В конце каждого цикла мы досыпаем в тарелку еду.
Для досыпания еды сделать метод increaseFood в классе Plate.
2. Поменять поле satiety у кота с boolean на int.
Допустим у кота аппeтит 10, сытность 3. Значит кот захочет поесть 7 единиц.
3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.
*/
public class Main_v2 {
    public static void main(String[] args) throws InterruptedException {
        
        // Кот (имя, аппетит, сытность)
        // Тарелка (Содержит какое-то кол-во еды)
        // Кот ест из тарелки. Если в тарелке недостаточно еды,
        // то кот её не трогает
        
        Cat_v2 barsik = new Cat_v2("Barsik", 15);
        Cat_v2 murzik = new Cat_v2("Murzik");
        Cat_v2 murka = new Cat_v2("Murka", 11);
        String[] arrayCats = new String[]{barsik.name, murzik.name, murka.name};
        Plate_v2 plate = new Plate_v2(100);
        

        while (true) {
            for (int i = 0; i < arrayCats.length; i++) {
                System.out.println(plate);
                if (arrayCats[i].equals("Barsik")){
                    barsik.makeHungry();
                    System.out.println(barsik);
                    barsik.eat(plate);

                } else if (arrayCats[i].equals("Murzik")){
                    murzik.makeHungry();
                    System.out.println(murzik);
                    murzik.eat(plate);

                } else if(arrayCats[i].equals("Murka")){
                    murka.makeHungry();
                    System.out.println(murka);
                    murka.eat(plate);

                }   
            }


            plate.increaseFood();
            System.out.println(plate);
            
        }
    }
    
}
