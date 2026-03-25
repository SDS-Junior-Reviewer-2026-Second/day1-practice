class DatabaseService {
    private boolean isConnected = false;

    public void connect() {
        isConnected = true;
        System.out.println("데이터 베이스 연결됨");
    }

    public void excuteQuery(String query) {
        if (!isConnected) {
            throw new IllegalStateException("데이터 베이스 연결이 안됨");
        }
        System.out.println("쿼리 실행: " + query);
    }
}

class Main {
    public static void main(String[] args) {
        DatabaseService db_service = new DatabaseService();
        db_service.connect();
        db_service.excuteQuery("hello");
    }
}
