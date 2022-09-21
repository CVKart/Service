package com.cvkart.service.service;

import com.amazonaws.services.s3.model.S3ObjectInputStream;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface AmazonS3Service {

    public void addImage(MultipartFile image) throws IOException;

    public S3ObjectInputStream getImage(String image) throws FileNotFoundException, IOException;

    public List<String> listImages();
}
