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

public val MyIconPack.Psychic: ImageVector
    get() {
        if (_psychic != null) {
            return _psychic!!
        }
        _psychic = Builder(name = "Psychic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(455.925f, 425.184f)
                curveTo(455.925f, 425.184f, 391.365f, 476.963f, 262.893f, 455.536f)
                curveTo(165.423f, 439.279f, 113.437f, 331.833f, 113.437f, 274.079f)
                curveTo(113.437f, 137.149f, 214.783f, 105.988f, 283.3f, 105.988f)
                curveTo(351.816f, 105.988f, 396.513f, 172.788f, 396.513f, 224.508f)
                curveTo(396.513f, 276.228f, 359.933f, 321.466f, 303.006f, 321.466f)
                curveTo(246.08f, 321.466f, 229.22f, 281.501f, 229.22f, 244.758f)
                curveTo(229.22f, 208.016f, 258.947f, 195.071f, 286.058f, 195.071f)
                curveTo(313.169f, 195.071f, 322.452f, 218.217f, 322.452f, 238.11f)
                curveTo(322.452f, 258.004f, 307.017f, 265.128f, 294.143f, 265.128f)
                curveTo(281.269f, 265.128f, 279.996f, 258.633f, 275.069f, 251.807f)
                curveTo(270.141f, 244.982f, 281.353f, 219.146f, 262.893f, 219.146f)
                curveTo(244.433f, 219.146f, 240.992f, 248.847f, 240.992f, 248.847f)
                curveTo(240.992f, 248.847f, 247.722f, 306.18f, 303.006f, 305.191f)
                curveTo(358.291f, 304.201f, 384.518f, 261.461f, 376.896f, 219.146f)
                curveTo(369.274f, 176.83f, 328.207f, 131.865f, 256.133f, 140.951f)
                curveTo(184.059f, 150.037f, 154.632f, 222.861f, 167.603f, 300.685f)
                curveTo(180.574f, 378.51f, 273.807f, 423.602f, 347.112f, 407.379f)
                curveTo(420.418f, 391.156f, 493.429f, 338.086f, 493.429f, 203.533f)
                curveTo(493.429f, 68.979f, 376.896f, -11.9f, 237.941f, 1.429f)
                curveTo(98.986f, 14.758f, 12.729f, 136.242f, 18.25f, 282.207f)
                curveTo(23.771f, 428.172f, 162.275f, 507.669f, 279.394f, 511.766f)
                curveTo(396.513f, 515.864f, 468.312f, 448.067f, 468.312f, 448.067f)
                curveTo(468.312f, 448.067f, 484.459f, 433.668f, 478.128f, 422.424f)
                curveTo(471.798f, 411.18f, 455.925f, 425.184f, 455.925f, 425.184f)
                close()
            }
        }
        .build()
        return _psychic!!
    }

private var _psychic: ImageVector? = null
