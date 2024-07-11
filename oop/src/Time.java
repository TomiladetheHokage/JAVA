public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = validateHour(hour);
        this.minute = validateMinute(minute);
        this.second = validateSecond(second);
    }

    public Time() {
       this(0,0,0);
    }

    public Time(int hour) {
        this(hour,0,0);
    }

    public Time(int hour, int minute) {
      this(hour,minute,0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = validateHour(hour);
        this.minute = validateMinute(minute);
        this.second = validateSecond(second);
    }

    public int validateHour(int hour){
        if(hour > 23 || hour < 0){
            throw new IllegalArgumentException("Invalid hour");
        }
        return hour;
    }

    public int validateMinute(int minute) {
        if(minute > 59 || minute < 0){
            throw new IllegalArgumentException("Invalid minute");
        }
        return minute;
    }

    public int validateSecond(int second) {
        if(second > 59 || second < 0){
            throw new IllegalArgumentException("Invalid second");
        }
        return second;
    }

}
