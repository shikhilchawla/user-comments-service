package org.phoenix.apps.community.user.comments.service;

import org.phoenix.apps.community.user.comments.model.Comment;

import java.util.List;

public interface UserCommentsService {

    List<Comment> getUserCommentsByPostId(int postId);

    Comment addNewUserComment(Comment comment);

    Comment updateUserComment(Comment comment);

    void deleteUserComment(int commentId);
}
