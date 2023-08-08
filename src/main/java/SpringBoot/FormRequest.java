package SpringBoot;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
* ユーザー情報 リクエストデータ
*/
@Data
public class FormRequest implements Serializable {

    /**
    * 名前のデータw
    */
    @NotEmpty(message = "名前は必須項目です。")
    @Size(max = 10, message = "名前は10文字以内で入力してください。")
    private String name;
    
    /**
    * フリガナのデータ
    */
    @NotEmpty(message = "フリガナは必須項目です。")
    @Size(max = 20, message = "名前は20文字以内で入力してください。")
    private String kana;
    /**
     * 性別のデータ
     */
    private String gender;
    /**
    * 趣味のデータ
    */
    @NotNull(message = "趣味は必須項目です。1つ以上選んでください。")
    private String hobby;
    /**
    * コメントのデータ
    */
    private String word;
}