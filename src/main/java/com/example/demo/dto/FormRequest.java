package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**ssss
* ユーザー情報 リクエストデータ
*/
@Data
public class FormRequest implements Serializable{
    /**
    * 名前
    */
    @NotEmpty(message = "名前を入力してください")
    @NotBlank(message = "名前を入力してください")
    @Size(min=1,max=2, message = "名前は10文字以内で入力してください")
    private String name;
    
    /**
    * カナ
    */
    @NotEmpty(message = "フリガナを入力してください")
    @Size(max = 2, message = "名前は20文字以内で入力してください")
    private String kana;
    
    /**
    * 趣味
    */
    @NotNull(message = "趣味を選択してください")
    private String hobby;
    /**
    * コメント
    */
    @Size(max = 300, message = "コメントは300文字以内で入力してください")
    private String comment;
}