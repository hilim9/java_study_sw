package exam02;

public class  Schedule {

        private int year;

        private int month;

        private int day;

        // set()
        public void setYear(int _year) {
                year = _year;
        }

        public int getYear() {
                return year;
        }

        public void setMonth(int _month) {
                month = _month;
        }

        public int getMonth() {
                return month;
        }

        public void setDay(int _day) {

                // 코드 작성 가능 (통제 가능)
                // 캡슐화
                if (month == 2 && _day > 28) _day = 28;

                day = _day;

        }

        public int getDay() {
                return day;
        }


        void showInfo() {
            System.out.printf("year=%d, month=%d, day=%d%n",year, month, day);
        }
}
