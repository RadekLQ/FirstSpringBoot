package be.vdab.FirstSpringBoot.repository;

import be.vdab.FirstSpringBoot.model.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CameraRepository extends JpaRepository<Camera, Integer>{
}
