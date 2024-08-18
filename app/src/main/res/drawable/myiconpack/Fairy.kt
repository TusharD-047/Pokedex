package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.Fairy: ImageVector
    get() {
        if (_fairy != null) {
            return _fairy!!
        }
        _fairy = Builder(name = "Fairy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(102.726f, 405.978f)
                lineTo(184.848f, 382.166f)
                lineTo(255.778f, 511.857f)
                curveTo(255.871f, 512.025f, 256.112f, 512.025f, 256.204f, 511.857f)
                lineTo(327.134f, 382.166f)
                lineTo(409.257f, 405.978f)
                curveTo(409.441f, 406.031f, 409.612f, 405.86f, 409.557f, 405.676f)
                lineTo(385.741f, 325.179f)
                lineTo(511.856f, 256.204f)
                curveTo(512.025f, 256.112f, 512.025f, 255.871f, 511.857f, 255.779f)
                lineTo(384.702f, 186.235f)
                lineTo(409.557f, 102.225f)
                curveTo(409.612f, 102.041f, 409.441f, 101.87f, 409.257f, 101.923f)
                lineTo(325.208f, 126.294f)
                lineTo(256.204f, 0.126f)
                curveTo(256.112f, -0.042f, 255.871f, -0.042f, 255.779f, 0.126f)
                lineTo(186.775f, 126.294f)
                lineTo(102.726f, 101.923f)
                curveTo(102.542f, 101.87f, 102.371f, 102.041f, 102.426f, 102.225f)
                lineTo(127.281f, 186.235f)
                lineTo(0.126f, 255.779f)
                curveTo(-0.042f, 255.871f, -0.042f, 256.112f, 0.126f, 256.204f)
                lineTo(126.241f, 325.179f)
                lineTo(102.426f, 405.676f)
                curveTo(102.371f, 405.86f, 102.542f, 406.031f, 102.726f, 405.978f)
                close()
                moveTo(166.452f, 256.876f)
                lineTo(224.631f, 288.695f)
                lineTo(256.45f, 346.873f)
                curveTo(256.542f, 347.042f, 256.784f, 347.042f, 256.876f, 346.873f)
                lineTo(288.695f, 288.695f)
                lineTo(346.873f, 256.876f)
                curveTo(347.041f, 256.784f, 347.041f, 256.542f, 346.873f, 256.45f)
                lineTo(288.695f, 224.631f)
                lineTo(256.876f, 166.453f)
                curveTo(256.784f, 166.284f, 256.542f, 166.284f, 256.45f, 166.453f)
                lineTo(224.631f, 224.631f)
                lineTo(166.452f, 256.45f)
                curveTo(166.284f, 256.542f, 166.284f, 256.784f, 166.452f, 256.876f)
                close()
            }
        }
        .build()
        return _fairy!!
    }

private var _fairy: ImageVector? = null
