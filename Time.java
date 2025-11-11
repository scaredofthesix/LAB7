class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    public Time(int hours) {
        this(hours, 0, 0);
    }

    public Time inc() {
        seconds++;
        normalize();
        return this;
    }

    void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }
    }

    public static Time difference(Time t1, Time t2) {
        int total1 = t1.hours * 3600 + t1.minutes * 60 + t1.seconds;
        int total2 = t2.hours * 3600 + t2.minutes * 60 + t2.seconds;
        int d = Math.abs(total1 - total2);

        return new Time(d / 3600, (d % 3600) / 60, d % 60);
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

class lab {
    public static void main(String[] args) {
        Time time1 = new Time(11, 30, 45);  // 10:30:45
        Time time2 = new Time(8, 15);       // 08:15:00

        time1.display();
        System.out.print("\n");
        time2.display();
        Time diff = Time.difference(time1, time2);
        System.out.print("\nDifference: ");
        diff.display();
        System.out.print("\n");
        time1.inc().inc().inc().display();
    }
}
