package com.example.w.myapplication6;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final static String NAME = "name";
    private final static String CLASS = "class";
    private final static String SEX = "sex";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = {"小一", "小二", "小三"};
        String[] classes = {"软工一班", "软工二班", "软工三班"};
        String[] sexes = {"男", "女", "男"};

        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put(NAME, names[i]);
            item.put(CLASS, classes[i]);
            item.put(SEX, sexes[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, items, R.layout.item, new String[]{NAME, CLASS, SEX}, new int[]{R.id.textName, R.id.textClass, R.id.textSex});

        ListView list = (ListView) findViewById(R.id.list);

        list.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
