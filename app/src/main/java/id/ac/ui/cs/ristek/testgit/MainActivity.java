package id.ac.ui.cs.ristek.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.ac.ui.cs.ristek.testgit.adapter.PixabayAdapter;
import id.ac.ui.cs.ristek.testgit.model.Pixabay;

public class MainActivity extends AppCompatActivity {
    RecyclerView RV  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RV = (RecyclerView) findViewById(R.id.rv);

        ArrayList<Pixabay> pixabays = new ArrayList<>();

        pixabays.add(new Pixabay("https://cdn.pixabay.com/photo/2017/03/17/16/27/shell-2152029_960_720.jpg", "Telur Paskah"));
        pixabays.add(new Pixabay("https://cdn.pixabay.com/photo/2015/04/08/13/12/food-712662_960_720.jpg", "Makanan Spanyol"));
        pixabays.add(new Pixabay("https://cdn.pixabay.com/photo/2015/01/31/14/40/peanuts-618547_960_720.jpg", "Kacang"));

        PixabayAdapter pixabayAdapter = new PixabayAdapter(this, pixabays);

        RV.setLayoutManager(new LinearLayoutManager(this));
        RV.setAdapter(pixabayAdapter);
    }
}
