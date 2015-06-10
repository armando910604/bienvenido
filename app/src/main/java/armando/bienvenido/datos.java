package armando.bienvenido;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class datos extends ActionBarActivity {
    Button Ingresar;
    String nombre;
    EditText nombreed, apellidop,apellidom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        Ingresar = (Button) findViewById (R.id.Ingresar);
        nombreed = (EditText) findViewById (R.id.nombre);
        apellidop = (EditText) findViewById (R.id.apellidop);
        apellidom = (EditText) findViewById (R.id.apellidom);
    }

    public void enviardatos(View v) {
                nombre ="Bienvenido " +nombreed.getText().toString()+ " " +(apellidop.getText().toString())+ " " +(apellidom.getText().toString());
                if (nombreed.getText().toString().length() >0 && apellidop.getText().toString().length()>0 && apellidom.getText().toString().length()>0)
                {
                    Intent intent = new Intent(getBaseContext(), mensaje.class);
                    Bundle bolsa = new Bundle();
                    bolsa.putString("NOMBRE", nombre);
                    intent.putExtras(bolsa);
                    startActivity(intent);
                }
                else {
                    Toast toast = Toast.makeText(this, "Llene todos los campos", Toast.LENGTH_SHORT);
                    toast.show();
                }
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_datos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
