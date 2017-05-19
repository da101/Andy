package andyAssingment;

public class Utility {//This is the Utility Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TicketXplorer xp = new TicketXplorer("Sunday", 4);
	xp.setPersonalTicketType("Standard");
	xp.setPersonalTicketType("Child");
	xp.setPersonalTicketType("Student");
	xp.setPersonalTicketType("Child");
	xp.display();
	
	System.out.println("On Wednesday: ");
	
	TicketXplorer xpa = new TicketXplorer("Wednesday", 4);
	xpa.setPersonalTicketType("Standard");
	xpa.setPersonalTicketType("Child");
	xpa.setPersonalTicketType("Student");
	xpa.setPersonalTicketType("Child");
	xpa.display();
	
	}

}
