package mx.softixx.cis.common.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface FullTextSearchRepository<T, I> extends JpaRepository<T, I> {
	
	List<T> searchBy(String text, int limit, String... fields);
	
}