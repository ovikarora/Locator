package com.a16mb.gpslocator.gpslocator;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sub_emp(View view)
    {
        EditText text1=(EditText) findViewById(R.id.editText);
        String Id=text1.getText().toString();
        EditText text2=(EditText) findViewById(R.id.editText2);
        String pass=text2.getText().toString();
        if((Id.equals("1")&&pass.equals("1510991550"))||(Id.equals("2")&&pass.equals("1510991546"))||(Id.equals("3")&&pass.equals("1510991532"))||(Id.equals("4")&&pass.equals("1510991534"))||(Id.equals("5")&&pass.equals("1510991546"))||(Id.equals("6")&&pass.equals("1510991550")))
        {
            Intent intent = new Intent(getBaseContext(), Employee_Page.class);
            intent.putExtra("id", Id);
            startActivity(intent);
            Toast.makeText(this, "You are Employee", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Invaid Login ID or Password", Toast.LENGTH_SHORT).show();
        }

    }
}
