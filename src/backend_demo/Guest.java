package backend_demo;

class Guest extends Account {
    public Guest() {}

    // 不需再寫toString

    // 瀏覽
    @Override
    String browse() {
        return "可憐，只能" + super.browse();
    }


}

