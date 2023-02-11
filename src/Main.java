import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = generateClients();
        Queue<Person> queue = new LinkedList<>();
        Iterator<Person> iter = persons.iterator();
        while (iter.hasNext()) {
            queue.add(iter.next());
        }

        while (!queue.isEmpty()) {
            Person next = queue.poll();
            if (next.tickets != 0) {
                next.ride();
                System.out.println(next.name + " " + next.family + " прокатился на аттракционе");
                if (next.tickets != 0) {
                    queue.add(next);
                }
            }
        }
    }

    public static List<Person> generateClients() {
        Queue<String> name = new LinkedList();
        name.add("Никита");
        name.add("Стас");
        name.add("Гена");
        name.add("Турбо");
        name.add("Дюша");

        Queue<String> family = new LinkedList();
        family.add("Фельдман");
        family.add("Растропович");
        family.add("Нэйман");
        family.add("Купитман");
        family.add("Метелкин");

        List<Person> person = new LinkedList();
        while (!name.isEmpty()) {
            person.add(new Person(name.remove(), family.remove(), (1 + (int) (Math.random() * 10))));
        }
        return person;
    }
}