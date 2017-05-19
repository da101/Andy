package andyAssingment;

public class TicketXplorer extends Printer implements Ticket{// This class Implements interface Ticket and inherits Printer

	String day;
	int numberOfTickets;
	int ticketCounter;
	double ticketCost;
	
	public TicketXplorer(String day, int numberOfTickets) {
		super();
		this.day = day;
		this.numberOfTickets = numberOfTickets;
		this.ticketCounter=0;
		this.ticketCost=0;
	}

	@Override
	public void setMoiveDay(String weekday) {
		// TODO Auto-generated method stub
		this.day=weekday;
	}

	@Override
	public String getMoiveDay() {
		// TODO Auto-generated method stub
		return this.day;
	}

	@Override
	public void setPersonalTicketType(String ticketType) {
		// TODO Auto-generated method stub
		if(this.numberOfTickets>this.ticketCounter){
			if(ticketType.equalsIgnoreCase("Standard")){
				this.ticketCost=this.ticketCost+8;
				this.ticketCounter++;	
			}
			else if(ticketType.equalsIgnoreCase("OAP")){
				this.ticketCost=this.ticketCost+6;
				this.ticketCounter++;	
			}
			else if(ticketType.equalsIgnoreCase("Student")){
				this.ticketCost=this.ticketCost+6;
				this.ticketCounter++;	
			}
			else if(ticketType.equalsIgnoreCase("Child")){
				this.ticketCost=this.ticketCost+4;
				this.ticketCounter++;	
			}
			else
				System.out.println("Invalid Ticket Type");
		}
		
	}

	@Override
	public String getPersonalTicketType(String ticketType) {
		// TODO Auto-generated method stub
		return null;
	}
	 public double calculateFinalCost(){
		 if(this.day.equalsIgnoreCase("Wednesday")){
			 this.ticketCost=this.ticketCost-(this.numberOfTickets*2);
		 }
		 return this.ticketCost;
	 }
	  @Override
	  public void display() {
	    System.out.println("Total Cost of Ticket for this movie is " + calculateFinalCost());
	  }
	
	

}
