package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.image.ReactImageView;
import java.util.ArrayList;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactTypefaceUtils {
    public static Typeface applyStyles(Typeface typeface, int i, int i2, String str, AssetManager assetManager) {
        TypefaceStyle typefaceStyle = new TypefaceStyle(i, i2);
        if (str == null) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return typefaceStyle.apply(typeface);
        }
        return ReactFontManager.getInstance().getTypeface(str, typefaceStyle, assetManager);
    }

    public static int parseFontStyle(String str) {
        if (str != null) {
            if ("italic".equals(str)) {
                return 2;
            }
            if ("normal".equals(str)) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    public static String parseFontVariant(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string != null) {
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -1983120972:
                            if (string.equals("stylistic-thirteen")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1933522176:
                            if (string.equals("stylistic-fifteen")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1534462052:
                            if (string.equals("stylistic-eighteen")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1195362251:
                            if (string.equals("proportional-nums")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1061392823:
                            if (string.equals("lining-nums")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -771984547:
                            if (string.equals("tabular-nums")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -659678800:
                            if (string.equals("oldstyle-nums")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 296506098:
                            if (string.equals("stylistic-eight")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 309330544:
                            if (string.equals("stylistic-seven")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 310339585:
                            if (string.equals("stylistic-three")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 604478526:
                            if (string.equals("stylistic-eleven")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 979426287:
                            if (string.equals("stylistic-five")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 979432035:
                            if (string.equals("stylistic-four")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 979664367:
                            if (string.equals("stylistic-nine")) {
                                c = '\r';
                                break;
                            }
                            break;
                        case 1001434505:
                            if (string.equals("stylistic-one")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 1001438213:
                            if (string.equals("stylistic-six")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1001439040:
                            if (string.equals("stylistic-ten")) {
                                c = 16;
                                break;
                            }
                            break;
                        case 1001439599:
                            if (string.equals("stylistic-two")) {
                                c = 17;
                                break;
                            }
                            break;
                        case 1030714463:
                            if (string.equals("stylistic-sixteen")) {
                                c = 18;
                                break;
                            }
                            break;
                        case 1044065430:
                            if (string.equals("stylistic-twelve")) {
                                c = 19;
                                break;
                            }
                            break;
                        case 1044067310:
                            if (string.equals("stylistic-twenty")) {
                                c = 20;
                                break;
                            }
                            break;
                        case 1183323111:
                            if (string.equals("small-caps")) {
                                c = 21;
                                break;
                            }
                            break;
                        case 1463562569:
                            if (string.equals("stylistic-nineteen")) {
                                c = 22;
                                break;
                            }
                            break;
                        case 1648446397:
                            if (string.equals("stylistic-fourteen")) {
                                c = 23;
                                break;
                            }
                            break;
                        case 2097122634:
                            if (string.equals("stylistic-seventeen")) {
                                c = 24;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            arrayList.add("'ss13'");
                            continue;
                        case 1:
                            arrayList.add("'ss15'");
                            continue;
                        case 2:
                            arrayList.add("'ss18'");
                            continue;
                        case 3:
                            arrayList.add("'pnum'");
                            continue;
                        case 4:
                            arrayList.add("'lnum'");
                            continue;
                        case 5:
                            arrayList.add("'tnum'");
                            continue;
                        case 6:
                            arrayList.add("'onum'");
                            continue;
                        case 7:
                            arrayList.add("'ss08'");
                            continue;
                        case '\b':
                            arrayList.add("'ss07'");
                            continue;
                        case '\t':
                            arrayList.add("'ss03'");
                            continue;
                        case '\n':
                            arrayList.add("'ss11'");
                            continue;
                        case 11:
                            arrayList.add("'ss05'");
                            continue;
                        case '\f':
                            arrayList.add("'ss04'");
                            continue;
                        case '\r':
                            arrayList.add("'ss09'");
                            continue;
                        case 14:
                            arrayList.add("'ss01'");
                            continue;
                        case 15:
                            arrayList.add("'ss06'");
                            continue;
                        case 16:
                            arrayList.add("'ss10'");
                            continue;
                        case 17:
                            arrayList.add("'ss02'");
                            continue;
                        case 18:
                            arrayList.add("'ss16'");
                            continue;
                        case 19:
                            arrayList.add("'ss12'");
                            continue;
                        case 20:
                            arrayList.add("'ss20'");
                            continue;
                        case 21:
                            arrayList.add("'smcp'");
                            continue;
                        case 22:
                            arrayList.add("'ss19'");
                            continue;
                        case 23:
                            arrayList.add("'ss14'");
                            continue;
                        case 24:
                            arrayList.add("'ss17'");
                            continue;
                    }
                }
            }
            return TextUtils.join(", ", arrayList);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int parseFontWeight(String str) {
        char c;
        if (str != null) {
            switch (str.hashCode()) {
                case -1039745817:
                    if (str.equals("normal")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 48625:
                    if (str.equals("100")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 49586:
                    if (str.equals("200")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 50547:
                    if (str.equals("300")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 51508:
                    if (str.equals("400")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 52469:
                    if (str.equals("500")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 53430:
                    if (str.equals("600")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 54391:
                    if (str.equals("700")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 55352:
                    if (str.equals("800")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 56313:
                    if (str.equals("900")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 4:
                    return TypefaceStyle.NORMAL;
                case 1:
                    return 100;
                case 2:
                    return ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION;
                case 3:
                    return ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;
                case 5:
                    return 500;
                case 6:
                    return 600;
                case 7:
                case '\n':
                    return TypefaceStyle.BOLD;
                case '\b':
                    return 800;
                case '\t':
                    return 900;
            }
        }
        return -1;
    }
}