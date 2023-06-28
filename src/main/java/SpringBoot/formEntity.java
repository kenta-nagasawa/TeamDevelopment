package SpringBoot;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "introductions")
public class formEntity implements Serializable {
  /**
   * ID
   */
  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long user_id;
  /**
   * 住所
   */
  @Column(name = "name")
  private String name;
  /**
   * 電話番号
   */
  @Column(name = "kana")
  private String kana;
  /**
   * 更新日時
   */
  @Column(name = "gender")
  private String gender;
  /**
   * 登録日時
   */
  @Column(name = "hobby")
  private String hobby;
  /**
   * 削除日時
   */
  @Column(name = "word")
  private String worde;
  /**
   * 削除日時
   */
  @Column(name = "created_at")
  private String created_at;
  /**
   * 削除日時
   */
  @Column(name = "updated_at")
  private String updated_at;
  
}
