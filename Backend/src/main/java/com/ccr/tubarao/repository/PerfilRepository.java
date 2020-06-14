package com.hackaprev.app.repository;

import com.hackaprev.app.model.PerfilModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PerfilRepository extends MongoRepository<PerfilModel, String> {
}
