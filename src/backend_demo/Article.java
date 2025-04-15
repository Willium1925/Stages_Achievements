package backend_demo;

// 模擬文章，可以增改刪(但沒有真的刪)
public class Article {
    private boolean isDelete = false;

    String str;

    // 暫時用建構子模擬新增文章
    public Article(String str) {
        this.str = str;
    }

    //// 增
    //public void create(String str) {
    //    this.str = str;
    //}

    // 改
    public void update(String str) {
        this.str = str;
    }

    // 刪除文章(模擬沒真的刪)
    //public void setDelete(boolean b) { // 有點多此一舉，改成下面可以直觀很多
    //    this.isDelete = b;
    //}
    public void delete() {
        this.isDelete = true;
    }

    // 輸出文章內容
    public String getContent() {
        return !isDelete ?  str: "***文章已刪除***";
    }
}
