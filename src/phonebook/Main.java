package phonebook;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Main {
    public static void main(String[] args) {
        var book = new Phonebook();
        book.addPhone("Антонов Иван","79012221352");
        book.addPhone("Петров Иван","79012221342");
        book.addPhone("Карамлин Иван","79012222352");
        book.addPhone("Иванов Иван","79012231352");
        book.addPhone("Костин Иван","79052221352");
        book.addPhone("Исаев Иван","79033221352");
        book.addPhone("Миронов Иван","79012551352");
        book.addPhone("Авдеев Иван","79012244352");
        book.addPhone("Байбаков Иван","79012245152");
        book.addPhone("Игнатьев Иван","79016621352");
        book.addPhone("Сидоров Иван","79066221352");
        book.addPhone("Хромов Иван","79011621352");
        book.addPhone("Желебов Иван","79012881352");
        book.addPhone("Сироткин Иван","79012759352");
        book.addPhone("Капитонов Иван","79012551352");
        book.addPhone("Рыбаков Иван","79562221352");
        book.addPhone("Трушин Иван","79017771352");
        book.addPhone("Власов Иван","79099921352");
        book.addPhone("Прохоров Иван","79017871352");
        book.addPhone("Лебедев Иван","79033321352");

        System.out.println(book);
    }


}
