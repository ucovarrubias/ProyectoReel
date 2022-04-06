package utiak.covarrubias.proyectoreel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.GridView

class Cartelera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartelera)

        val gridview: GridView = findViewById(R.id.gv_cartelera) as GridView
        //var adapter: PeliculaAdapter? = null

        //adapter = PeliculaAdapter(pelicula, this)
        //gridview.adapter = adapter
    }


}