package com.frn.gmailapplication.ui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {

    object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All inboxes"
    )

    object Primary: DrawerMenuData(
        icon = Icons.Outlined.StayPrimaryLandscape,
        title = "Primary"
    )

    object Social: DrawerMenuData(
        icon = Icons.Outlined.SocialDistance,
        title = "Social"
    )

    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.Approval,
        title = "Promotions"
    )

    object Starred: DrawerMenuData(
        icon = Icons.Outlined.StarRate,
        title = "Starred"
    )

    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )

    object Important: DrawerMenuData(
        icon = Icons.Outlined.ImportantDevices,
        title = "Important"
    )

    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )

    object Schedule: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Schedule"
    )

    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )
    object Draft: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )

    object AllMail: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All mail"
    )

    object Calender: DrawerMenuData(
        icon = Icons.Outlined.PermContactCalendar,
        title = "Calender"
    )
    object Contacts: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )
    object Setting: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & feedback"
    )

    object Divider: DrawerMenuData(
        isDivider = true
    )

    object HeaderOne: DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )

    object HeaderTow: DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )
}
