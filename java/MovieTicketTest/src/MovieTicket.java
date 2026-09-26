public class MovieTicket {
    private final String movieTitle;
    private int ticketCount;

    public MovieTicket(String movieTitle, int ticketCount) {
        this.movieTitle = movieTitle;
        setTicketCount(ticketCount);
    }


    public String getMovieTitle() {
        return movieTitle;
    }


    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        if (ticketCount < 0) {
            System.out.println("Invalid ticket count");
            this.ticketCount = 1;
        } else if (ticketCount > 8) {
            System.out.println("You can only buy tickets up to 8 at a time");
            this.ticketCount = 8;
        } else {
            this.ticketCount = ticketCount;
        }
    }

    public void printTicketInfo() {
        System.out.println("You have bought " + ticketCount + " tickets for the movie " +  movieTitle);
    }




}
