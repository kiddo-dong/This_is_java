package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

// Data 어노테이션 - getter, setter, hashCode(), equals(), toString()
@Data 
public class Member {	
	private final String id;
	@NonNull private String name;
	private int age;
}
