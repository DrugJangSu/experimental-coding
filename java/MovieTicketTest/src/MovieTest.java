public class MovieTest {
    public static void main(String[] args) {
        System.out.println("Welcome to Movie Ticket Machine");
        MovieTicket ticket1 = new MovieTicket("Odyssey", 4);
        ticket1.printTicketInfo();

        MovieTicket ticket2 = new MovieTicket("John Wick 5", -1);
        ticket2.printTicketInfo();

        MovieTicket ticket3 = new MovieTicket("Obsession", 9);
        ticket3.printTicketInfo();

    }
}
