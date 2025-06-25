
package Domain;
public class Time {
    private int hour ;
    private int minute;

    public Time(int hour, int minute) {
        if( hour >= 0 && hour <= 23)
         this.hour = hour;
        if(minute >= 0 && minute <= 59)
         this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if( hour >= 0 && hour <= 23)
         this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 59)
         this.minute = minute;
    }
    @Override
    public String toString(){
        return hour + ":" + minute;
    }
}
