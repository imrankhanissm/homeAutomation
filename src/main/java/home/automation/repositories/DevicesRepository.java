package home.automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.automation.models.DevicesModel;

@Repository
public interface DevicesRepository extends JpaRepository<DevicesModel, Integer>{

}