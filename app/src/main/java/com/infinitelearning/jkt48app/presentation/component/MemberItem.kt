package com.infinitelearning.jkt48app.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.jkt48app.R
import com.infinitelearning.jkt48app.model.Member
import com.infinitelearning.jkt48app.ui.theme.AppTheme

@Composable
fun MemberItem(
    member: Member,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(member.id)
        }
    ) {
        Image(
            painter = painterResource(id = member.photo),
            contentDescription = member.nama, modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .size(140.dp), contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = member.nama,
            style = MaterialTheme.typography.titleSmall,
            textAlign = TextAlign.Center,
            maxLines = 1
        )
        Text(
            text = "Gen " + member.gen,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.bodySmall,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemHorizontalPreview() {
    AppTheme {
        MemberItem(
            member = Member(1, "Reza Kurniawan", "Reza", "Mobile", R.drawable.reza),
            onItemClicked = { mentorId ->
                println("Mentor Id : $mentorId")
            }
        )
    }
}