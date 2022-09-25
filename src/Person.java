public class Person {
    protected String name;
    protected String surname;
    protected int ticket;

    public Person() {

    }
    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public void useTicket() {
        ticket --;
}

public boolean hasTicket () {
        return ticket>0;
}

    public int getTicket() {
        return ticket;
    }
}

