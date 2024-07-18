package data.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostTest {
    @Test
    public void testToSetTitleOfPost() {
        Post post = new Post();
        post.setTitle("hey");
        assertEquals("hey",post.getTitle());
    }

    @Test
    public void testTosetComments(){
        Post post = new Post();
        post.setComments("hey");
        assertEquals(1, post.getComments());
    }

    @Test
    public void testToSetContentOfPost(){
        Post post = new Post();
        post.setContent("WIZKID TO PERFORM AT WIRELESS THIS SUMMER");
        assertEquals("WIZKID TO PERFORM AT WIRELESS THIS SUMMER", post.getContent());
    }

    @Test
    public void testToSetTimestampOfPost(){
        Post post = new Post();
        LocalDateTime uploadTime = LocalDateTime.now();
        post.setCreatedAt(uploadTime);
        assertEquals(uploadTime, post.getCreatedAt());
    }




}