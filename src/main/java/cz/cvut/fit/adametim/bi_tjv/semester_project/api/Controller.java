package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.DomainEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

/**
 * Provides access to the basic HTTP operations.
 *
 * @param <E> entity.
 * @param <D> dto.
 * @param <ID> entity id.
 */
public class Controller<E extends DomainEntity<ID>, D, ID> {

    protected AbstractCrudService<E, ID> service;
    protected Function<E, D> toDtoConverter;
    protected Function<D, E> toEntityConverter;

    public Controller(AbstractCrudService<E, ID> service, Function<E, D> toDtoConverter, Function<D, E> toEntityConverter) {
        this.service = service;
        this.toDtoConverter = toDtoConverter;
        this.toEntityConverter = toEntityConverter;
    }


    @PostMapping
    public D create (@RequestBody D e) {
        return toDtoConverter.apply(service.create(toEntityConverter.apply(e)));
    }

    @GetMapping
    public Collection<D> readAll() {
        Collection<D> returnCollection = new ArrayList<D>();
        var all = service.readAll();
        all.forEach(it ->
                returnCollection.add(toDtoConverter.apply(it)));
        return returnCollection;
    }

    @PutMapping("/{id}")
    public void update(@RequestBody D e, @PathVariable("id") ID id) {
        service.update(toEntityConverter.apply(e));
    }

    //    DELETE /users/{id}
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") ID id) {
        service.deleteById(id);
    }
}
