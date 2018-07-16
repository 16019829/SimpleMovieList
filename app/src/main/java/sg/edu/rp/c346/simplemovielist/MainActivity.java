package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //1b. create listview variable
    ListView lvMovies;
    //2a. create an arraylist variable
    ArrayList<String> alMovieList;
    //3a. create arrayadapter variable
    ArrayAdapter<String> aaMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1c. bind listview ui element to the java variable
        lvMovies = findViewById(R.id.listViewMovies);

        //2b. initialise the arraylist
        alMovieList = new ArrayList<>();

        //2c. add date into ArrayList
        alMovieList.add("Avengers Infinity War Release Date: 2018.04");
        alMovieList.add("Justice League Release Date: 2017.11");

        //3b. initialise arrayadapter and bind to arraylist
        aaMovies = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alMovieList);

        //4. bind listview to the arrayadapter
        lvMovies.setAdapter(aaMovies);
    }
}
