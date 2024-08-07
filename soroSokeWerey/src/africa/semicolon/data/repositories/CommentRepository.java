package data.repositories;

import data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, Integer> {
   // List<Comment> findByPostId(int postId);
}

//public interface CommentRepository {
//    void save(Comment comment);
//    List<Comment> findAll();
//    Comment findCommentById(int id);
//    Comment findByPostId(int postId);
//    void deleteByCommentId(int id);
//    void deleteCommentByPostId(int id);
//    void deleteAll();
//    Long count();
//    boolean isEmpty();

