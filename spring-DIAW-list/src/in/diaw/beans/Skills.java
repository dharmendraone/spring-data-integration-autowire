package in.diaw.beans;

import java.util.List;

public class Skills {
	private List<String> name;
	
	public void setName(List<String> name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name.toString();
	}
	

}
