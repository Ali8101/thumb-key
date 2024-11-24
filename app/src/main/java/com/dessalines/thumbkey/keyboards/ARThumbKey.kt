@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ه", size = LARGE),
                    bottomRight = KeyC("ق"),
                    bottom = KeyC("ة"),
                ),
                KeyItemC(
                    center = KeyC("ب", size = LARGE),
                    top = KeyC("ُ"),
                    topRight = KeyC("َ"),
                    bottom = KeyC("خ"),
                    bottomLeft = KeyC("ض"),
                ),
                KeyItemC(
                    center = KeyC("م", size = LARGE),
                    topLeft = KeyC("ْ"),
                    bottomLeft = KeyC("إ"),
                    left = KeyC("؟"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ي", size = LARGE),
                    topRight = KeyC("ص"),
                    right = KeyC("ح"),
                    bottomRight = KeyC("ط"),
                    bottom = KeyC("ى"),
                ),
                KeyItemC(
                    center = KeyC("ا", size = LARGE),
                    topLeft = KeyC("ف"),
                    top = KeyC("ج"),
                    topRight = KeyC("ش"),
                    right = KeyC("آ"),
                    bottomRight = KeyC("ك"),
                    bottom = KeyC("ت"),
                    bottomLeft = KeyC("ل"),
                    left = KeyC("س"),
                ),
                KeyItemC(
                    center = KeyC("ر", size = LARGE),
                    bottom = KeyC("ز"),
                    bottomLeft = KeyC("ع"),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("و", size = LARGE),
                    top = KeyC("ّ"),
                    topRight = KeyC("ؤ"),
                ),
                KeyItemC(
                    center = KeyC("ن", size = LARGE),
                    top = KeyC("ث"),
                    topRight = KeyC("غ"),
                    right = KeyC("أ"),
                    bottomRight = KeyC("ئ"),
                    topRight = KeyC("غ"),
                    left = KeyC("ء"),
                    topLeft = KeyC("ظ"),
                ),
                KeyItemC(
                    center = KeyC("د", size = LARGE),
                    left = KeyC("ً"),
                    top = KeyC("ذ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("W"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("U"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("M"),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("L"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("D"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "Arabic thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_MAIN,
                shifted = KB_EN_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD, "٠١٢٣٤٥٦٧٨٩"
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
