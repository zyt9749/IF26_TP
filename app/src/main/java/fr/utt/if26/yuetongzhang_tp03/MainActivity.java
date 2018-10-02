package fr.utt.if26.yuetongzhang_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    private String message ="Bonjour IF26!";
    private TextView tx;
    @Override
    /**this is a comment
     * @param 
     * @author yuetong
     */
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
             tx = (TextView)findViewById(R.id.textview);
            tx.setText(getText(R.string.message));
            Button bt = (Button) findViewById(R.id.clic);
            bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { tx.setBackgroundColor(Color.RED);
            } });
        }
}
