package np.com.shrestha.rojil.moviedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMoviesLists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_listing);
        rvMoviesLists = findViewById(R.id.rv_example_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        rvMoviesLists.setLayoutManager(linearLayoutManager);
        rvMoviesLists.setAdapter(new MovieListingAdapter(getMovieList()));
    }

    public ArrayList<MovieListingDetail> getMovieList() {
        ArrayList<MovieListingDetail> movieList = new ArrayList<>();
        movieList.add(new MovieListingDetail("sultan","action","13th august",R.drawable.ic_launcher_background));
        movieList.add(new MovieListingDetail());
        return movieList;
    }
}
