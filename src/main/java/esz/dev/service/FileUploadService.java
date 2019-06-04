package esz.dev.service;

import org.springframework.stereotype.Service;

@Service
public class FileUploadService {
    private HelperService helperService;

    public FileUploadService(HelperService helperService) {
        this.helperService = helperService;
    }

    public int getValue() {
        return helperService.calc();
    }
}
