package com.example.itcc41_final_about_me_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.itcc41_final_about_me_app.ui.theme.Itcc41finalaboutmeappTheme

fun View.enablePointerOnHover() {
    this.setOnHoverListener { v, event ->
        when (event.action) {
            android.view.MotionEvent.ACTION_HOVER_ENTER -> {
                v.alpha = 0.7f // Change appearance on hover
            }
            android.view.MotionEvent.ACTION_HOVER_EXIT -> {
                v.alpha = 1.0f // Revert appearance when not hovering
            }
        }
        false
    }
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ////////////////////////////

        // Getting references to UI components
        val nameKate = findViewById<TextView>(R.id.name_kate)
        val descKate = findViewById<LinearLayout>(R.id.desc_kate)
        val btnKate = findViewById<Button>(R.id.btn_kate_gthb)

        // Setting the toggling functionality
        nameKate.setOnClickListener {
            if (descKate.visibility == View.GONE) {
                descKate.visibility = View.VISIBLE
            } else {
                descKate.visibility = View.GONE
            }
        }

        ////////////////////////////

        // Getting references to UI components for Ydrick
        val nameYdrick = findViewById<TextView>(R.id.name_ydrick)
        val descYdrick = findViewById<LinearLayout>(R.id.desc_ydrick)
        val btnYdrick = findViewById<Button>(R.id.btn_ydrick_gthb)

        // Setting the toggling functionality
        nameYdrick.setOnClickListener {
            if (descYdrick.visibility == View.GONE) {
                descYdrick.visibility = View.VISIBLE
            } else {
                descYdrick.visibility = View.GONE
            }
        }

        btnYdrick.setOnClickListener {
            val url = "https://github.com/YdrickAsuelo" // Replace with actual URL
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        ///////////////////////////

        // Setting the button click functionality to open Github page
        btnKate.setOnClickListener {
            val url = "https://github.com/kateAlmonte" // Replace with actual URL
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)

//        setContent {
//            Itcc41finalaboutmeappTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
        //////////////////////

        // Getting references to UI components for Ydrick
        val nameSai = findViewById<TextView>(R.id.name_sai)
        val descSai = findViewById<LinearLayout>(R.id.desc_sai)
        val btnSai = findViewById<Button>(R.id.btn_3_gthb_sai)

        // Setting the toggling functionality
        nameSai.setOnClickListener {
            if (descSai.visibility == View.GONE) {
                descSai.visibility = View.VISIBLE
            } else {
                descSai.visibility = View.GONE
            }
        }

        btnSai.setOnClickListener {
            val url = "https://github.com/SaiBacalso" // Replace with actual URL
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        //////////////////////

        // Getting references to UI components for Ethan
        val nameEthan = findViewById<TextView>(R.id.name_ethan)
        val descEthan = findViewById<LinearLayout>(R.id.desc_ethan)
        val btnEthan = findViewById<Button>(R.id.btn_4_gthb_ethan)

        // Setting the toggling functionality
        nameEthan.setOnClickListener {
            if (descEthan.visibility == View.GONE) {
                descEthan.visibility = View.VISIBLE
            } else {
                descEthan.visibility = View.GONE
            }
        }

        btnEthan.setOnClickListener {
            val url = "https://github.com/EthanDale26" // Replace with actual URL
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        ///////////////////////

        // Getting references to UI components for Sandy
        val nameSandy = findViewById<TextView>(R.id.name_5_sandy)
        val descSandy = findViewById<LinearLayout>(R.id.desc_sandy)
        val btnSandy = findViewById<Button>(R.id.btn_5_gthb_sandy)

        // Setting the toggling functionality
        nameSandy.setOnClickListener {
            if (descSandy.visibility == View.GONE) {
                descSandy.visibility = View.VISIBLE
            } else {
                descSandy.visibility = View.GONE
            }
        }

        btnSandy.setOnClickListener {
            val url = "https://github.com/SandyLMCD" // Replace with actual URL
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Itcc41finalaboutmeappTheme {
        Greeting("Android")
    }
}}