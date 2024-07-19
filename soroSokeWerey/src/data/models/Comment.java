package data.models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private String comment;
    private int postId;
    private LocalDateTime createdAt =  LocalDateTime.now();
    private int commentId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getCommenterId() {
        return commentId;
    }

    public void setCommenterId(int commenterId) {
        this.commentId = commenterId;
    }
}
