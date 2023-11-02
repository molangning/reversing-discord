package com.discord.misc.utilities.view;

import android.content.res.ColorStateList;
import android.widget.Button;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"setBackgroundColors", "", "Landroid/widget/Button;", ViewProps.COLOR, "", "disabledColor", "(Landroid/widget/Button;ILjava/lang/Integer;)V", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ButtonBackgroundUtilsKt {
    public static final void setBackgroundColors(Button button, int i, Integer num) {
        int[] m14076B0;
        C9612q.m13917h(button, "<this>");
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        if (num != null) {
            arrayList.add(new int[]{-16842910});
            arrayList2.add(num);
        }
        arrayList.add(new int[0]);
        arrayList2.add(Integer.valueOf(i));
        m14076B0 = C9553r.m14076B0(arrayList2);
        C1365w0.m37175v0(button, new ColorStateList((int[][]) arrayList.toArray(new int[0]), m14076B0));
    }

    public static /* synthetic */ void setBackgroundColors$default(Button button, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        setBackgroundColors(button, i, num);
    }
}
