package rrdl.androidexercice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.oc.rss.fake.FakeNews;
import com.oc.rss.fake.FakeNewsList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("FakeNews");
        RecyclerView rv;
        rv=(RecyclerView)findViewById(R.id.recyclerview);
        rv.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter=new RecyclerAdapter();
        rv.setAdapter(adapter);

    }
}
