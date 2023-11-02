package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SeparatorViewBinding implements ViewBinding {
    public final View leftBar;
    public final TextView middleText;
    public final View rightBar;
    private final View rootView;

    private SeparatorViewBinding(View view, View view2, TextView textView, View view3) {
        this.rootView = view;
        this.leftBar = view2;
        this.middleText = textView;
        this.rightBar = view3;
    }

    public static SeparatorViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.left_bar;
        View m3875a2 = C12815a.m3875a(view, i);
        if (m3875a2 != null) {
            i = C2912R.C2914id.middle_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.right_bar))) != null) {
                return new SeparatorViewBinding(view, m3875a2, textView, m3875a);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SeparatorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.separator_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}