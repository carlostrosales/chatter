import java.util.Date

class Post {
    private String postId; // primary key
    private String userId; // foreign key to user
    private String content;
    private Date createdAt; // supports sorting chronologically
}