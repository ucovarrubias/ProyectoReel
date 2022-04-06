package utiak.covarrubias.proyectoreel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.btnlogin) as Button
        val buttonR: Button=findViewById(R.id.btnregistrarse) as Button
        val buttonOusuario: Button=findViewById(R.id.btn_olvidarU) as Button
        val buttonOcontra: Button=findViewById(R.id.btn_olvidarC) as Button

        button.setOnClickListener{
            var intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        buttonR.setOnClickListener{
            var intent: Intent = Intent(this, registrarse::class.java)
            startActivity(intent)
        }


        buttonOusuario.setOnClickListener{
            var intent: Intent = Intent(this, Usuario_Recuperar::class.java)
            startActivity(intent)
        }

        buttonOcontra.setOnClickListener{
            var intent: Intent = Intent(this, Contra_Recuperar::class.java)
            startActivity(intent)
        }





    }
}