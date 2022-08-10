package com.example.appdblibrary.repository.product;

import com.example.appdblibrary.entity.product.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
    
}
