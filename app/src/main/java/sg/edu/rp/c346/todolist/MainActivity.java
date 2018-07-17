package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;

    ArrayList<ToDoItem> alToDo;

    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.ListViewToDo);

        alToDo = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);

        ToDoItem item1 = new ToDoItem("MSA", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        alToDo.add(item1);
        alToDo.add(item2);

        caToDo = new CustomAdapter(this, R.layout.todo_item, alToDo);

        lvToDo.setAdapter(caToDo);
    }
}
