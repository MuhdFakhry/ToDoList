package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15007803 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int Layout_id;
    ArrayList<ToDoItem> ToDoList;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        Layout_id = resource;
        ToDoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(Layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        ToDoItem currentItem = ToDoList.get(position);
        String name = currentItem.getName();
        String date = currentItem.getDateString();
        tvName.setText(name);
        tvDate.setText(date);
        return rowView;
    }
}
