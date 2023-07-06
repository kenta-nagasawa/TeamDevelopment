package SpringBoot;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
* ユーザー情報 リクエストデータ
*/
@Data
public class formRequest implements Serializable {

    /**
    * 名前
    */
    @NotEmpty(message = "名前を入力してください")
    @Size(max = 10, message = "名前は10文字以内で入力してください")
    private String name;
    
    /**
    * 名前
    */
    @NotEmpty(message = "フリガナを入力してください")
    @Size(max = 20, message = "名前は20文字以内で入力してください")
    private String name_sub;
    /**
    * 名前
    */
    @NotNull(message = "趣味を選択してください")
    private String hobby;
    /**
    * 住所
    */
    @Size(max = 300, message = "コメントは300文字以内で入力してください")
    private String comment;
}