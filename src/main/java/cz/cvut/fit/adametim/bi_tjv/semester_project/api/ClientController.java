package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ClientDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/clients")
public final class ClientController extends AbstractCrudController<Client, ClientDto, Long> {
    public ClientController(AbstractCrudService<Client, Long> service, 
                            Function<Client, ClientDto> toDtoConverter,
                            Function<ClientDto, Client> toEntityConverter) {
        super(service, toDtoConverter, toEntityConverter);
    }
}
