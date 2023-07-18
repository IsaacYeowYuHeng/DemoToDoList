package sg.edu.rp.c346.id22021538.demotodolist;


import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH) +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {
        String dayOfWeek = "";
        if (day == 1){
            dayOfWeek = "Monday";
        }else if (day == 2) {
            dayOfWeek = "Tuesday";
        }else if (day == 3) {
            dayOfWeek = "Wednesday";
        }else if (day == 4) {
            dayOfWeek = "Thursday";
        }else if (day == 5) {
            dayOfWeek = "Friday";
        }else if (day == 6) {
            dayOfWeek = "Saturday";
        }else {
            dayOfWeek = "Sunday";
        }
        return dayOfWeek;
    }
}