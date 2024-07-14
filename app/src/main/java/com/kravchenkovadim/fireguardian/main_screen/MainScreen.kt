package com.kravchenkovadim.fireguardian.main_screen

import android.annotation.SuppressLint
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.kravchenkovadim.fireguardian.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {

        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add"
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {

    }
}