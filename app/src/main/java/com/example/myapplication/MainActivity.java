package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.Java.Student;
import com.example.myapplication.Java.StudentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewStudent;
    private ArrayList<Student> arrayListStudent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewStudent = findViewById(R.id.listViewStudent);

        arrayListStudent.add(new Student("Mikumo"," MACROSS1235","Uta Wa Shinpi"));
        arrayListStudent.add(new Student("Ranka Lee"," MACROSS1234","Uta Hime"));
        arrayListStudent.add(new Student("Kaname"," MACROSS1237","Uta Wa Inochi"));
        arrayListStudent.add(new Student("Freiya"," MACROSS1239","Hoshi Wa Genki"));

        StudentAdapter adapter=new StudentAdapter(arrayListStudent, this);

        listViewStudent.setAdapter(adapter);

        listViewStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = (Student) parent.getAdapter().getItem(position);

                Intent i =new Intent(MainActivity.this, StudentProfileActivity.class);
                i.putExtra("name",student.getStudentName());
                i.putExtra("id",student.getStudentId());
                i.putExtra("course",student.getStudentCourse());
                startActivity(i);
            }
        });
    }
}
