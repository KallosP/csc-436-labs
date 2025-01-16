package com.zybooks.pizzaparty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.zybooks.pizzaparty.ui.PizzaPartyScreen
import com.zybooks.pizzaparty.ui.theme.PizzaPartyTheme

// NOTE: On configuration changes, the app's UI stays
//       the same/doesn't change. This is enabled by
//       the ViewModel which persists on config changes
//       (which necessarily causes the UI to remain unchanged).

// NOTE: Good practice for MainActivity not to access
//       the ViewModels or businesss logic directly
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PizzaPartyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PizzaPartyScreen()
                }
            }
        }
    }
}