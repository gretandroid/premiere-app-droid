package education.cccp.basics;

import static android.widget.LinearLayout.VERTICAL;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout l;
    TextView t1;
    TextView t2;
    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        l = new LinearLayout(this);

        t1 = new TextView(this);
        t2 = new TextView(this);

        e1 = new EditText(this);
        e2 = new EditText(this);

        t1.setText("text 1");
        t2.setText("text 2");

        l.addView(t1);
        l.addView(t2);
        l.addView(e1);
        l.addView(e2);

        l.setOrientation(VERTICAL);

        setContentView(l);
    }
}