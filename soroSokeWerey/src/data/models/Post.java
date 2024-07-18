package data.models;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private int id;
    private String title;
    private String content;
    private List<String> coments;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setComments(String comment) {
        this.coments = new ArrayList<String>();
        coments.add(comment);
    }

    public void setTitle(String titile) {
        this.title = titile;
    }

    public String getTitle() {
        return title;
    }

    public int getComments() {
        return coments.size();
    }

    public void setContent(String postContent) {
        this.content = postContent;
    }

    public String getContent() {
        return content;
    }

    public void setCreatedAt(LocalDateTime uploadTime) {
        this.createdAt = uploadTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
