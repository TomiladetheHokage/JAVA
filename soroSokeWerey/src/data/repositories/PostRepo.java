package data.repositories;

import data.models.Post;

import java.util.List;

public interface PostRepo {

    Post findById(int index);
    List<Post> findAll();
    int count();
    void deleteAll();
    void save(Post post);
    void deleteById(int id);
}
