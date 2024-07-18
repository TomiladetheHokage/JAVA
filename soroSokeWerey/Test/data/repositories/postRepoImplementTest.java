package data.repositories;

import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class postRepoImplementTest {
    @Test
    public void testPostIsEmpty(){
        postRepoImplement postRepo = new postRepoImplement();
        Post post = new Post();
        assertEquals(0, postRepo.count());
    }

    @Test
    public void testPostCanDeleteAll(){
        postRepoImplement postRepo = new postRepoImplement();
        Post post = new Post();
        postRepo.save(post);
        postRepo.deleteAll();
        assertEquals(0, postRepo.count());
    }

    @Test
    public void testPostCanSavePosts(){
        postRepoImplement postRepo = new postRepoImplement();
        Post post = new Post();
        Post post2 = new Post();
        postRepo.save(post);
        postRepo.save(post2);
        assertEquals(2, postRepo.count());
    }

    @Test
    public void testPostCanFindById(){
        postRepoImplement postRepo = new postRepoImplement();
        Post post = new Post();
        postRepo.save(post);
        postRepo.findById(post.getId());
        assertEquals(post, postRepo.findById(post.getId()));
    }

    @Test
    public void testPostCanDeleteById(){
        postRepoImplement postRepo = new postRepoImplement();
        Post post = new Post();
        postRepo.save(post);
        postRepo.deleteById(post.getId());
        assertEquals(0, postRepo.count());
    }
}