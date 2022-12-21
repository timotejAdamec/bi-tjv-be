package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.object;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ObjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa.ProjectRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ObjectToEntityConverter implements Function<ObjectDto, Object> {
    private final ProjectRepository projectRepository;

    @Autowired
    public ObjectToEntityConverter(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Object apply(ObjectDto objectDto) {
        return new Object(
                objectDto.objectId(),
                projectRepository.findById(objectDto.objectId()).get()
        );
    }
}
