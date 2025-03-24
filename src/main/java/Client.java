import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Client {

    @Data
    @Document(collection = "clients")
    public class Client {
        @Id
        private String id;
        private String name;
        private String email;
        private String phone;
    }
}
