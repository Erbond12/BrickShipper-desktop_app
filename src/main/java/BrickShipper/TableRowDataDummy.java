package BrickShipper;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TableRowDataDummy {
	private StringProperty name;
	private IntegerProperty age;
	private IntegerProperty weight;
	
	public TableRowDataDummy(String name, int age, int weight) {
		setName(name);
		setAge(age);
		setWeight(weight);
	}

	public int getAge() {
		return ageProperty().get();
	}

	public void setAge(int age) {
		ageProperty().set(age);
	}

	public int getWeight() {
		return weightProperty().get();
	}

	public void setWeight(int weight) {
		weightProperty().set(weight);
	}
	
	public void setName(String name) {
		nameProperty().set(name);
	}

	public String getName() {
		return nameProperty().get();
	}

	public StringProperty nameProperty() {
		if (name == null) {
			name = new SimpleStringProperty(this, "name");
		}
		return name;
	}
	
	public IntegerProperty ageProperty() {
		if(age == null) {
			age = new SimpleIntegerProperty(this, "age");
		}
		return age;
	}
	
	public IntegerProperty weightProperty() {
		if(weight == null) {
			weight = new SimpleIntegerProperty(this, "weight");
		}
		return weight;
	}

}
