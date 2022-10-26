import java.util.*;

public class Main {
    public static void main(String[] args) {

        var productList = new ProductList();

        productList.add("Лук", 50f);
        productList.add("Помидор", 100f);
        productList.add("Огурец", 150f);
        productList.show();
        System.out.println();

        var recipe = new Recipe("Салат из овощей");
        recipe.addProduct(new Product("Помидор", 100f));
        recipe.addProduct(new Product("Огурец", 150f));
        System.out.println(recipe);

        System.out.println();
        System.out.println();

        task2part1();
        task2part2();
        task3();
    }
    private static void task2part1(){
        Map<String , List<Integer>> map = new HashMap<>();
        fillMap(map);

        Map<String , Integer> newMap = new HashMap<>();

        for (Map.Entry<String,List<Integer>> e: map.entrySet()){
            newMap.put(e.getKey(), e.getValue().stream().mapToInt(i -> i).sum());
        }
        newMap.forEach((k,v) ->System.out.println(k + " " + v));
    }
    private static void fillMap(Map<String , List<Integer>> map){
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            map.put(("str" + (i+1)),List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        }
    }
    private static void task2part2(){
        Map<Integer,String> map = new LinkedHashMap<>();
        for (int i = 10; i < 0 ; i--) {
            map.put(i,"str" + (i));
        }
        map.forEach((k,v) -> System.out.println(k + " " + v));
    }
    public static void task3(){
        Map<String,Integer> map = new HashMap<>();

        String key ="222";
        int value = 222;
        addTo(key,value,map);

    }
    public static void addTo(String k,int v, Map< String, Integer> map){
        if (map.containsKey(k) && map.get(k).equals(v)) {
            throw new IllegalArgumentException();
        }
        map.put(k,v);
    }


    }