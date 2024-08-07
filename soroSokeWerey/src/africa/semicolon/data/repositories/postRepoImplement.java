//package data.repositories;
//
//import data.models.Post;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class postRepoImplement implements PostRepo{
//
//    private  List<Post> posts = new ArrayList<>();
//    int idCount = 0;
//
//
//    @Override
//    public Post findById(int index) {
//        for(Post post : posts) {
//            if(post.getId() == index) {
//                return post;
//            }
//        }
//        return null;
//    }
//
//    private int generateId(){
//        return ++idCount;
//    }
//
//    @Override
//    public List<Post> findAll() {
//        return posts;
//    }
//
//    @Override
//    public int count() {
//       return posts.size();
//    }
//
//    @Override
//    public void deleteAll() {
//        posts.clear();
//    }
//
//    @Override
//    public void save(Post post) {
//        post.setId(generateId());
//        posts.add(post);
//    }
//
//    @Override
//    public void deleteById(int id) {
//        posts.removeIf(post -> post.getId() == id);
//    }
//}
