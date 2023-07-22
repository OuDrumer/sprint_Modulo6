package tech.awakelab.jpapreventionsprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.awakelab.jpapreventionsprint.models.Revision;


public interface IRevisionRepository extends JpaRepository<Revision, Integer>{

}
