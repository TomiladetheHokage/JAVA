//package data.repositories;
//
//import data.models.Comment;
//import data.models.Post;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class commentRepoimpl implements CommentRepository{
//    List<Comment> comments = new ArrayList<>();
//    List<Comment> trashCan = new ArrayList<>();
//    Post post = new Post();
//    int idcounter = 0;
//
//    @Override
//    public void save(Comment comment) {
//        comment.setId(generateId());
//        comments.add(comment);
//    }
//
//    @Override
//    public List<Comment> findAll() {
//        return comments;
//    }
//
//    @Override
//    public Comment findCommentById(int id) {
//        for (Comment comment : comments) {
//           if(comment.getId() == id){
//               return comment;
//           }
//        }
//        return null;
//    }
//
//    @Override
//    public Comment findByPostId(int postId) {
//        for (Comment comment : comments) {
//            if(comment.getPostId() == post.getId()){
//                return comment;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void deleteByCommentId(int id) {
//        for (Comment comment : comments) {
//            if(comment.getId() == id){
//                trashCan.add(comment);
//                comments.remove(comment);
//            }
//        }
//
//    }
//
//    @Override
//    public void deleteCommentByPostId(int postId) {
//        for (Comment comment : comments) {
//            if(comment.getPostId() == post.getId()){
//                comments.remove(comment);
//                trashCan.add(comment);
//            }
//        }
//    }
//
//    @Override
//    public void deleteAll() {
//        trashCan.addAll(comments);
//        comments.clear();
//    }
//
//    @Override
//    public Long count() {
//        return (long) comments.size();
//    }
//
//    @Override
//    public boolean isEmpty() {
//      boolean empty = comments.size() == 0;
//        return empty;
//    }
//
//    private int generateId(){
//      idcounter ++;
//     return idcounter;
//    }
//}
