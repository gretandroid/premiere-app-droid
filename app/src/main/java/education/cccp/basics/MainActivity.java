package education.cccp.basics;

import static android.R.layout.simple_list_item_1;
import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.VERTICAL;
import static education.cccp.basics.R.drawable.pexels_pavel_danilyuk_8294792;
import static education.cccp.basics.R.string.anglais;
import static education.cccp.basics.R.string.célibataire;
import static education.cccp.basics.R.string.français;
import static education.cccp.basics.R.string.marié;
import static education.cccp.basics.R.string.text1;
import static education.cccp.basics.R.string.text2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
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
    ImageView imageView;


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
        radioGroup.setOrientation(HORIZONTAL);

        radioButton1 = new RadioButton(this);
        radioButton1.setText(marié);

        radioButton2 = new RadioButton(this);
        radioButton2.setText(célibataire);

        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);

        imageView = new ImageView(this);
        imageView.setImageResource(
                pexels_pavel_danilyuk_8294792);

        t1.setText(text1);
        t2.setText(text2);

        cb1.setText(français);
        cb2.setText(anglais);

        spinner = new Spinner(this);
        adapter = new ArrayAdapter(this,
                simple_list_item_1,
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
        l.addView(imageView);

        l.setOrientation(VERTICAL);
        setContentView(l);


    }
}