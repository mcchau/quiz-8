

public class eventController {

	private event model;
	private eventView view;
	
	public eventController(event m, eventView v){
		this.model = m;
		this.view = v;
	}
	
	public void setName(String name){
		model.setName(name);
	}
	
	public void setDate(Date date){
		model.setDate(date);
	}
	
	public void setTime(int time){
		model.setTime(time);
	}
	
	public String getName(){
		return model.getName();
	}
	
	public Date getDate(){
		return model.getDate();
	}
	
	public int getTime(){
		return model.getTime();
	}
	
	public void updateVeiw(){
		view.print_scheduled_event(model.getName(), model.getDate(), model.getTime());
	}
	
}
