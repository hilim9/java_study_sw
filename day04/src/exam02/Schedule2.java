package exam02;

public class Schedule2 {

    private int year;

    private int month;

    private int day;

    public Schedule2() {

        //day = 10;
        // 생성자 메서드의 첫번째 라인에만 정의
        this(2023, 9, 8);
    }

    public Schedule2(int year, int month, int day) {

            this.year = year;
            this.month = month;
            this.day = day;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day; // 출처가 명확하지 않을 때 this 사용
    }

    @Override
    public String toString() {

        return "Schedule2{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public void printThis() {
        System.out.println(this); // this.toString()
        System.out.println(System.identityHashCode(this));
    }
}