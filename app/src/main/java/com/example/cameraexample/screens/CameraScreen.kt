package com.example.cameraexample.screens

import android.net.Uri
import android.util.Log
import androidx.compose.animation.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cameraexample.camera.captureImageFromCamera
import com.example.cameraexample.composables.RoundIconButton
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.example.cameraexample.R
import java.util.*

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CameraScreen(){
    var uri by remember{
        mutableStateOf(Uri.EMPTY)
    }

    var pictureCaptured by remember {
        mutableStateOf(false)
    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ){

        Button(onClick = {pictureCaptured = true}) {
            if (pictureCaptured){
                uri = captureImageFromCamera()
                pictureCaptured = !pictureCaptured
            }
        }

        /*
        AnimatedContent(
            targetState = pictureCaptured,
            content = { targetState ->
                if(!targetState){
                    uri = captureImageFromCamera()
                    if (uri.path?.isNotEmpty() == true) {
                        /* TODO: Show Image or Not?
                        Image(
                            modifier = Modifier.padding(16.dp, 8.dp),
                            painter = rememberImagePainter(uri),
                            contentDescription = null
                        )
                         */
                        pictureCaptured = !pictureCaptured // Switch to Scan Button
                    }
                }
                else {
                    RoundIconButton(
                        onButtonClick = {
                            Log.i("Info:", "Now Scan the Image")
                            pictureCaptured = !pictureCaptured
                            //TODO: Navigate to Scan Screen with URI in Route
                        },
                        iconResource = R.drawable.scan
                    )
                }
            },
            transitionSpec = {
                fadeIn(
                    animationSpec = tween(2000, 500, FastOutSlowInEasing)
                ) with fadeOut(
                    animationSpec = tween(2000, 500, FastOutSlowInEasing)
                )
            }
        )
        */



    }
}