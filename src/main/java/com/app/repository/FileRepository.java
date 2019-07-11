package com.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.FileModel;

@Transactional
public interface FileRepository extends JpaRepository<FileModel, Long> {
    FileModel findByName(String name);
}
