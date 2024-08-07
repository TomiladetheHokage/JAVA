package services;

import data.models.Post;

public interface PostService {
    Post addPost(String title, String body);
    Post findPostById(String id);
}


