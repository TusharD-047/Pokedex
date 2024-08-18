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

public val MyIconPack.Steel: ImageVector
    get() {
        if (_steel != null) {
            return _steel!!
        }
        _steel = Builder(name = "Steel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.051f, 254.527f)
                curveTo(-0.017f, 254.411f, -0.017f, 254.267f, 0.051f, 254.15f)
                lineTo(128.795f, 34.184f)
                curveTo(128.862f, 34.07f, 128.985f, 34.0f, 129.117f, 34.0f)
                horizontalLineTo(384.294f)
                curveTo(384.427f, 34.0f, 384.55f, 34.071f, 384.617f, 34.186f)
                lineTo(511.949f, 254.152f)
                curveTo(512.016f, 254.267f, 512.016f, 254.41f, 511.949f, 254.525f)
                lineTo(384.617f, 474.244f)
                curveTo(384.55f, 474.359f, 384.427f, 474.43f, 384.294f, 474.43f)
                horizontalLineTo(129.117f)
                curveTo(128.985f, 474.43f, 128.862f, 474.36f, 128.795f, 474.246f)
                lineTo(0.051f, 254.527f)
                close()
                moveTo(374.617f, 254.215f)
                curveTo(374.617f, 319.703f, 321.528f, 372.792f, 256.04f, 372.792f)
                curveTo(190.552f, 372.792f, 137.463f, 319.703f, 137.463f, 254.215f)
                curveTo(137.463f, 188.726f, 190.552f, 135.638f, 256.04f, 135.638f)
                curveTo(321.528f, 135.638f, 374.617f, 188.726f, 374.617f, 254.215f)
                close()
            }
        }
        .build()
        return _steel!!
    }

private var _steel: ImageVector? = null
