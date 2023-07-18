package sg.edu.rp.c346.id22021538.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<ToDoItem> alTodo;

    //ArrayAdapter<AndroidVersion> aaAndroidVersions;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.todolist);
        alTodo = new ArrayList<>();

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ToDoItem item1 = new ToDoItem("Go for movie", calendar);
        ToDoItem item2 = new ToDoItem("Go for haircut", calendar);

        alTodo.add(item1);
        alTodo.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, alTodo);

        lvTodo.setAdapter(adapter);
    }
}