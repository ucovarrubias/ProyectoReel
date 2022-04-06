package utiak.covarrubias.proyectoreel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonOc: Button=findViewById(R.id.btn_olvidarC) as Button
        val button: Button = findViewById(R.id.btnlogin) as Button
        val buttonR: Button=findViewById(R.id.btnregistrarse) as Button
        val buttonOu: Button=findViewById(R.id.btn_olvidarU) as Button


        button.setOnClickListener{
            var intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        buttonR.setOnClickListener{
            var intent: Intent = Intent(this, registrarse::class.java)
            startActivity(intent)
        }


        buttonR.setOnClickListener{
            var intent: Intent = Intent(this, Contra_Recuperar::class.java)
            startActivity(intent)
        }

        buttonR.setOnClickListener{
            var intent: Intent = Intent(this, Usuario_Recuperar::class.java)
            startActivity(intent)
        }





    }
}