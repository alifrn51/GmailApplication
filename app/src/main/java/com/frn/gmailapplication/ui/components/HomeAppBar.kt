package com.frn.gmailapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frn.gmailapplication.GmailApp
import com.frn.gmailapplication.R
import com.frn.gmailapplication.ui.theme.GmailApplicationTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(
    scaffoldState: ScaffoldState,
    scope: CoroutineScope
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 6.dp,
            modifier = Modifier.requiredHeight(50.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                IconButton(onClick = {

                    scope.launch {
                        scaffoldState.drawerState.open()
                    }

                }) {
                    Icon(Icons.Default.Menu, contentDescription = "Menu")
                }

                Text(
                    text = "Search in emails",
                    modifier = Modifier.weight(2.0f)
                )

                Image(
                    painter = painterResource(id = R.drawable.image_profile),
                    contentDescription = "ImageProfile",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray),

                    )


            }

        }
    }
}

@Preview
@Composable
fun DefaultPreview() {

    GmailApplicationTheme {
        GmailApp()
    }

}