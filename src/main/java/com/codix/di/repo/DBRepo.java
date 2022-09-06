


package com.codix.di.repo;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codix.di.model.College;
@Repository
@Transactional
	
	public interface DBRepo extends JpaRepository<College, Integer> {
	
	@Modifying
	@Query(value = "UPDATE COLLEGE SET email =?2 WHERE college_id=?1", nativeQuery = true)
	int updateCollegeEmail( String email, int collegeId);

	@Modifying
	@Query(value = "DELETE FROM COLLEGE WHERE email = ?1", nativeQuery = true)
	int deleteByEmail(String email);


	}

