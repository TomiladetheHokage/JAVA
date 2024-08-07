package services;

import data.models.Post;
import data.repositories.PostRepo;
//import data.repositories.postRepoImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImplentation implements PostService {

    @Autowired
    private PostRepo postRepo;



    @Override
    public Post addPost(String title, String body) {
        Post post = new Post();
        if(postExist(title)){
            throw new IllegalArgumentException("Post already exists");
        }
        post.setTitle(title);
        post.setContent(body);
        postRepo.save(post);
        return post;
    }


    @Override
    public Post findPostById(String id) {
      return postRepo.findById(id).get();
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
