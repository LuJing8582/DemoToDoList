package sg.edu.rp.c346.id19018582.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDoItem> alTodo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listToDo);

        alTodo = new ArrayList<>();
        alTodo.add(new ToDoItem("Go for movie", Calendar.getInstance()));
        alTodo.add(new ToDoItem("Go for haircut", Calendar.getInstance()));

        adapter = new CustomAdapter(this, R.layout.row, alTodo);
        lvToDo.setAdapter(adapter);
    }
}
