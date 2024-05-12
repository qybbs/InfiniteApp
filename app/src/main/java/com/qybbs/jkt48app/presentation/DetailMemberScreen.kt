package com.qybbs.jkt48app.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.qybbs.jkt48app.data.DummyData
import com.qybbs.jkt48app.model.Member

@Composable
fun DetailMemberScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    membersId: Int?
) {
    val newMembersList = DummyData.jkt48member.filter { member ->
        member.id == membersId
    }
    Column(
        modifier = modifier
    ) {
        DetailMemberContent(newMembersList = newMembersList)
    }
}

@Composable
private fun DetailMemberContent(
    newMembersList: List<Member>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newMembersList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Member Photo"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newMembersList[0].nama,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newMembersList[0].panggilan})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Role : ${newMembersList[0].gen}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}
