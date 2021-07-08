package com.cubemall.search.repository;

import com.cubemall.search.model.Blog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface BlogRepository extends ElasticsearchRepository<Blog, Long> {
    List<Blog> findByTitle(String title);
    List<Blog> findByTitleAndContent(String title, String content);
}
