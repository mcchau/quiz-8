
public class Date {
private int year;
private int month;
private int day;

public Date(int y, int m, int d){
	year = y;
	month = m;
	day =d;
}

@Override
public String toString() {
	return year + "/" + month + "/" + day;
}

}
