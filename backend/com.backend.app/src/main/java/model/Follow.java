import java.util.Date;

// will translate to a SQL join table with a composite primary key
public class Follow {
    private String userFollowing;
    private String userFollowed;
    private Date createdAt;
}