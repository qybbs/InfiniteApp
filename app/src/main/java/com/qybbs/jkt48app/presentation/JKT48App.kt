package com.qybbs.jkt48app.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.qybbs.jkt48app.R
import com.qybbs.jkt48app.navigation.NavigationItem
import com.qybbs.jkt48app.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JKT48App(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val title = when(currentRoute) {
        "home" -> "Home"
        "product" -> "Product"
        "profile" -> "Profile"
        else -> "Detail Info"
    }

    Scaffold(
        topBar = {
            if (title == "Detail Info") {
                TopAppBar(
                    title = { Text(title) },
                    navigationIcon = {
                        IconButton(onClick = {
                            navController.navigateUp()
                        }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Back",
                            )
                        }
                    }
                )
            } else {
                TopAppBar(
                    title = { Text(title) }
                )
            }
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.Product.route) {
                ProductScreen(navController)
            }

            composable(Screen.Profile.route) {
                ProfileScreen()
            }

            composable(
                Screen.Detail.route + "member/{memberId}",
                arguments = listOf(navArgument("memberId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailMemberScreen(
                    navController = navController,
                    membersId = navBackStackEntry.arguments?.getInt("memberId")
                )
            }

            composable(
                Screen.Detail.route + "news/{newsId}",
                arguments = listOf(navArgument("newsId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailNewsScreen(
                    navController = navController,
                    newsId = navBackStackEntry.arguments?.getInt("newsId")
                )
            }

            composable(
                Screen.Detail.route + "product/{productId}",
                arguments = listOf(navArgument("productId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailProductScreen(
                    navController = navController,
                    productId = navBackStackEntry.arguments?.getInt("productId")
                )
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_gallery),
                icon = Icons.Default.ShoppingCart,
                screen = Screen.Product
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_course),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Profile
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JKT48AppPrev() {
    JKT48App()
}