package com.adasoft.server_two.consumer;

import com.adasoft.server_two.model.entity.FileChangeEvent;
import com.adasoft.server_two.service.FileChangeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FileChangeEventConsumer {

    @Autowired
    private FileChangeEventService fileChangeEventService;

    @KafkaListener(topics = "${server_two.kafka.topic}")
    public void consumeFileChangeEvent(FileChangeEvent fileChangeEvent) {
        // Process the FileChangeEvent
        fileChangeEventService.processFileChangeEvent(fileChangeEvent);
    }
}
