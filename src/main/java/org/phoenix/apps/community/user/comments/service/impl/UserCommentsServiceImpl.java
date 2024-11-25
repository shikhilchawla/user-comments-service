package org.phoenix.apps.community.user.comments.service.impl;

import org.phoenix.apps.community.user.comments.dao.UserCommentsRepository;
import org.phoenix.apps.community.user.comments.model.Comment;
import org.phoenix.apps.community.user.comments.service.UserCommentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCommentsServiceImpl implements UserCommentsService {

    private final UserCommentsRepository userCommentsRepository;

    public UserCommentsServiceImpl(UserCommentsRepository userCommentsRepository) {
        this.userCommentsRepository = userCommentsRepository;
    }
    @Override
    public List<Comment> getUserCommentsByPostId(int postId) {
        return userCommentsRepository.findCommentByPostId(postId);
    }

    @Override
    public Comment addNewUserComment(Comment comment) {
        return userCommentsRepository.save(comment);
    }

    @Override
    public Comment updateUserComment(Comment comment) {
        return userCommentsRepository.save(comment);
    }

    @Override
    public void deleteUserComment(int commentId) {
        userCommentsRepository.deleteById(commentId);
    }
}
