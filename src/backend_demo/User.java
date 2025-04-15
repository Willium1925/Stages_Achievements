package backend_demo;

class User extends Account {
    private int level;

    // 不需再寫toString

    // 瀏覽文章
    @Override
    String browse() {
        return "你是會員，當然可以" + super.browse();
    }

    //// 新增文章
    //void postArticle(String str) {
    //    Article arrr = new Article();
    //    arrr.create(str);
    //}

    // 新增文章
    // 方便後續示範管理員刪除，才改這寫法
    Article postArticle02(String str) {
        Article arrr = new Article(str);
        return arrr;
    }

    // 修改文章
    void updateArticle(Article article, String str) {
        article.update(str);
    }

    // 建構子
    public User(String userName, String email, int level) {
        super(userName, email);
        this.level = level;
    }
}
