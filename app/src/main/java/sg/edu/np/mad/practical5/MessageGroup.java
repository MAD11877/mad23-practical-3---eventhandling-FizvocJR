package sg.edu.np.mad.practical5;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Button grp1 = findViewById(R.id.group1);
        Button grp2 = findViewById(R.id.group2);

        grp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
                fragment.replace(R.id.frame, new fragment());
                fragment.commit();
            }
        });

        grp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
                fragment.replace(R.id.frame, new fragment2());
                fragment.commit();
            }
        });


    }
}