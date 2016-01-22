package miltos.diploma;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {
	
	private StringProperty  firstName = new SimpleStringProperty(this, "firstName", "");

	//Returns the object
	public StringProperty firstNameProperty() {
		return firstName;
	}
	
	//Returns the value of the firstName object
	public String getFirstName() {
		return firstName.get();
	}

	//Sets the value of the object
	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}


}
