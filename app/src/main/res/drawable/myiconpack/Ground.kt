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

public val MyIconPack.Ground: ImageVector
    get() {
        if (_ground != null) {
            return _ground!!
        }
        _ground = Builder(name = "Ground", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(112.764f, 439.754f)
                curveTo(112.625f, 439.754f, 112.528f, 439.617f, 112.574f, 439.486f)
                lineTo(243.289f, 70.134f)
                curveTo(243.318f, 70.054f, 243.394f, 70.0f, 243.479f, 70.0f)
                horizontalLineTo(383.021f)
                curveTo(383.106f, 70.0f, 383.183f, 70.054f, 383.211f, 70.135f)
                lineTo(511.987f, 439.487f)
                curveTo(512.032f, 439.618f, 511.935f, 439.754f, 511.797f, 439.754f)
                horizontalLineTo(116.692f)
                horizontalLineTo(112.764f)
                close()
                moveTo(0.201f, 441.199f)
                curveTo(0.061f, 441.199f, -0.036f, 441.059f, 0.013f, 440.928f)
                lineTo(97.353f, 181.056f)
                curveTo(97.382f, 180.977f, 97.457f, 180.925f, 97.541f, 180.925f)
                horizontalLineTo(182.118f)
                curveTo(182.258f, 180.925f, 182.355f, 181.064f, 182.307f, 181.195f)
                lineTo(88.182f, 441.067f)
                curveTo(88.154f, 441.146f, 88.078f, 441.199f, 87.993f, 441.199f)
                horizontalLineTo(0.201f)
                close()
            }
        }
        .build()
        return _ground!!
    }

private var _ground: ImageVector? = null
