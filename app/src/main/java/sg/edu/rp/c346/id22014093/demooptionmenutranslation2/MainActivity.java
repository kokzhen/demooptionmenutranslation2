package sg.edu.rp.c346.id22014093.demooptionmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvViewTranslatedText;
    String wordClicked="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvViewTranslatedText= findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvViewTranslatedText);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
            wordClicked ="hello";


        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");


    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(wordClicked.equalsIgnoreCase("hello")) {
            if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
                //code for action
                Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                tvViewTranslatedText.setText("Hello");
                return true; //menu item successfully handled
            } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
                //code for action
                tvViewTranslatedText.setText("Ciao");
                Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

                return true;  //menu item successfully handled
            }
        }
        return super.onContextItemSelected(item);
    }


}