package SpringBoot;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "introductions")
public class FormEntity implements Serializable {
	/*
	  ユーザー情報ID
	 */
	@Id
	@Column(name = "introduction_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer introduction_id;
	/*
	  ユーザーID
	 */
	@Column(name = "user_id")
	private int user_id;
	/*
	  名前
	 */
	@Column(name = "name")
	private String name;
	/*
	  フリガナ
	 */
	@Column(name = "kana")
	private String kana;
	/*
	  性別
	 */
	@Column(name = "gender")
	private String gender;
	/*
	  趣味
	 */
	@Column(name = "hobby")
	private String hobby;
	/*
	  一言コメント
	 */
	@Column(name = "word")
	private String word;
	/*
	 登録日
	 */
	@Column(name = "created_at")
	private Date created_at;
	/*
	  更新日
	 */
	@Column(name = "updated_at")
	private Date updated_at;

}
