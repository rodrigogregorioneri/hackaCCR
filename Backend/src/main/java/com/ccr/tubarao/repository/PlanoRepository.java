package com.hackaprev.app.repository;

import com.hackaprev.app.model.PlanoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanoRepository extends MongoRepository<PlanoModel, String> {
}
