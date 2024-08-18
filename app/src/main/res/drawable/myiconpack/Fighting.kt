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

public val MyIconPack.Fighting: ImageVector
    get() {
        if (_fighting != null) {
            return _fighting!!
        }
        _fighting = Builder(name = "Fighting", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(88.234f, 42.566f)
                curveTo(94.43f, 18.101f, 116.593f, 0.0f, 142.983f, 0.0f)
                curveTo(162.778f, 0.0f, 180.195f, 10.185f, 190.279f, 25.6f)
                horizontalLineTo(206.792f)
                curveTo(217.051f, 15.072f, 231.384f, 8.533f, 247.245f, 8.533f)
                curveTo(270.499f, 8.533f, 290.471f, 22.588f, 299.129f, 42.667f)
                horizontalLineTo(312.954f)
                curveTo(321.617f, 37.258f, 331.853f, 34.133f, 342.818f, 34.133f)
                curveTo(366.073f, 34.133f, 386.044f, 48.188f, 394.702f, 68.267f)
                horizontalLineTo(432.297f)
                curveTo(432.618f, 68.267f, 432.919f, 68.353f, 433.178f, 68.504f)
                curveTo(434.895f, 68.347f, 436.634f, 68.267f, 438.391f, 68.267f)
                curveTo(469.582f, 68.267f, 494.866f, 93.551f, 494.866f, 124.742f)
                verticalLineTo(294.086f)
                lineTo(494.867f, 294.4f)
                lineTo(494.866f, 294.714f)
                verticalLineTo(297.153f)
                curveTo(494.866f, 298.186f, 494.838f, 299.215f, 494.782f, 300.239f)
                curveTo(491.384f, 417.717f, 385.749f, 512.0f, 255.933f, 512.0f)
                curveTo(123.974f, 512.0f, 17.0f, 414.577f, 17.0f, 294.4f)
                curveTo(17.0f, 236.391f, 41.925f, 183.683f, 82.553f, 144.675f)
                curveTo(82.452f, 201.228f, 83.407f, 259.694f, 87.811f, 258.691f)
                curveTo(99.601f, 256.003f, 90.389f, 80.84f, 88.234f, 42.566f)
                close()
            }
        }
        .build()
        return _fighting!!
    }

private var _fighting: ImageVector? = null
