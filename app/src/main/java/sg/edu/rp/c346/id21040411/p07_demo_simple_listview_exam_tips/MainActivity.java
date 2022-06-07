package sg.edu.rp.c346.id21040411.p07_demo_simple_listview_exam_tips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] examTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        examTips = new String[5];
        examTips[0] = "Don't just read the code, code it as much as possible during each practical session";
        examTips[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examTips[2] = "Prepare your template source code for each topic";
        examTips[3] = "Create a few empty Android projects to speed up your coding during the exam";
        examTips[4] = "Ensure that your Android Studio is up and running before the exam";

        lvExamTips = findViewById(R.id.lvExamTips);

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, examTips);

        lvExamTips.setAdapter(adapter);
    }
}