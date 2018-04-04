import java.util.LinkedList;

public class Stackinfo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Анна");
        list.add("Симона");
        list.add("КАтя");
        list.add("Света");

        System.out.println("Список имен: "+list);

        list.push("Коля");

        System.out.println("Список имен" +list);

        System.out.println("Удалить элемент: "+list.pop());
    }
}