package Domain;
public class Date {
   private int year ;
   private int month;
   private int day;

    public Date(int day, int month, int year) {
        if (day >= 1 && day <= dayInMonth(year, month)) 
         this.day = day;
        if(month >= 1 && month <=12)
         this.month = month;
        if(year >= 2025)
         this.year = year;
       
        

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2025)
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) 
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int maxDays = dayInMonth(year, month);
        if (day >= 1 || day <= maxDays)    
        this.day = day;   
    }
    
    @Override
    public String toString(){
        return String.format("%02d-%02d-%04d", day, month, year);
    }
    
    private int dayInMonth(int year, int month){
        switch(month){
            case 4: case 6: case 9: case 11: return 30;
            case 2: return (isLeapYear(year)? 29 : 28);
                default: return 31;        
        }
    }
    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
