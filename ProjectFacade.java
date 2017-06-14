package com.sap.supportframework.project.facade;

import com.sap.supportframework.project.dto.ProjectDTO;
import com.sap.supportframework.project.model.Project;

public interface ProjectFacade {
	
	public Project createProject(ProjectDTO project);
	
	int
	
	public void updateProject(Project project,  ProjectDTO newProject);
	
	
	public void updateProject(Project project, ProjectDTO newProject);

}