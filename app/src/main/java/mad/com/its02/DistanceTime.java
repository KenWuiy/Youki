package mad.com.its02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by aurora on 2017/11/8.
 */

public class DistanceTime extends AppCompatActivity {

    private TextView distance1_1;
    private TextView left_time1_1;
    private TextView distance2_1;
    private TextView left_time2_1;
    private TextView distance1_2;
    private TextView left_time1_2;
    private TextView distance2_2;
    private TextView left_time2_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distence_time);
        initView();


    }


    private void initView() {
        distance1_1 = (TextView) findViewById(R.id.distance1_1);
        left_time1_1 = (TextView) findViewById(R.id.left_time1_1);
        distance2_1 = (TextView) findViewById(R.id.distance2_1);
        left_time2_1 = (TextView) findViewById(R.id.left_time2_1);
        distance1_2 = (TextView) findViewById(R.id.distance1_2);
        left_time1_2 = (TextView) findViewById(R.id.left_time1_2);
        distance2_2 = (TextView) findViewById(R.id.distance2_2);
        left_time2_2 = (TextView) findViewById(R.id.left_time2_2);
    }


    public void click_query(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}

