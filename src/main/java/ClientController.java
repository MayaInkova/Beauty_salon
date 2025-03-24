import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")

//Създаваме контролери ,за да може да работим с клиентите и услугите през HTTP



public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

}
