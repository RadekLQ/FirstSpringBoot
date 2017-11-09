package be.vdab.FirstSpringBoot.service;

import be.vdab.FirstSpringBoot.model.Camera;
import be.vdab.FirstSpringBoot.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraServiceImpl implements CameraService {

    private final CameraRepository repository;

    @Autowired
    public CameraServiceImpl(CameraRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Camera> allCameras() {
        return repository.findAll();
    }

    @Override
    public void addCamera(Camera camera) {
        Camera c = repository.saveAndFlush(camera);
        if(c == null) {
            throw new RuntimeException("Camera not added");
        }
    }
}
