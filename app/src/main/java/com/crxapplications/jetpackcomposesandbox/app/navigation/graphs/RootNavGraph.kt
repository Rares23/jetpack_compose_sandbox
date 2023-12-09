package com.crxapplications.jetpackcomposesandbox.app.navigation.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.crxapplications.jetpackcomposesandbox.app.navigation.Route
import com.crxapplications.jetpackcomposesandbox.flows.home.ui.page.HomePage

fun NavGraphBuilder.rootNavigationGraph(navController: NavController) {
    composable(route = Route.Home.route) {
        HomePage()
    }
}