package com.learning.chapter2.jpa;

import org.springframework.stereotype.Repository;

import com.learning.chapter2.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JPARepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
