package podg1;

public class Lesson {
	public String name;
	public Lesson() {};
	int hour;
	int minute;
	Days day;
	public Lesson(String name, Days day,Time time) {
		this.name = name;
		this.day = day;
		
	}
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
	public String toString() {
		return name+""+hour+""+minute+""+day+"";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+((day==null)?0:day.hashCode());
		result = prime*result + ((name==null)? 0:name.hashCode());
		result = prime*result+hour;
		result = prime*result +minute;
		return result;
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		if(obj==null) 
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Lesson other = (Lesson)obj;
		if(day!=other.day)
			return false;
		if(name==null) {
			if(other.name!=null)
				return false
		}
		else if(!name.equals(other.name))
			return false;
		return true;
	}
}
