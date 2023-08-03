package SpringBoot;

import java.io.Serializable;

import lombok.Data;

// フォーム
@Data
public class UserSearchRequest implements Serializable {

    private Long id;
}