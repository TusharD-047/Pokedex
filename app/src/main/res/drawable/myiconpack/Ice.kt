package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.Ice: ImageVector
    get() {
        if (_ice != null) {
            return _ice!!
        }
        _ice = Builder(name = "Ice", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(384.304f, 39.042f)
                lineTo(385.879f, 177.392f)
                lineTo(265.209f, 235.319f)
                lineTo(263.721f, 104.69f)
                lineTo(384.304f, 39.042f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(505.269f, 257.047f)
                lineTo(385.814f, 325.374f)
                lineTo(266.288f, 256.939f)
                lineTo(385.752f, 194.187f)
                lineTo(505.269f, 257.047f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(245.04f, 257.047f)
                lineTo(125.585f, 325.374f)
                lineTo(6.059f, 256.939f)
                lineTo(125.523f, 194.187f)
                lineTo(245.04f, 257.047f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(124.243f, 38.475f)
                lineTo(248.229f, 99.881f)
                lineTo(245.059f, 233.697f)
                lineTo(127.993f, 175.719f)
                lineTo(124.243f, 38.475f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(387.678f, 473.525f)
                lineTo(263.692f, 412.119f)
                lineTo(266.862f, 278.302f)
                lineTo(383.928f, 336.281f)
                lineTo(387.678f, 473.525f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(128.525f, 474.77f)
                lineTo(126.949f, 336.42f)
                lineTo(247.62f, 278.493f)
                lineTo(249.108f, 409.121f)
                lineTo(128.525f, 474.77f)
                close()
            }
        }
        .build()
        return _ice!!
    }

private var _ice: ImageVector? = null
