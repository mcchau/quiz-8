
public class test {

	public static void main(String arg[]){
		
		event model = retrive_saved_event();
		
		eventView view = new eventView();
		
		eventController controller = new eventController(model, view);
		
		controller.updateVeiw();
		
		Date dateD = new Date(2015, 04, 17);
		
		controller.setName("Meeting with girlfriend AGAIN");
		controller.setDate(dateD);
		controller.setTime(1330);
		
		controller.updateVeiw();
	}
	
	private static event retrive_saved_event(){
		event eventE = new event();
		eventE.setName("Meeting with girlfriend");
		Date dateE = new Date(2015, 04, 16);
		eventE.setDate(dateE);
		eventE.setTime(1200);
		return eventE;
	}
	
}
