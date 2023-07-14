package SpringBoot;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data // Getter, Setterの省略
@Table(name = "user")
	public class Employee {
	
	@Columm( name = id)
		private String Id;
		private String Name;
		private int Age;
	}


