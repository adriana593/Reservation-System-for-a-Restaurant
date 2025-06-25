
package Domain;
public class Time {
    private int h ;
    private int m;

    public Time(int h, int m) {
        if( h >= 0 && h <= 23)
         this.h = h;
        if(m >= 0 && m <= 59)
         this.m = m;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if( h >= 0 && h <= 23)
         this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        if(m >= 0 && m <= 59)
         this.m = m;
    }
    @Override
    public String toString(){
        return h + ":" + m;
    }
}
