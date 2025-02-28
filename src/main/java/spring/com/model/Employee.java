package spring.com.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter 
@Setter//(value = AccessLevel.PRIVATE)
@ToString(exclude = "name")
@AllArgsConstructor
//@Data

public class Employee {

	private int id;
	private String name ,gender;
	

	
}
