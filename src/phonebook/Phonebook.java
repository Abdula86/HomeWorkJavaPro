package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private final Map<String, List<String>> contacts;

    public Phonebook() {
        this.contacts = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> numbers = contacts.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        contacts.put(name, numbers);
    }

    public String find(String name) {
        List<String> numbers = contacts.get(name);
        if (numbers != null && !numbers.isEmpty()) {
            return numbers.get(0);
        }
        return null;
    }

    public List<String> findAll(String name) {
        return contacts.get(name);
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("While Smith", "+380671234567");
        phonebook.add("While Smith", "+380631234567");
        phonebook.add("Jane Smith", "+380501234567");

        System.out.println("Search for While Smith: " + phonebook.find("While Smith"));
        System.out.println("Search for Jane Smith: " + phonebook.find("Jane Smith"));
        System.out.println("Search for Unknown: " + phonebook.find("Unknown"));

        System.out.println("Search all for While Smith: " + phonebook.findAll("While Smith"));
        System.out.println("Search all for Jane Smith: " + phonebook.findAll("Jane Smith"));
        System.out.println("Search all for Unknown: " + phonebook.findAll("Unknown"));
    }
}
