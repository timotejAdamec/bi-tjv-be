package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ClientDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import org.springframework.web.bind.annotation.*;

import java.util.function.Function;

@RestController
@RequestMapping("/clients")
public final class ClientController extends GenericController<Client, ClientDto, Long> {
    public ClientController(AbstractCrudService<Client, Long> service, 
                            Function<Client, ClientDto> toDtoConverter,
                            Function<ClientDto, Client> toEntityConverter) {
        super(service, toDtoConverter, toEntityConverter);
    }

    @PutMapping("/{clientId}")
    public void update(@RequestBody ClientDto e, @PathVariable("clientId") Long id) {
        service.update(toEntityConverter.apply(e));
    }

    @DeleteMapping("/{clientId}")
    public void deleteById(@PathVariable ("clientId") Long id) {
        service.deleteById(id);
    }
}
