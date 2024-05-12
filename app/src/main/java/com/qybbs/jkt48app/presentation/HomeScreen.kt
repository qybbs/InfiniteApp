package com.qybbs.jkt48app.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.qybbs.jkt48app.data.DummyData
import com.qybbs.jkt48app.model.News
import com.qybbs.jkt48app.model.Member
import com.qybbs.jkt48app.navigation.Screen
import com.qybbs.jkt48app.presentation.component.NewsItem
import com.qybbs.jkt48app.presentation.component.MemberItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    mentors: List<Member> = DummyData.jkt48member,
    mentees: List<News> = DummyData.jkt48news,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        item { 
            Text(text = "Members", modifier = Modifier.padding(horizontal = 16.dp))
        }
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = modifier
            ) {
                items(mentors, key = { it.id }) {
                    MemberItem(member = it) { memberId ->
                        navController.navigate(Screen.Detail.route + "member/$memberId")
                    }
                }
            }
        }
        item {
            Text(text = "News", modifier = Modifier.padding(horizontal = 16.dp))
        }
        items(mentees, key = { it.id }) {
            NewsItem(news = it, modifier = Modifier.padding(horizontal = 16.dp)) { newsId ->
                navController.navigate(Screen.Detail.route + "news/$newsId")
            }
        }
    }
}