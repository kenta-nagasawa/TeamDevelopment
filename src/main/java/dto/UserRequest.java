package dto;


public class UserRequest {
    @NotBlank(message = "UserIdを入力してください")
    private String userId;

    @Email(message = "有効なメールアドレスを入力してください")
    private String mailAddress;

    @NotBlank(message = "パスワードを入力してください")
    private String password;

    // ゲッターメソッド
    public String getUserId() {
        return userId;
    }

    // セッターメソッド
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    // ゲッターメソッド
    public String getMailAddress() {
        return mailAddress;
    }

    // セッターメソッド
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    
    // ゲッターメソッド
    public String getPassword() {
        return password;
    }


    // セッターメソッド
    public void setPassword(String password) {
        this.password = password;
    }
}
