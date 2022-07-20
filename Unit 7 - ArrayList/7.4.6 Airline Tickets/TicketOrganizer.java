import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    private ArrayList<AirlineTicket> group1 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group2 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group3 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group4 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group5 = new ArrayList<AirlineTicket>();
    
    public TicketOrganizer(ArrayList<AirlineTicket> tickets) {
        this.tickets = tickets;
    }
    
    public ArrayList<AirlineTicket> getTickets() {
        return tickets;
    }
    
    private void determineBoardingGroups() {
        for (AirlineTicket ticket : tickets) {
            if (ticket.getBoardingGroup() == 1) {
                group1.add(ticket);
            }
            else if (ticket.getBoardingGroup() == 2) {
                group2.add(ticket);
            }
            else if (ticket.getBoardingGroup() == 3) {
                group3.add(ticket);
            }
            else if (ticket.getBoardingGroup() == 4) {
                group4.add(ticket);
            } 
            else {
                group5.add(ticket);
            }
        }
    }
    
    private void printLoop(ArrayList<AirlineTicket> group) {
        for (AirlineTicket ticket : group) {
            System.out.println(ticket.getName());
        }
    }
    
    public void printPassengersByBoardingGroup() {
        determineBoardingGroups();
        System.out.println("Boarding Group 1:");
        printLoop(group1);
        System.out.println("Boarding Group 2:");
        printLoop(group2);
        System.out.println("Boarding Group 3:");
        printLoop(group3);
        System.out.println("Boarding Group 4:");
        printLoop(group4);
        System.out.println("Boarding Group 5:");
        printLoop(group5);
    }
    
    public void canBoardTogether() {
        int count = 0;
        for (int i = 0; i < tickets.size(); i++) {
            if (i == tickets.size() - 1) {
                break;
            }
            if ((tickets.get(i).getRow() == tickets.get(i + 1).getRow()) && tickets.get(i).getBoardingGroup() == tickets.get(i + 1).getBoardingGroup()) {
                count++;
                System.out.println(tickets.get(i).getName() + " can board with " + tickets.get(i + 1).getName() + ".");
            }
        }
        if (count == 0) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }
}