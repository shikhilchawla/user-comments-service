package org.phoenix.apps.community.user.comments.dao;

import org.phoenix.apps.community.user.comments.model.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserCommentsRepository extends CrudRepository<Comment, Integer> {

    List<Comment> findCommentByPostId(int postId);
}
