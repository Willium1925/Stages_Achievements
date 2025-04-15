package backend_demo;

// 作法與要求
// 請建立一個父類別 Account，並將共用的欄位與方法放進去
// 子類別 User, Admin, Guest 要繼承 Account
// Guest 雖然繼承 Account，但你要想辦法覆寫（Override）或調整內容，讓它沒有 email 跟 createdAt 的實例屬性
// 每個類別寫一個方法，印出該帳號的資訊（使用 toString()）
// 最後請你在 main() 方法中，建立三種帳號物件，並呼叫各自的功能方法（例如 user.postArticle()）
public class Aapp {
    public static void main(String[] args) {

        //// 測試遊客
        //Guest guest = new Guest();
        //System.out.println(guest.getUserName());
        //System.out.println(guest.getEmail());
        //System.out.println(guest.getTime());
        //
        //Article article001 = new Article();
        //System.out.println(article001.getContent());
        //
        //Admin admin001 = new Admin("管理員一號", "這是信箱");
        //admin001.deleteArticle(article001);
        //System.out.println(article001.getContent());
        //
        //Account account = new Account();
        //System.out.println(account.toString());
        //System.out.println(admin001.toString());
        //

        Admin admin001 = new Admin("管理員一號", "admin@gmail");
        User user001 = new User("會員一號", "user@gmail", 5);
        Guest guest001 = new Guest();

        // 測試身分資訊
        System.out.println(admin001.toString());
        System.out.println(user001.toString());
        System.out.println(guest001.toString());

        // 瀏覽功能
        System.out.println(admin001.browse());
        System.out.println(user001.browse());
        System.out.println(guest001.browse());

        // 使用者新增文章
        //user001.postArticle("我是會員一號，大家安安");
        Article temp = user001.postArticle02("我是會員一號，大家安安");
        System.out.println(temp.getContent());
        // 更新文章
        user001.updateArticle(temp, "我是會員一號，我家的貓會後空翻");
        System.out.println(temp.getContent());
        // 管理者刪除該文章
        admin001.deleteArticle(temp);
        System.out.println(temp.getContent());
    }
}







