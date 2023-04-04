package com.talkhours.chatservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talkhours.chatservice.Entities.Message;
@RepositoryRestResource
public interface MessageRepos extends MongoRepository<Message,String>{
    
}
