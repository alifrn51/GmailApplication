package com.frn.gmailapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frn.gmailapplication.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState:ScrollState) {

    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderTow,
        DrawerMenuData.Calender,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Setting
    )

    Column(modifier = Modifier.verticalScroll(scrollState )) {
        Text(
            text = "Gmail",
            modifier = Modifier.padding(top = 20.dp, start = 16.dp , bottom = 20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )

        menuList.forEach { item ->
            when {
                item.isDivider -> {
                    Divider(modifier = Modifier.padding(bottom = 16.dp))
                }
                item.isHeader -> {
                    Text(
                        text = item.title.toString(),
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(20.dp)
                    )
                }
                else -> {
                    MailDrawerItem(item = item)

                }
            }
        }
    }
}

@Composable
fun MailDrawerItem(
    item: DrawerMenuData
) {

    Row(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
            .height(50.dp)
    ) {

        Image(
            imageVector = item.icon!!,
            contentDescription = item.title,
            modifier = Modifier
                .weight(0.5f)
        )

        Text(
            text = item.title!!,
            modifier = Modifier
                .weight(2.0f)
        )

    }

}