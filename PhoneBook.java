import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    // Добавление номера телефона
    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Получение списка телефонов по имени
    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Айдаров", "+79009869553");
        phoneBook.add("Айдаров", "+79202497515");
        phoneBook.add("Иванов", "+123456789");
        phoneBook.add("Петров", "+987654321");
        phoneBook.add("Сидоров", "+5439587165");


        System.out.println("Телефоны Айдарова: " + phoneBook.get("Айдаров"));
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));

        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));

    }
}
