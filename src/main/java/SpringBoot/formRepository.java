package SpringBoot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class formRepository {
	
	// JdbcTemplateクラスを利用する
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SELECT文
	// 結果をMapで取得する。
	// MapのキーにはSELECT結果のカラム名、Mapの値にはSELECT結果の値が入る
	public Map<String, Object>findById(String id) {
		String query = "SELECT *"
				+ " FROM employee"
				+ " WHERE id=?";
		
		// 検索実行
		// id = 1のとき
		// employee.put("id", "1")
		// employee.put("name", "Kato")
		// employee.put("age", 10)
		Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);
		return employee;
	}

	
	
}