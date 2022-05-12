package com.swen.blog.service;

import java.util.List;

import com.swen.blog.exception.PostDto;

public interface PostService {
    PostDto createPost(PostDto PostDto);

    List<PostDto> getAllPosts();
}
