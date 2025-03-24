
import org.springframework.data.mongodb.repository.MongoRepository;

//Интерфейс, който Spring Data MongoDB,ще използва за работа с базата(NoSQL)



public interface ClientRepository extends MongoRepository<Client, String> {

}
