package androidx.transition;

import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1888m {

    /* renamed from: b */
    public View f5203b;

    /* renamed from: a */
    public final Map<String, Object> f5202a = new HashMap();

    /* renamed from: c */
    final ArrayList<Transition> f5204c = new ArrayList<>();

    @Deprecated
    public C1888m() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1888m) {
            C1888m c1888m = (C1888m) obj;
            if (this.f5203b == c1888m.f5203b && this.f5202a.equals(c1888m.f5202a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f5203b.hashCode() * 31) + this.f5202a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5203b + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) + "    values:";
        for (String str2 : this.f5202a.keySet()) {
            str = str + "    " + str2 + ": " + this.f5202a.get(str2) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        return str;
    }

    public C1888m(View view) {
        this.f5203b = view;
    }
}