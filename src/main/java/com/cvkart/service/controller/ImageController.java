package com.cvkart.service.controller;

import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;
import com.cvkart.service.service.AmazonS3Service;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/image")
public class ImageController {

    @Autowired
    AmazonS3Service s3Service;

    @GetMapping(value="/{name}",produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable String name) throws FileNotFoundException, IOException {
        S3ObjectInputStream data = s3Service.getImage(name);
        return new ResponseEntity<byte[]>(IOUtils.toByteArray(data), null, HttpStatus.SC_OK);
    }

    @PostMapping()
    public String addImage(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        s3Service.addImage(file);
        return "Image Uploaded Successfully!!";
    }

    @GetMapping()
    public ResponseEntity<List<String>> getImage() {
        List<String> data = s3Service.listImages();
        return new ResponseEntity<List<String>>(data, null, HttpStatus.SC_OK);
    }

}
