package com.knowledgehub.api.repository;

import com.knowledgehub.api.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Long> {
}
