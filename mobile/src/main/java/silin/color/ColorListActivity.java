package silin.color;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import silin.color.object.Color;

public class ColorListActivity extends Activity implements ColorListFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_list);

        // Get the ColorListFragment class to start with
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                                .add(R.id.container, new ColorListFragment())
                                .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.color_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onColorItemSelected(int position) {
        // Toast the content for now
        Toast.makeText(this, Color.ITEMS.get(position).content, Toast.LENGTH_SHORT).show();
    }
}
