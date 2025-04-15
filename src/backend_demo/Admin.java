package backend_demo;

class Admin extends Account {
    // 獨有身分別
    private final boolean isAdmin = true;

    // 不需再寫toString

    // 瀏覽
    @Override
    String browse() {
        return "你是管理者，當然可以" + super.browse();
    }

    // 刪除文章
    void deleteArticle(Article article) {
        article.delete();
    }

    // 帶參建構子，用來初始化
    public Admin(String userName, String email) {
        super(userName, email);
    }
}