package lopez.francisco.sumasenjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1 = (EditText)findViewById(R.id.edNum1);
        final EditText num2 = (EditText) findViewById(R.id.edNum2);
        Button btnsumar = (Button)findViewById(R.id.btnSumar);



        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.getText().toString().equals("") &&
                        num2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "Ingresa 2 valores", Toast.LENGTH_SHORT).show();
                } else {

                    Float valor1 = Float.parseFloat(num1.getText().toString());
                    Float valor2 = Float.parseFloat(num2.getText().toString());

                    Float resultado = valor1 + valor2;
                    Toast.makeText(getApplicationContext(),
                            "El resultado es "+resultado, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
