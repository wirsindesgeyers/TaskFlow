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
    public Project findById(Long id){
        // 1. Tente buscar o projeto. findById retorna um Optional.
        return projectRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("O projeto com id " + id + " não existe."));
    }


}
