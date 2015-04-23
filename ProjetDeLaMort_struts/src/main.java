import org.springframework.beans.factory.annotation.Autowired;

import com.projetdelamort.metier.entities.Client;
import com.projetdelamort.metier.services.IService;


public class main {

	@Autowired
	IService<Client> service;
}
