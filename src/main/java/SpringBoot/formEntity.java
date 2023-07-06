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
   * 名前
   */
  @Column(name = "name")
  private String name;
  /**
   * フリガナ
   */
  @Column(name = "kana")
  private String kana;
  /**
   * 性別
   */
  @Column(name = "gender")
  private String gender;
  /**
   * 趣味
   */
  @Column(name = "hobby")
  private String hobby;
  /**
   * コメント
   */
  @Column(name = "word")
  private String worde;
  /**
   *
   */
  @Column(name = "created_at")
  private String created_at;
  /**
   * 
   */
  @Column(name = "updated_at")
  private String updated_at;
  
}
