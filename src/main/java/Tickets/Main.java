
package Tickets;

public class Main {
    public static void main(String[] args) {

        Ticket standard = new Ticket("Summer Concert", "Alice", 50);
        StudentTicket student = new StudentTicket("Summer Concert", "Bob", 50, "S12345");
        VIPTicket vip = new VIPTicket("Summer Concert", "Charlie", 50);

        System.out.println("Event: " + standard.getEventName());
        System.out.println("Standard Ticket - " + standard.getHolderName() + ": €" + standard.calculatePrice());
        System.out.println("Student Ticket - " + student.getHolderName() + ": €" + student.calculatePrice());
        System.out.println("VIP Ticket - " + vip.getHolderName() + ": €" + vip.calculatePrice());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Benefits: " + vip.getBenefits());

        Ticket standard80 = new Ticket("Summer Concert", "Alice", 80);
        StudentTicket student80 = new StudentTicket("Summer Concert", "Bob", 80, "S12345");
        VIPTicket vip80 = new VIPTicket("Summer Concert", "Charlie", 80);

        System.out.println();
        System.out.println("Tickets with base price €80");
        System.out.println("Standard Ticket: €" + standard80.calculatePrice());
        System.out.println("Student Ticket: €" + student80.calculatePrice());
        System.out.println("VIP Ticket: €" + vip80.calculatePrice());

        EarlyBirdTicket earlyBird50 = new EarlyBirdTicket("Summer Concert", "David", 50);
        EarlyBirdTicket earlyBird7 = new EarlyBirdTicket("Summer Concert", "Emma", 7);

        System.out.println();
        System.out.println("Early Bird Tickets");
        System.out.println("Early Bird €50: €" + earlyBird50.calculatePrice());
        System.out.println("Early Bird €7: €" + earlyBird7.calculatePrice());
    }
}
