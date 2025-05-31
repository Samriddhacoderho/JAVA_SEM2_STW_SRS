package oop_tasks_31May;

class SimpleInterest {
    int principle;
    int time;
    double rate;

    void setPrinciple(int p) {
        principle = p;
    }

    void setTime(int t) {
        time = t;
    }

    void setRate(double r) {
        rate = r;
    }

    int getPrinciple() {
        return principle;
    }

    int getTime() {
        return time;
    }

    double getRate() {
        return rate;
    }

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        s.setPrinciple(1000);
        s.setTime(2);
        s.setRate(5.5);

        System.out.println(s.getPrinciple());
        System.out.println(s.getTime());
        System.out.println(s.getRate());
    }
}
