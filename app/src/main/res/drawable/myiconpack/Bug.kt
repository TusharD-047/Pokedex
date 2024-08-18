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

public val MyIconPack.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(342.198f, 0.501f)
                curveToRelative(0.373f, -0.532f, 1.105f, -0.661f, 1.637f, -0.289f)
                lineToRelative(36.354f, 25.456f)
                curveToRelative(0.532f, 0.372f, 0.661f, 1.105f, 0.289f, 1.637f)
                lineToRelative(-50.599f, 72.262f)
                curveToRelative(24.599f, 7.859f, 41.358f, 16.336f, 41.358f, 16.336f)
                reflectiveCurveToRelative(-40.964f, 70.462f, -110.443f, 70.462f)
                reflectiveCurveToRelative(-118.85f, -65.672f, -118.85f, -65.672f)
                reflectiveCurveToRelative(17.506f, -11.172f, 43.456f, -20.754f)
                lineToRelative(-55.5f, -66.142f)
                curveToRelative(-0.417f, -0.497f, -0.352f, -1.239f, 0.145f, -1.656f)
                lineToRelative(33.997f, -28.527f)
                curveToRelative(0.498f, -0.417f, 1.239f, -0.352f, 1.656f, 0.145f)
                lineToRelative(70.272f, 83.747f)
                curveToRelative(6.017f, -0.681f, 12.147f, -1.061f, 18.333f, -1.061f)
                curveToRelative(8.891f, 0.0f, 17.771f, 0.676f, 26.44f, 1.823f)
                close()
                moveTo(355.944f, 189.702f)
                curveToRelative(18.541f, -13.242f, 46.597f, -47.804f, 46.597f, -47.804f)
                reflectiveCurveToRelative(71.664f, 56.79f, 71.664f, 177.206f)
                curveToRelative(0.0f, 120.415f, -123.896f, 192.888f, -123.896f, 192.888f)
                reflectiveCurveToRelative(-59.195f, -59.781f, -73.727f, -135.562f)
                curveToRelative(-14.531f, -75.781f, 21.496f, -159.927f, 21.496f, -159.927f)
                reflectiveCurveToRelative(39.324f, -13.559f, 57.866f, -26.801f)
                close()
                moveTo(156.261f, 189.702f)
                curveToRelative(-18.541f, -13.242f, -46.597f, -47.804f, -46.597f, -47.804f)
                reflectiveCurveToRelative(-71.664f, 56.79f, -71.664f, 177.206f)
                curveToRelative(0.0f, 120.415f, 123.896f, 192.888f, 123.896f, 192.888f)
                reflectiveCurveToRelative(59.195f, -59.781f, 73.727f, -135.562f)
                curveToRelative(14.531f, -75.781f, -21.496f, -159.927f, -21.496f, -159.927f)
                reflectiveCurveToRelative(-39.324f, -13.559f, -57.866f, -26.801f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
