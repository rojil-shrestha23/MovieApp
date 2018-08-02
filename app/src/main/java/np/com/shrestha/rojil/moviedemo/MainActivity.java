package np.com.shrestha.rojil.moviedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMoviesLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMoviesLists = findViewById(R.id.rv_example_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        rvMoviesLists.setLayoutManager(linearLayoutManager);
        rvMoviesLists.setAdapter(new MovieListingAdapter(getMovieList()));
    }
}
