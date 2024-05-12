package com.infinitelearning.infiniteapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.data.DummyData
import com.infinitelearning.infiniteapp.model.Product
import com.infinitelearning.infiniteapp.ui.theme.AppTheme

@Composable
fun ProductScreen(
    modifier: Modifier = Modifier
) {
    Column {
        Image(
            painter = painterResource(R.drawable.pasfoto_iqbal),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .padding(horizontal = 24.dp, vertical = 8.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Text(text = "Nama : Iqbal", modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp))
        Text(text = "Email : iqbal.gozy@gmail.com", modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp))
        Text(text = "Asal PT : Universitas Pembangunan Nasional \"Veteran\" Yogyakarta", modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp))
        Text(text = "Jurusan : Informatika", modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp))
    }
}
