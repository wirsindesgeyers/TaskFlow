package service;

import model.project.Project;
import org.springframework.stereotype.Service;
import repository.ProjectRepository;

import java.util.NoSuchElementException;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    //encontrar projeto pelo id
    public Project getById(Long id){
            return projectRepository.findById(id)
                    .orElseThrow(() -> new NoSuchElementException("Project not found with id: " + id));
    }


}
