package web;

import data.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.PostService;
import services.PostServiceImplentation;


@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public String createPost(@RequestParam String title, @RequestParam String content) {
        Post createdPost = null;
        try {
             createdPost = postService.addPost(title, content);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        return String.valueOf(createdPost);
    }

    @GetMapping
    private Post getPostById(@PathVariable("id") String  id) {
        return postService.findPostById(id);
    }


//    private PostService postService = new PostServiceImplentation();
//
//    public String createPost(String title, String content) {
//        Post createdPost = null;
//        try {
//             createdPost = postService.addPost(title, content);
//        } catch (IllegalArgumentException e) {
//            e.getMessage();
//        }
//        return String.valueOf(createdPost);
//    }
//
//    public Post getPost(String id) {
//       return postService.findPostById(id);
//    }
}
