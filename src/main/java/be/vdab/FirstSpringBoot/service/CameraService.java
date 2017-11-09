package be.vdab.FirstSpringBoot.service;

import be.vdab.FirstSpringBoot.model.Camera;

import java.util.List;

public interface CameraService {
    List<Camera> allCameras();
    void addCamera(Camera camera);
}
