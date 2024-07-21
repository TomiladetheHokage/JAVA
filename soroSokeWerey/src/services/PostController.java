package services;

import data.models.Post;

public class PostController {
    private PostService postService = new PostServiceImplentation();

    public String createPost(String title, String content) {
        Post createdPost = null;
        try {
             createdPost = postService.addPost(title, content);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        return String.valueOf(createdPost);
    }

    public Post getPost(int id) {
       return postService.findPostById(id);
    }
}
