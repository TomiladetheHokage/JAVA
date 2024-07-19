package services;

import data.models.Post;
import data.repositories.PostRepo;
import data.repositories.postRepoImplement;

public class PostServiceImplentation implements PostService {

    private PostRepo postRepo = new postRepoImplement();

    @Override
    public Post addPost(String title, String body) {
        Post post = new Post();
        if(postExist(title)){
            throw new IllegalArgumentException("Post already exists");
        }
        post.setTitle(title);
        post.setContent(body);
        return post;
    }

    @Override
    public Post findPostById(int id) {
       return postRepo.findById(id);
    }

    private boolean postExist(String title) {
        for (Post post : postRepo.findAll()) {
            if (post.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}
