package exam03;

public enum  Transportation /*extends java.lang.Enum*/{

    // enum (열거형)
    // 정적 상수만을 위해 용도가 정해진 클래스의 일종
    // extends java.lang.Enum
    // enum 클래스의 정적 상수 객체

    // public static final Transportation BUS = new Transportation();
    // public static final Transportation SUBWAY = new Transportation();
    // public static final Transportation TAXI = new Transportation();

    BUS("버스",1450) {
        @Override
        public int getBasicFare(int no) {
            return getBasicFare() * no;
        }
    },
    SUBWAY("지하철",1450) {
        @Override
        public int getBasicFare(int no) {
            return getBasicFare() * no;
        }
    },
    TAXI("택시",4500) {
        @Override
        public int getBasicFare(int no) {
            return getBasicFare() * no;
        }
    };

    private String title;
    private int basicFare; // 기본 요금
    // 생성자가 private
    Transportation (String title, int basicFare) {
        this.title = title;
        this.basicFare = basicFare;

    }

    public String getTitle() {
        return title;
    }

    public abstract int getBasicFare(int no);

    public int getBasicFare() {
        return basicFare;
    }



}
