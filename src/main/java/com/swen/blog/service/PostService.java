package com.swen.blog.service;

import java.util.List;

import com.swen.blog.exception.PostDto;

public interface PostService {
    PostDto createPost(PostDto PostDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(long id);

    PostDto updatePostById(PostDto postDto, long id);

    void deletePostById(long id);
}
