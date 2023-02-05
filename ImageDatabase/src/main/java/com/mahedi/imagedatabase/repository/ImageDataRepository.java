package com.mahedi.imagedatabase.repository;

import com.mahedi.imagedatabase.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageDataRepository extends JpaRepository<ImageData,Long> {
}
