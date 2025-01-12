import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Generates getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Generates a constructor with all fields
@NoArgsConstructor  // Generates a no-argument constructor
public class User {

    private String username;
    private String password;
    private String email;

}
