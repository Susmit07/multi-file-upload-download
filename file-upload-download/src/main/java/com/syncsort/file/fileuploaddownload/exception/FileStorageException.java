package com.syncsort.file.fileuploaddownload.exception;

public class FileStorageException extends RuntimeException {

	private static final long serialVersionUID = 812910785951108635L;

	public FileStorageException(String message) {
		super(message);
	}

	public FileStorageException(String message, Throwable cause) {
		super(message, cause);
	}

}
