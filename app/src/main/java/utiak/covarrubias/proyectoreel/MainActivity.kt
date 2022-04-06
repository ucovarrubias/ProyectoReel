package utiak.covarrubias.proyectoreel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_ingresar)
        button.setOnClickListener{
            var intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
        val buttonR: Button=findViewById(R.id.btn_registrarse)
        buttonR.setOnClickListener{
            var intent: Intent = Intent(this, registrarse::class.java)
            startActivity(intent)
        }
        val buttonOU: Button=findViewById(R.id.btn_olvidarC)
        buttonR.setOnClickListener{
            var intent: Intent = Intent(this, recuperar_contrasenia::class.java)
            startActivity(intent)
        }
        val buttonOC: Button=findViewById(R.id.btn_olvidarU)
        buttonR.setOnClickListener{
            var intent: Intent = Intent(this, Usuario_Recuperar::class.java)
            startActivity(intent)
        }





    }
}