

public class event {

	private String event_name;
	private Date event_date;
	private int start_time;
	
	public void setName(String name){
		this.event_name = name;
	}
	
	public void setDate(Date date){
		this.event_date = date;
	}
	
	public void setTime(int time){
		this.start_time = time;
	}
	
	public String getName(){
		return event_name;
	}
	
	public Date getDate(){
		return event_date;
	}
	
	public int getTime(){
		return start_time;
	}
	
}
