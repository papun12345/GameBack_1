package com.wipro.MongoGamification;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryGamification extends MongoRepository<BeanGamification, String> {
	BeanGamification findBy_id(ObjectId _id);
}
