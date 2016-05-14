package appmobile.mistareas.mistareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout btn1;
    private EditText editText;

    Main2Activity ma = new  Main2Activity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (LinearLayout)findViewById(R.id.btn1);
        editText = (EditText)findViewById(R.id.editText);


        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String nom = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("nombre",nom);
                intent.setClass(v.getContext(),Main2Activity.class);
                startActivity(intent);
            }

        });
    }


}
