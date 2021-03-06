package lazycoder21.droid.fontawesome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import lazycoder21.droid.compose.FaIconType
import lazycoder21.droid.compose.FaIcons
import lazycoder21.droid.compose.FontAwesomeIcon
import lazycoder21.droid.fontawesome.ui.theme.FontAwesomeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FontAwesomeComposeTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FontAwesomeComposeTheme {
        Greeting("Android")
    }
}