package tech.awakelab.jpapreventionsprint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.jpapreventionsprint.models.Revision;
import tech.awakelab.jpapreventionsprint.repository.IRevisionRepository;

@Service
public class RevisionService {
	
	@Autowired
	private IRevisionRepository revisionRepository;

	public RevisionService() {
	}
	
	public List<Revision> getAllRevisiones(){
		return revisionRepository.findAll();
	}
	
	public void saveRevision(Revision revision) {
		revisionRepository.save(revision);
	}
}
