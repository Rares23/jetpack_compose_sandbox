package com.crxapplications.jetpackcomposesandbox.flows.home.ui.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomePage() {
    Scaffold { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Text("Home Page")
        }
    }
}