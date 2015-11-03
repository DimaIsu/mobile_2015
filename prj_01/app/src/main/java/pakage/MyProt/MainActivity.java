package pakage.MyProt;

import android.content.Intent;
import android.support.annotation.IntRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pole, k;
    Integer buf1, buf2;
    String buf3;
    boolean g=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pole = (EditText) findViewById(R.id.pole);
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void clic1(View t){
        int m;
        if(g)
        m= Integer.parseInt(pole.getText().toString());
        else
        m=0;

        Integer res=0;
        switch (t.getId()){
            case R.id.button1: res=m*10+1; pole.setText(res.toString()); g=true; break;
            case R.id.button2: res=m*10+2; pole.setText(res.toString()); g=true; break;
            case R.id.button3: res=m*10+3; pole.setText(res.toString()); g=true; break;
            case R.id.button4: res=m*10+4; pole.setText(res.toString()); g=true; break;
            case R.id.button5: res=m*10+5; pole.setText(res.toString()); g=true; break;
            case R.id.button6: res=m*10+6; pole.setText(res.toString()); g=true; break;
            case R.id.button7: res=m*10+7; pole.setText(res.toString()); g=true; break;
            case R.id.button8: res=m*10+8; pole.setText(res.toString()); g=true; break;
            case R.id.button9: res=m*10+9; pole.setText(res.toString()); g=true; break;
            case R.id.button0: res=m*10; pole.setText(res.toString()); g=true; break;
        }


    }

    public void clicdey(View t){
        buf1=Integer.parseInt(pole.getText().toString()); g=false;
        switch (t.getId()){
            case R.id.button13: buf3="/"; break;
            case R.id.button14: buf3="*"; break;
            case R.id.button15: buf3="-"; break;
            case R.id.button16: buf3="+"; break;
        }
    }

    public void clicres(View t){
        double res;
        buf2=Integer.parseInt(pole.getText().toString()); g=false;
        switch (buf3){
            case "/": res=1.*buf1/buf2; pole.setText(""+res); break;
            case "*": res=buf1*buf2; pole.setText(""+res); break;
            case "+": res=buf1+buf2; pole.setText(""+res); break;
            case "-": res=buf1-buf2; pole.setText(""+res); break;
        }
    }

    public void clicdr(View t){
        pole.setText("");
        g=false;
    }


    public void clicper(View t){
        Intent intent = new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }
}
