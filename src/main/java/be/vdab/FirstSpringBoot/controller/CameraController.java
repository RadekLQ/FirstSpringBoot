package be.vdab.FirstSpringBoot.controller;

import be.vdab.FirstSpringBoot.model.Camera;
import be.vdab.FirstSpringBoot.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CameraController {

    @Autowired
    private final CameraService service;

    public CameraController(CameraService service) {
        this.service = service;
    }

    @GetMapping("/cameras")
    public List<Camera> showCamera() {
        return service.allCameras();
    }

    @PostMapping("/cameras")
    public void addCamera(@RequestBody Camera camera) {
        service.addCamera(camera);
   }
}

