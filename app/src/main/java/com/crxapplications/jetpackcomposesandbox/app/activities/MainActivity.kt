package com.crxapplications.jetpackcomposesandbox.app.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.crxapplications.jetpackcomposesandbox.app.navigation.Route
import com.crxapplications.jetpackcomposesandbox.app.navigation.graphs.rootNavigationGraph
import com.crxapplications.jetpackcomposesandbox.app.ui.theme.JetpackComposeSandboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeSandboxTheme {
                val navController: NavHostController = rememberNavController()

                NavHost(
                    navController = navController,
                    route = Route.Root.route,
                    startDestination = Route.Home.route
                ) {
                    rootNavigationGraph(navController = navController)
                }
            }
        }
    }
}