package com.frn.gmailapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frn.gmailapplication.ui.components.*
import com.frn.gmailapplication.ui.theme.GmailApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val scrollStateMail = rememberScrollState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, coroutineScope) },
        drawerContent = {
            GmailDrawerMenu(scrollState)
        },
        bottomBar = { HomeBottomMenu() },
        floatingActionButton = {
            GmailFab(scrollState = scrollStateMail)
        }
    ) {

        MailList(scrollState = scrollStateMail)

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailApplicationTheme {
        GmailApp()
    }
}