package fernanda.hernandez.calcedadfer

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // 1- mandar a llamar a todos los elementos
        val txtaño =  findViewById<EditText>(R.id.txtaño)
        val btnsum =  findViewById<Button>(R.id.btncalc)


        //creo objeto para mandar a llamar el objeto de la calcu

        val objCalculadora = calc()


        //programar
        btnsum.setOnClickListener {
            val result =  objCalculadora.sumar(txtaño.text.toString().toInt())

            Toast.makeText( this, "Su edad es $result", Toast.LENGTH_SHORT).show()



        }
}
}