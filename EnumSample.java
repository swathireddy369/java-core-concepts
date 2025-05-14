public enum EnumSample {
    MONDAY(1, "day1") {
        // @Override
        // public String toLowerCase(String day){//method
        // return day;
        // }
        @Override
        public String specialAboutMyDay() {
            return "Shiva";
        }
    },
    TUEDAY(2, "day2") {
        @Override
        public String specialAboutMyDay() {
            return "Yallamma Thalli";
        }
    },
    WEDNESDAY(3, "day3") {
        @Override
        public String specialAboutMyDay() {
            return "Vianyaka";
        }
    },
    THRUSDAY(4, "day4") {
        @Override
        public String specialAboutMyDay() {
            return "Ayyappa swamy";
        }
    },
    FRIDAy(5, "day5") {
        @Override
        public String specialAboutMyDay() {
            return "Laxmi Devi";
        }
    },
    SATURDAY(6, "day6") {
        @Override
        public String specialAboutMyDay() {
            return "Lord Venkateswra swamy";
        }
    },
    SUNDAY(7, "day7") {
        @Override
        public String specialAboutMyDay() {
            return "All Devotionals";
        }
    };

    int id;
    String day;

    EnumSample(int id, String day) {
        this.id = id;
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return day;
    }

    public void setName(String day) {
        this.day = day;
    }

    public String toLowerCase(String day) {// method
        return day.toLowerCase();
    }

    public abstract String specialAboutMyDay();

    public boolean isWeekend(EnumSample day) {// method
        if (EnumSample.SATURDAY == day) {
            return true;
        }
        return false;

    }
    // values()
    // valueOf()
    // ordinal()
    // name()

};

class Sample {// hey these all are constants we cannot chnage this so in the place of enum we
              // can use this but the main difference and disadvantage of this is
    public static final int MONDAY = 0;
    public static final int TUEDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THRUSDAY = 3;
    public static final int FRIDAy = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;
}