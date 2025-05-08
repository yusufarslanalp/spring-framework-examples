package com.example.video.stream;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class VideoController {

    private static final String VIDEO_DIRECTORY = "./";

    @GetMapping("/video/{filename}")
    public ResponseEntity<Resource> streamVideo(@PathVariable String filename) throws Exception {
        Path videoPath = Paths.get(VIDEO_DIRECTORY + filename);
        Resource videoResource = new UrlResource(videoPath.toUri());

        if (!videoResource.exists()) {
            return ResponseEntity.notFound().build();
        }

        String contentType = Files.probeContentType(videoPath);
        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + filename + "\"")
                .body(videoResource);
    }
}
