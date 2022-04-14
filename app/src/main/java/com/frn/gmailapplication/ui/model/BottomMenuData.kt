package com.frn.gmailapplication.ui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val title:String,
    val icon:ImageVector
){

    object Mail:BottomMenuData("Mail" , icon = Icons.Outlined.Mail)
    object Meet:BottomMenuData("Meet" , icon = Icons.Outlined.VideoCall)


}
