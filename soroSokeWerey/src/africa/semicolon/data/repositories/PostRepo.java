package data.repositories;

import data.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepo extends MongoRepository<Post, String> {

    //List<Post> findById(String Post);
}

//public interface PostRepo {
//
//    Post findById(int index);
//    List<Post> findAll();
//    int count();
//    void deleteAll();
//    void save(Post post);
//    void deleteById(int id);
//}
