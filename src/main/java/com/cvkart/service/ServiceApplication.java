package com.cvkart.service;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.cvkart.service.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	@Bean
	public AmazonS3 getStorageService() throws IOException {
		AWSCredentials credentials = new BasicAWSCredentials(
				"AKIAYHADPAYNKTRCWIPL",
				"Qv7yp7rjgs0+Gf7lxkULY2vOs11HWWNfjrYggg6G"
		);
		AmazonS3 s3client = AmazonS3ClientBuilder
				.standard()
				.withCredentials(new AWSStaticCredentialsProvider(credentials))
				.withRegion(Regions.US_EAST_2)
				.build();
		return s3client;
	}
}
