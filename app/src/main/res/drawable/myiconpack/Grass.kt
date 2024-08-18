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

public val MyIconPack.Grass: ImageVector
    get() {
        if (_grass != null) {
            return _grass!!
        }
        _grass = Builder(name = "Grass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(97.412f, 440.649f)
                curveToRelative(-1.757f, -1.653f, -3.495f, -3.338f, -5.213f, -5.056f)
                curveToRelative(-90.685f, -90.684f, -90.685f, -237.713f, 0.0f, -328.397f)
                curveToRelative(90.684f, -90.685f, 379.64f, -96.752f, 379.64f, -96.752f)
                reflectiveCurveToRelative(39.442f, 334.465f, -51.242f, 425.149f)
                curveToRelative(-80.54f, 80.54f, -205.522f, 89.55f, -296.005f, 27.031f)
                lineToRelative(72.908f, -89.471f)
                lineToRelative(116.55f, -25.163f)
                lineToRelative(-95.139f, -9.511f)
                lineToRelative(60.462f, -61.562f)
                lineToRelative(68.824f, -15.077f)
                lineToRelative(-54.422f, -16.117f)
                lineToRelative(54.422f, -98.176f)
                lineToRelative(-77.41f, 86.828f)
                lineToRelative(-29.893f, -42.183f)
                lineToRelative(10.523f, 69.648f)
                lineToRelative(-53.917f, 60.782f)
                lineToRelative(-24.993f, -76.9f)
                verticalLineToRelative(102.268f)
                close()
            }
        }
        .build()
        return _grass!!
    }

private var _grass: ImageVector? = null
