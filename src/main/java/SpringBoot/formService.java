package SpringBoot;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class formService {
	@Autowired
	private formRepository repository;

	/**
	 * ユーザー情報 新規登録
	 * @param user ユーザー情報
	 */
	  public List<formEntity> searchAll() {
		    return repository.findAll();
	}
}
