package com.crxapplications.jetpackcomposesandbox.app.navigation

import androidx.navigation.NamedNavArgument

sealed class Route(val route: String, val arguments: List<NamedNavArgument> = emptyList()) {
    object Root: Route(route = "root")
    object Home : Route(route = "home")
}