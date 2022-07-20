import java.util.ArrayList;

public class AirlineTicketTester
{
    public static void main(String[] args)
    {
        ArrayList<AirlineTicket> tickets = new ArrayList<AirlineTicket>();
        //This creates a randomized list of passengers
        addPassengers(tickets);
        for(AirlineTicket elem: tickets)
        {
            System.out.println(elem);
        }
       //This creates a TicketOrganizer object
        TicketOrganizer ticketOrganizer = new TicketOrganizer(tickets);
        
        //These are the methods of the ticketOrganizer in action
        System.out.println("\nPassengers Ordered by Boarding Group:");
        ticketOrganizer.printPassengersByBoardingGroup();
        System.out.println("\nPassengers in line who can board together:");
        ticketOrganizer.canBoardTogether();
    }
    
    //Do not touch this method! It is adding random passengers to the AirlineTicket array
    public static void addPassengers(ArrayList<AirlineTicket> tickets)
    {
        String[] seats = {"A","B","C","D","E","F"};
        for(int index = 0; index < 15; index++)
        {
            int random = (int)(Math.random() * 5);
            AirlineTicket ticket = new AirlineTicket("Passenger " + (index+1), seats[random], ((int)(Math.random()*5)+1), ((int)(Math.random()*8)+1));
            tickets.add(ticket);
        }
    }
    
}