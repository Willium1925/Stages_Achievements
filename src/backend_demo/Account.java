package backend_demo;

import java.time.LocalDateTime;

class Account {
    private final boolean isAdmin = false;
    private String userName;
    private String email;
    private final String time;

    // 覆寫toString，改成顯示身分資訊
    // 後續子類不需再覆寫，但子類使用的話仍是【多型】的體現
    @Override
    public String toString() {
        return "【名稱】" + (this.userName != null ? this.userName: "空") + "\t" +
                "【信箱】" + (this.email != null ? this.email: "空") + "\t" +
                "【創建時間】" + this.time + "\t" +
                "【權限】" + (isAdmin ? "管理員": this.getClass().getSimpleName());
    }

    // 瀏覽
    // 全員皆可瀏覽，但依據權限別有不同提示
    // 後續子類以【覆寫】aka【多型】實現browse()方法
    String browse() {
        return "瀏覽頁面";
    }

    // 空建構子，只一定先初始建立時間
    // 訪客可用
    public Account() {
        this.time = String.valueOf(LocalDateTime.parse("2021-01-01T13:40:50"));
    }

    // 全參建構子，實際給子類使用，使用this()呼叫空建，以初始化建立時間
    // 管理者、會員可用
    public Account(String userName, String email) {
        this();
        this.userName = userName;
        this.email = email;
    }



    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getTime() {
        return time;
    }
}
