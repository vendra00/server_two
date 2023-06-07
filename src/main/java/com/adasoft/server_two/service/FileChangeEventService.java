package com.adasoft.server_two.service;

import com.adasoft.server_two.model.entity.FileChangeEvent;

public interface FileChangeEventService {
    void processFileChangeEvent(FileChangeEvent fileChangeEvent);
}
