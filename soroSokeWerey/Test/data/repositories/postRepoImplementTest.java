package data.repositories;

import data.models.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class postRepoImplementTest {

    postRepoImplement postRepo = new postRepoImplement();
    Post post = new Post();

    @BeforeEach
    void setUp() {
        postRepoImplement postRepo = new postRepoImplement();
        postRepo.deleteAll();
        Post post = new Post();
    }

    @Test
    public void testPostIsEmpty(){
        assertEquals(0, postRepo.count());
    }

    @Test
    public void testPostCanDeleteAll(){
        postRepo.save(post);
        postRepo.deleteAll();
        assertEquals(0, postRepo.count());
    }

    @Test
    public void testPostCanSavePosts(){
        Post post2 = new Post();
        postRepo.save(post);
        postRepo.save(post2);
        assertEquals(2, postRepo.count());
    }

    @Test
    public void testPostCanFindById(){
        postRepo.save(post);
        assertEquals(post, postRepo.findById(post.getId()));
    }

    @Test
    public void testPostCanDeleteById(){
        postRepo.save(post);
        postRepo.deleteById(post.getId());
        assertEquals(0, postRepo.count());
    }

    @Test
    public void testPostCanFindAllPosts(){
        Post post2 = new Post();
        Post post3 = new Post();
        postRepo.save(post);
        postRepo.save(post2);
        postRepo.save(post3);
        List<Post> allPost = postRepo.findAll();
        assertEquals(3, postRepo.count());
        assertTrue(allPost.contains(post));
        assertTrue(allPost.contains(post2));
        assertTrue(allPost.contains(post3));
    }

}