package mx.softixx.cis.common.jpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SearchRepository<T, I> extends JpaRepository<T, I> {
	
	public Page<T> findAll(String keyword, Pageable pageable);
	
}