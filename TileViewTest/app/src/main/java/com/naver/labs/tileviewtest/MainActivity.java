package com.naver.labs.tileviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qozix.tileview.TileView;
import com.qozix.tileview.plugins.CoordinatePlugin;

public class MainActivity extends AppCompatActivity {

    Button btnTileView;

    public static final double NORTH = -75.17261900652977;
    public static final double WEST = 39.9639998777094;
    public static final double SOUTH = -75.12462846235614;
    public static final double EAST = 39.93699709962642;

    private TileView tileView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tileView = (TileView) findViewById(R.id.tileview);
        TileView.Builder mapTile = new TileView.Builder(tileView);
        mapTile.setSize(1080, 856);
        mapTile.defineZoomLevel("tiles/4floor_%dx%d.png");
        //mapTile.installPlugin(new CoordinatePlugin(WEST, NORTH, EAST, SOUTH));
        mapTile.build();

    }

}
