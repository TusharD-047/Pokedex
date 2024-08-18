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

public val MyIconPack.Electric: ImageVector
    get() {
        if (_electric != null) {
            return _electric!!
        }
        _electric = Builder(name = "Electric", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(152.56f, 0.584f)
                curveTo(152.461f, 0.298f, 152.674f, 0.0f, 152.976f, 0.0f)
                horizontalLineTo(332.805f)
                curveTo(332.998f, 0.0f, 333.169f, 0.126f, 333.226f, 0.31f)
                lineTo(415.824f, 267.171f)
                curveTo(415.911f, 267.454f, 415.7f, 267.741f, 415.403f, 267.741f)
                horizontalLineTo(295.684f)
                curveTo(295.538f, 267.741f, 295.433f, 267.88f, 295.473f, 268.021f)
                lineTo(364.135f, 509.726f)
                curveTo(364.269f, 510.195f, 363.654f, 510.501f, 363.361f, 510.111f)
                lineTo(96.53f, 155.267f)
                curveTo(96.312f, 154.977f, 96.518f, 154.563f, 96.881f, 154.563f)
                horizontalLineTo(205.536f)
                curveTo(205.687f, 154.563f, 205.793f, 154.414f, 205.743f, 154.271f)
                lineTo(152.56f, 0.584f)
                close()
            }
        }
        .build()
        return _electric!!
    }

private var _electric: ImageVector? = null
