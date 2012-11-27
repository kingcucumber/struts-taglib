package cn.itcast.action;

public class PersonAction {
private String name;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public String execute(){
		
		
		return "success";
	}
}
