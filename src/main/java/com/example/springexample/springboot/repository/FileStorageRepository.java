package com.example.springexample.springboot.repository;

import com.example.springexample.springboot.domain.FileStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.File;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage,Long> {

   FileStorage findByHashId(String hashId);


}
