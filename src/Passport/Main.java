package Passport;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Passport> map = new HashMap<>();
    public static void main(String [] args){
        Passport p = new Passport(252513458,"Иван","Иванов","Иванович",2000);
        addPassport(p);

    }
    public static void addPassport(Passport p){
        map.put(p.getNumber(),p);
    }
public static Passport getPassportByNumber( int number){
        return map.get(number);

}
}
