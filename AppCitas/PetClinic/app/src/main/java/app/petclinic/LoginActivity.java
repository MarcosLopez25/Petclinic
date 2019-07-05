package app.petclinic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.btnLogin);
        final EditText user = findViewById(R.id.txtUser);
        final EditText password = findViewById(R.id.txtPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = user.getText().toString();
                String pin = password.getText().toString();

                Toast.makeText(LoginActivity.this, "Iniciando Sesión...", Toast.LENGTH_SHORT).show();
                user.setText("");
                password.setText("");

                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
