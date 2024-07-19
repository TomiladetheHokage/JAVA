package data.repositories;

import data.models.Comment;

import java.util.List;

public interface CommentRepository {
    void save(Comment comment);
    List<Comment> findAll();
    Comment findCommentById(int id);
    Comment findByPostId(int postId);
    void deleteByCommentId(int id);
    void deleteCommentByPostId(int id);
    void deleteAll();
    Long count();
    boolean isEmpty();
}
