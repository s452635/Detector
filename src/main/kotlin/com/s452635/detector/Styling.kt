package com.s452635.detector

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

enum class ButtonPosition
{
    Lonely, Center, Right, Left
}

enum class ButtonSize
{
    Biggie, Tiny
}

object MyColors
{
    val Primary = Color( 252, 152, 3 )
    val DisabledMain = Color( 143, 143, 143 )
    val DisabledBack = Color( 207, 207, 207 )
}

object MyShapes
{
    private val cornerBend = 10.dp
    val Even = RectangleShape
    val Uneven = RoundedCornerShape( cornerBend )
    val UnevenLeft = RoundedCornerShape( cornerBend, 0.dp, 0.dp, cornerBend )
    val UnevenRight = RoundedCornerShape( 0.dp, cornerBend, cornerBend, 0.dp )
}