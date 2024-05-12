package com.infinitelearning.jkt48app.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Product: Screen("product")
    data object Profile: Screen("profile")
    data object Detail: Screen("detail_member")
}