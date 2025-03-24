import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")


public class ServiceController {
    @Autowired
    private ServiceRepository serviceRepository;

    @GetMapping
    public List<Services> getAllServices() {
        return serviceRepository.findAll();
    }

    @PostMapping
    public Services addService(@RequestBody Services service) {
        return serviceRepository.save(service);
    }
}
