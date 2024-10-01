import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        CarsForOwrers();
        Map<Car, String>  txt1 = readCars("Owner");
        System.out.println(txt1);

        Car carToFind = askCar();
        //вывести имя владельца, если такой есть, иначе "машина не найдена"
        String owner = txt1.getOrDefault(carToFind, "машина не найдена");
        System.out.println("carToFind = " + carToFind);
        System.out.println("owner = " + owner);
    }

    private static void CarsForOwrers() {
        Map<String, Car> cardMap = new HashMap<>();
        cardMap.put("Вячеслав Т", new Car("гольф",  "2017", "белый"));
        cardMap.put("Дмитрий", new Car("калина", "2018", "черный"));
        cardMap.put("Антон", new Car("ламбаргини", "2020", "золото"));
        cardMap.put("Алексей", new Car("гранта", "2019", "серебро"));
        cardMap.put("Юлия", new Car("веста", "2021", "желтый"));
        System.out.println("Список owner+car = " + cardMap);

        String name1="Антон";
        String name2 = "Вячеслав Т";
        System.out.println("машина "+name1+" это " + cardMap.get(name1));
        System.out.println("машина "+name2+" это " + cardMap.get(name2));
    }

    // чтение файла и вывод в консоль
    public static Map<Car, String> readCars(String fname){
        Map<Car, String> carMap = new HashMap<>();
        try{
            Scanner scanner = new Scanner(new File(fname));
            while (scanner.hasNext()) { // изменил фор на вайл
                String line = scanner.nextLine();
                String[] massiv = line.split("; ");
                String owner = massiv[0];
                String model = massiv[1];
                String year = massiv[2];
                String color = massiv[3];
                Car car = new Car(model, year, color);
                carMap.put(car,owner);
            }
        } catch (FileNotFoundException e) {
            System.out.println("что-то не так с чтением из файла");
            System.out.println(e.getMessage());
        }
        return carMap;
    }

    // поиск владельца по машине при вводе данных с консоли
    private static Car askCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите искомую модель:");
        String model = scanner.nextLine();
        System.out.println("введите год:");
        String year = scanner.next();
        System.out.println("введите цвет");
        String color = scanner.next();
        return new Car(model, year, color);
    }
}