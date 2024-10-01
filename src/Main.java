import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CarsForOwrers();
    }

    private static void CarsForOwrers() {
        Map<String, Car> cardMap = new HashMap<>();
        cardMap.put("Вячеслав Т", new Car("гольф", 2017, "белый"));
        cardMap.put("Дмитрий", new Car("калина", 2018, "черный"));
        cardMap.put("Антон", new Car("ламбаргини", 2020, "золото"));
        cardMap.put("Алексей", new Car("гранта", 2019, "серебро"));
        cardMap.put("Юлия", new Car("веста", 2021, "желтый"));
        System.out.println("Список owner+car = " + cardMap);

        String name1="Антон";
        String name2 = "Вячеслав Т";
        System.out.println("машина "+name1+" это " + cardMap.get(name1));
        System.out.println("машина "+name2+" это " + cardMap.get(name2));
    }

}