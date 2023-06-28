package SpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
	/**
	 * ユーザー情報 Repository
	 */
	@Repository
	public interface formRepository extends JpaRepository<formEntity, Long> {
	
}