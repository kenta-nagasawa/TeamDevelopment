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
	public void create(UserRequest userRequest) {
		Date now = new Date();
		User user = new User();
		user.setName(userRequest.getName());
		user.setAddress(userRequest.getAddress());
		user.setPhone(userRequest.getPhone());
		user.setCreateDate(now);
		user.setUpdateDate(now);
		userRepository.save(user);
	}
	
	/*
	 * ユーザー情報　全検索
	 * @return 検索結果
	 */
	public List<user> searchAll(){
		return formRepository.findAll();
	}
	
	/*
	 * ユーザー情報　全検索
	 * @return 検索結果
	 */
	public List<introduction> searchAll(){
		return formRepository.findAll();
	}
}

