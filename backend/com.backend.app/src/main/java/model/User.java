import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private String userId; // primary key

    private String name;
}