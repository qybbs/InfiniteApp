package com.qybbs.jkt48app.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.qybbs.jkt48app.data.DummyData
import com.qybbs.jkt48app.model.Product
import com.qybbs.jkt48app.navigation.Screen
import com.qybbs.jkt48app.presentation.component.ProductItem

@Composable
fun ProductScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    products: List<Product> = DummyData.jkt48product
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(products, key = { it.id }) {
            ProductItem(product = it) { productId ->
                navController.navigate(Screen.Detail.route + "product/$productId")
            }
        }
    }
}