package com.syncsort.file.fileuploaddownload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.syncsort.file.fileuploaddownload.uploadconfig.FileUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileUploadProperties.class
})
public class FileUploadDownloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadApplication.class, args);
	}

}
