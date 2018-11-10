package com.sakthi.JPASample.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakthi.JPASample.to.StudentTO;

@Repository
public interface StudentReposirory extends JpaRepository<StudentTO,Long>{
}
