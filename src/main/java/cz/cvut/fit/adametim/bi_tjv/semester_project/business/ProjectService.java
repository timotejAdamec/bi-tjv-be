package cz.cvut.fit.adametim.bi_tjv.semester_project.business;

import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa.ManagerRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa.ProjectRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProjectService extends AbstractCrudService<Project, Long> {

    private final ManagerRepository managerRepository;

    public ProjectService(ProjectRepository repository,
                          ManagerRepository clientRepository) {
        super(repository);
        this.managerRepository = clientRepository;
    }

    /**
     * Sets as {@code Project.currentManager} the manager with managerId {@code managerId} in all projects
     * that have this manager in {@code Project.managersHistory}.
     *
     * @param managerId of the manager that should take over the projects.
     */
    @Transactional
    void takeOverProjectsOfColleagues(Long managerId) {
        Optional<Manager> managerResult = managerRepository.findById(managerId);
        if (managerResult.isEmpty()) {
            throw new EntityStateException("Manager with managerId " + managerId + " does not exist!");
        }
        Manager manager = managerResult.get();

        Collection<Project> colleagueProjects = ((ProjectRepository) repository).getColleagueProjects(manager);

        for (Project colleagueProject: colleagueProjects) {
            colleagueProject.setCurrentManager(manager);
        }
    }
}
