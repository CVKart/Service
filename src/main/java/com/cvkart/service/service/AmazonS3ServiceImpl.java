
package com.cvkart.service.service;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class AmazonS3ServiceImpl implements AmazonS3Service{

    @Autowired
    private AmazonS3 amazonS3;
    private String bucket="cvkart";

    public void addImage(MultipartFile image) throws IOException {
        File localFile=convertToFile(image);
        System.out.println("Document/"+localFile.getName());
        PutObjectResult data = amazonS3.putObject(
                bucket,
                "Document/"+localFile.getName(),
                localFile
        );
    }

    public S3ObjectInputStream getImage(String image) throws FileNotFoundException, IOException {
        S3Object s3object = amazonS3.getObject(bucket, "Document/"+image);
        S3ObjectInputStream inputStream = s3object.getObjectContent();
        return inputStream;
    }

    public List<String> listImages() {
        ListObjectsRequest listObjectsRequest =
                new ListObjectsRequest()
                        .withBucketName(bucket);

        List<String> keys = new ArrayList<>();

        ObjectListing objects = amazonS3.listObjects(listObjectsRequest);

        while (true) {
            List<S3ObjectSummary> objectSummaries = objects.getObjectSummaries();
            if (objectSummaries.size() < 1) {
                break;
            }

            for (S3ObjectSummary item : objectSummaries) {
                if (!item.getKey().endsWith("/"))
                    keys.add(item.getKey().split("/")[1]);
            }

            objects = amazonS3.listNextBatchOfObjects(objects);
        }

        return keys;
    }


    private static File convertToFile(MultipartFile image) throws IOException {
        File localFile=new File(image.getOriginalFilename());
        try (OutputStream os = new FileOutputStream(localFile)) {
            os.write(image.getBytes());
        }
        return localFile;
    }



}
