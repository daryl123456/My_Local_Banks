package sg.edu.rp.c346.id19042545.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDbs,tvOcbc,tvUob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDbs= findViewById(R.id.textViewDbs);
        tvOcbc= findViewById(R.id.textViewOcbc);
        tvUob= findViewById(R.id.textViewUob);
        registerForContextMenu(tvDbs);
        registerForContextMenu(tvOcbc);
        registerForContextMenu(tvUob);

    }
    public void onCreateContextMenu(ContextMenu menu, View v,
                                      ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId() ==R.id.textViewDbs){
            menu.add(0,0,0,getString(R.string.web));
            menu.add(0,1,1,getString(R.string.contact));
        }else if(v.getId() ==R.id.textViewOcbc){
            menu.add(0,2,0,getString(R.string.web));
            menu.add(0,3,1,getString(R.string.contact));
        }else if(v.getId() ==R.id.textViewUob){
            menu.add(0,4,0,getString(R.string.web));
            menu.add(0,5,1,getString(R.string.contact));
        }

    }




    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse(getString(R.string.urlDbs)));
            startActivity(intent);
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check if the selected menu item ID is 1
            //code for action
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getString(R.string.numDbs)));
            startActivity(intentCall);
            return true; //menu item successfully handled
        }else if(item.getItemId()==2) { //check if the selected menu item ID is 1
            //code for action
            Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse(getString(R.string.urlOcbc)));
            startActivity(intent);

            return true;  //menu item successfully handled
        }else if(item.getItemId()==3) { //check if the selected menu item ID is 1
            //code for action
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getString(R.string.numOcbc)));
            startActivity(intentCall);

            return true;  //menu item successfully handled
        }else if(item.getItemId()==4) { //check if the selected menu item ID is 1
            //code for action
            Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse(getString(R.string.urlUob)));
            startActivity(intent);

            return true;  //menu item successfully handled
        }else if(item.getItemId()==5) { //check if the selected menu item ID is 1
            //code for action
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+getString(R.string.numUob)));
            startActivity(intentCall);

            return true;  //menu item successfully handled
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.EnglishSelection){
            tvDbs.setText(getString(R.string.engDbs));
            tvOcbc.setText(getString(R.string.engOcbc));
            tvUob.setText(getString(R.string.engUob));

            return true;
        }
        else if(item.getItemId()==R.id.ChineseSelection) {
            tvDbs.setText(getString(R.string.chiDbs));
            tvOcbc.setText(getString(R.string.chiOcbc));
            tvUob.setText(getString(R.string.chiUob));

            return true;  //menu item successfully handled
        }

        return super.onContextItemSelected(item);
    }

}
