package com.example.appdblibrary.repository.product;

import com.example.appdblibrary.entity.product.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {
//    AttachmentContent findByAttachmentId(Long attachment_id);

    Optional<AttachmentContent> findByAttachmentId(Long attachment_id);

}
