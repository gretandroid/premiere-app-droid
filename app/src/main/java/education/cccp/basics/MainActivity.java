package education.cccp.basics;

import static android.widget.LinearLayout.VERTICAL;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout l;
    TextView t1, t2;
    EditText e1, e2;
    CheckBox cb1, cb2;
    RadioGroup radioGroup;
    RadioButton button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        l = new LinearLayout(this);

        t1 = new TextView(this);
        t2 = new TextView(this);

        e1 = new EditText(this);
        e2 = new EditText(this);

        cb1 = new CheckBox(this);
        cb2 = new CheckBox(this);

        radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(LinearLayout.HORIZONTAL);

        button1 = new RadioButton(this);
        button1.setText("marié");

        button2 = new RadioButton(this);
        button2.setText("célibataire");

        radioGroup.addView(button1);
        radioGroup.addView(button2);


        t1.setText("text 1");
        t2.setText("text 2");

        cb1.setText("Français");
        cb2.setText("Anglais");

        l.addView(t1);
        l.addView(t2);
        l.addView(e1);
        l.addView(e2);
        l.addView(cb1);
        l.addView(cb2);
        l.addView(radioGroup);

        l.setOrientation(VERTICAL);
        setContentView(l);











    }
}