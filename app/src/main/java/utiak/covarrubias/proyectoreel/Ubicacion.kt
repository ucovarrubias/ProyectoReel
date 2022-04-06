package utiak.covarrubias.proyectoreel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ubicacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion)

        val button: Button = findViewById(R.id.btn_ubicacion)
        button.setOnClickListener{
            var intent: Intent = Intent(this, Ubicacion2::class.java)
            startActivity(intent)
        }

    }
}