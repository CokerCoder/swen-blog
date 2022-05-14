package com.swen.blog.service;

import com.swen.blog.payload.PostDto;
import com.swen.blog.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto PostDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePostById(PostDto postDto, long id);

    void deletePostById(long id);
}
