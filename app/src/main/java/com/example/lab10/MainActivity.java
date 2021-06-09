package com.example.lab10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String animals[]={"lion","cheetah","impala","moose"};
    String animal_pics_url[]={"https://www.krugerpark.co.za/images/black-maned-lion-shem-compion-590x390.jpg",
                              "https://upload.wikimedia.org/wikipedia/commons/0/09/TheCheethcat.jpg",
                               "https://image.shutterstock.com/image-photo/twoheaded-impala-gazelle-illusion-masai-260nw-1450173218.jpg",
                                "https://www.denali.org/wp-content/uploads/moose.jpg"
                              };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
    }
}