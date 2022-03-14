package education.cccp.basics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    LinearLayout l;
    TextView t1, t2;
    EditText e1, e2;
    CheckBox cb1, cb2;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2;
    Spinner spinner;
    ArrayAdapter adapter;
    String[] pays = {"france", "espagne", "italie"};

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

        radioButton1 = new RadioButton(this);
        radioButton1.setText("marié");

        radioButton2 = new RadioButton(this);
        radioButton2.setText("célibataire");

        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);


        t1.setText("text 1");
        t2.setText("text 2");

        cb1.setText("Français");
        cb2.setText("Anglais");

        spinner = new Spinner(this);
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                pays);

        spinner.setAdapter(adapter);

        l.addView(t1);
        l.addView(t2);
        l.addView(e1);
        l.addView(e2);
        l.addView(cb1);
        l.addView(cb2);
        l.addView(radioGroup);
        l.addView(spinner);

        l.setOrientation(LinearLayout.VERTICAL);
        setContentView(l);


    }
}