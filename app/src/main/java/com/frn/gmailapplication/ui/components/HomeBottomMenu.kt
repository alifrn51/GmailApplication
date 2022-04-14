package com.frn.gmailapplication.ui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.frn.gmailapplication.ui.model.BottomMenuData

@Composable
fun HomeBottomMenu() {

    var selectedItem by remember {
        mutableStateOf(0)
    }

    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black,
    ) {

        items.forEach {
            BottomNavigationItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(imageVector = it.icon, contentDescription = it.title)
                },
                label = {
                        Text(text = it.title)
                },
                alwaysShowLabel = true,
            )
        }

    }

}