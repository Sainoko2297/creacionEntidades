package mx.ipn.upiicsa.clases

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.ipn.upiicsa.clases.entidades.genero
import mx.ipn.upiicsa.clases.entidades.persona
import mx.ipn.upiicsa.clases.entidades.entidadesTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            entidadesTheme {

                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    var persona : Persona = Persona(1,"A","B","C", LocalDate.now())
    var generoA : Genero = Genero(1,"M")
    var generoB : Genero = Genero(2,"F", true)
}