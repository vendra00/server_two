package com.adasoft.server_two.service;

import com.adasoft.server_two.model.entity.FileChangeEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FileChangeEventServiceImpl implements FileChangeEventService {

    @Value("${server_two.folder.path}")
    private String folderPath;

    @Override
    public void processFileChangeEvent(FileChangeEvent fileChangeEvent) {
        // Perform the desired processing for the FileChangeEvent
        // This can include saving the event to the database, performing actions based on the event type, etc.
        System.out.println("Received FileChangeEvent: " + fileChangeEvent);
    }

}
