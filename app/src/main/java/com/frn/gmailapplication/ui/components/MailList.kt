package com.frn.gmailapplication.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.frn.gmailapplication.ui.model.MailData
import com.frn.gmailapplication.ui.model.mailList

@Composable
fun MailList(
    scrollState: ScrollState
) {


    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .scrollable(scrollState , Orientation.Vertical),
            contentPadding =  PaddingValues(8.dp)
        ) {

            items(mailList) { mailData ->

                MailItem(mailData = mailData)

            }


        }
    }


}


@Composable
fun MailItem(
    modifier: Modifier = Modifier,
    mailData: MailData
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)

    ) {
        Card(
            modifier = modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape),
            backgroundColor = Color.Gray
        ) {

            Text(
                text = mailData.userName[0].uppercase(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                modifier = modifier
                    .fillMaxHeight()
                    .padding(4.dp),

                )

        }

        Column(
            modifier = modifier
                .weight(2.0f)
        ) {

            Text(
                text = mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = mailData.body,
                fontSize = 14.sp
            )

        }

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = mailData.timeStamp
            )

            IconButton(
                onClick = { },
                modifier = Modifier
                    .size(50.dp)
            ) {

                Icon(imageVector = Icons.Outlined.StarOutline, contentDescription = null)

            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun MailItemPreview() {


}