package nyn.vm.nayan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
    EditText text;Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
         final Firebase ref = new Firebase("http://resplendent-fire-9132.firebaseio.com/data");
        text = (EditText) findViewById(R.id.text);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ref.setValue(text.getText().toString());
            }
        });

    }
}
