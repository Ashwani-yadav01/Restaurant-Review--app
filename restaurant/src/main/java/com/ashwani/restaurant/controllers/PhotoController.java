package com.ashwani.restaurant.controllers;

import com.ashwani.restaurant.domain.dtos.PhotoDto;
import com.ashwani.restaurant.domain.entities.Photo;
import com.ashwani.restaurant.mappers.PhotoMapper;
import com.ashwani.restaurant.servieces.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/photos")
@RequiredArgsConstructor
public class PhotoController {
    private final PhotoService photoService;
    private final PhotoMapper photoMapper;

    @PostMapping
    public PhotoDto uploadPhoto(@RequestParam("file") MultipartFile file) {
        Photo savedPhoto = photoService.uploadPhoto(file);
        return photoMapper.toDto(savedPhoto);
    }

    @GetMapping
    public ResponseEntity<Resource> getPhoto(@PathVariable String id) {
        return photoService.getPhotoAsResource(id).map(photo -> ResponseEntity.ok()
                .contentType(
                        MediaTypeFactory.getMediaType(photo)
                                .orElse(MediaType.APPLICATION_OCTET_STREAM)
                )
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline")
                .body(photo)
        ).orElse(ResponseEntity.notFound().build());
    }
}
