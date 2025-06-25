package Domain;
public class Date {
   private int y ;
   private int m;
   private int d;

    public Date(int d, int m, int y) {
        if (d >= 1 && d <= dayInMonth(y, m)) 
         this.d = d;
        if(m >= 1 && m <=12)
         this.m = m;
        if(y >= 2025)
         this.y = y;
       
        
    }

    public int getYear() {
        return y;
    }

    public void setYear(int y) {
        if(y >= 2025)
         this.y = y;
    }

    public int getMonth() {
        return m;
    }

    public void setMonth(int m) {
        if (m >= 1 && m <= 12)
         this.m = m;
    }

    public int getDay() {
        return d;
    }

    public void setDay(int d) {
        if (d >= 1 && d <= dayInMonth(y, m)) 
        this.d = d;
        
    }
    
    @Override
    public String toString(){
        return d + "-" +m+ "-" +y;
    }
    
    private int dayInMonth(int y, int m){
        switch(m){
            case 4: case 6: case 9: case 11: return 30;
            case 2: return (isLeapYear(y)? 29 : 28);
                default: return 31;        
        }
    }
    private boolean isLeapYear(int y){
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}
