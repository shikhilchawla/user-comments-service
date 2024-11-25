package org.phoenix.apps.community.user.comments.resource;

import org.phoenix.apps.community.user.comments.model.Comment;
import org.phoenix.apps.community.user.comments.service.UserCommentsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class UserCommentsResource {

    private final UserCommentsService userCommentsService;

    public UserCommentsResource(UserCommentsService userCommentsService) {
        this.userCommentsService = userCommentsService;
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("User comments Service is Healthy");
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<List<Comment>> getCommentsByPostId(@PathVariable int postId) {
        return ResponseEntity.ok().body(this.userCommentsService.getUserCommentsByPostId(postId));
    }

    @PostMapping
    public ResponseEntity<Comment> addUserComment(@RequestBody Comment comment) {
        return ResponseEntity.ok().body(this.userCommentsService.addNewUserComment(comment));
    }

    @PutMapping
    public  ResponseEntity<Comment> updateUserComment(@RequestBody Comment comment) {
        return ResponseEntity.ok().body(this.userCommentsService.updateUserComment(comment));
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<String> deleteUserComment(@PathVariable int commentId) {
        this.userCommentsService.deleteUserComment(commentId);
        return ResponseEntity.ok("Comment deleted successfully.");
    }
}
