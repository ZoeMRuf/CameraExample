package com.example.cameraexample.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cameraexample.ui.theme.DarkSlateGrey
import com.example.cameraexample.ui.theme.Mindaro
import com.example.cameraexample.ui.theme.MintCream

@Composable
fun RoundIconButton(onButtonClick: () -> Unit, iconResource: Int){
    IconButton(
        onClick = {
            onButtonClick()
        },
        modifier = Modifier
            .border(
                3.dp,
                Brush.linearGradient(colors = listOf(MintCream, DarkSlateGrey)),
                RoundedCornerShape(50)
            )
            .clip(RoundedCornerShape(50))
            .background(Mindaro)
            .size(100.dp)
            .padding(5.dp),
    ) {
        Icon(
            painter = painterResource(id = iconResource),
            contentDescription = null,
            modifier = Modifier.size(70.dp),
            tint = Color.Unspecified
        )
    }
}