package com.bysocket.repository;

import com.bysocket.entity.ContentEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends ElasticsearchRepository<ContentEntity, Long> {

}
