package org.o7planning.kt6_truong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<QuocGia> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new Adapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                QuocGia country = (QuocGia) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<QuocGia> getListData() {
        List<QuocGia> list = new ArrayList<QuocGia>();
        QuocGia vietnam = new QuocGia("Vietnam", "vn", 98000000);
        QuocGia usa = new QuocGia("United States", "us", 320000000);
        QuocGia russia = new QuocGia("Russia", "ru", 142000000);
        QuocGia switzerland = new QuocGia("Switzerland", "swit", 863700000);
        QuocGia usa2 = new QuocGia("United States", "us", 320000000);
        QuocGia switzerland2 = new QuocGia("Switzerland", "swit", 863700000);
        QuocGia vietnam2 = new QuocGia("Vietnam", "vn", 98000000);

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(switzerland);
        list.add(usa2);
        list.add(switzerland2);
        list.add(vietnam2);



        return list;
    }

}