import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        List<Person> clients = generateClients();
        for (Person person : clients) {
            queue.offer(person);
        }
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.name + " " + person.surname + " посетил(а) аттракцион, потратив один билет, осталось " + (person.getTicket() - 1));
            person.useTicket();
            if (person.hasTicket()) {
                queue.offer(person);
            } else {
                System.out.println();
                System.out.println(person.name + " " + person.surname + " потратил(а) все билеты.");
                System.out.println();
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> listQueue = new ArrayList<>();
        listQueue.add(new Person("Alla", "Pugacheva", 2));
        listQueue.add(new Person("Maksim", "Galkin", 3));
        listQueue.add(new Person("Filipp", "Kirkorov", 4));
        listQueue.add(new Person("Vladimir", "Presnjkov", 5));
        listQueue.add(new Person("Nikita", "Presnjkov", 6));
        return listQueue;
    }


}
