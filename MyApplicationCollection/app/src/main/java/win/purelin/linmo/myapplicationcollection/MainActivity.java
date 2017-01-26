package win.purelin.linmo.myapplicationcollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v) {
        switch (v.getId()) {
            case R.id.project1:
                Toast.makeText(this, "This is my Toast message for Project1!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.project2:
                Toast.makeText(this, "This is my Toast message for Project2!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.project3:
                Toast.makeText(this, "This is my Toast message for Project3!",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
