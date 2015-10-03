package com.example.wdidevashah.demo_svg;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.img);
        // Set the background color to white
        imageView.setBackgroundColor(Color.WHITE);
        // Parse the SVG file from the resource
        SVG svg = SVGParser.getSVGFromResource(getResources(), R.raw.plate_button_v30);
        imageView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        // Get a drawable from the parsed SVG and set it as the drawable for the ImageView
        imageView.setImageDrawable(svg.createPictureDrawable());
        // Set the ImageView as the content view for the Activity
        //setContentView(imageView);
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
