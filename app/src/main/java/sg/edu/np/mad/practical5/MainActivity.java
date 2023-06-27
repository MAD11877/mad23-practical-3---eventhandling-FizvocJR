package sg.edu.np.mad.practical5;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User("MAD", "Description", 00, false);

        TextView Name =  findViewById((R.id.Name));
        Name.setText(user.Name);

        Button followButton =  findViewById(R.id.Follow);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.Followed == true){
                    user.Followed = false;
                    followButton.setText("Follow");
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
                else {
                    user.Followed = true;
                    followButton.setText("Unfollow");
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
            }
        });




        Button messageButton =  findViewById(R.id.Message);

        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(intent1);
            }
        });

        Intent intent2 = getIntent();
        Integer number = intent2.getIntExtra("rNumber", -1);

        String text = user.Name + number;
        Name.setText(text);

    }
}