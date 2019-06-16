package home.automation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import home.automation.models.DevicesModel;
import home.automation.repositories.DevicesRepository;
import home.automation.services.DevicesService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("api/")
public class HomeController{

	@Autowired
	DevicesService devicesService;

	@Autowired
	DevicesRepository devicesRepository;

	@RequestMapping("")
	public String index(){
		return "index working";
	}

	@PutMapping("/flip/{id}")
	public DevicesModel flip(@PathVariable int id, @RequestBody DevicesModel input) {
		Optional<DevicesModel> optional = devicesRepository.findById(input.getId());
		if(optional.isPresent()){
			DevicesModel devicesModel = optional.get();
			devicesModel.setSwitchPosition(!input.getSwitchPosition());
			devicesModel.setStatus(!input.getStatus());
			return devicesRepository.save(devicesModel);
		}
		return null;
	}
}