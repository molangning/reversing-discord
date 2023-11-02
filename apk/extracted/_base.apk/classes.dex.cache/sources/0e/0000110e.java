package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CallSystemMessageViewBinding implements ViewBinding {
    public final SimpleDraweeView icon;
    public final TextView info;
    public final TextView message;
    public final OverlappingCirclesView participants;
    private final View rootView;

    private CallSystemMessageViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView, TextView textView2, OverlappingCirclesView overlappingCirclesView) {
        this.rootView = view;
        this.icon = simpleDraweeView;
        this.info = textView;
        this.message = textView2;
        this.participants = overlappingCirclesView;
    }

    public static CallSystemMessageViewBinding bind(View view) {
        int i = C2912R.C2914id.icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.info;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.message;
                TextView textView2 = (TextView) C12815a.m3875a(view, i);
                if (textView2 != null) {
                    i = C2912R.C2914id.participants;
                    OverlappingCirclesView overlappingCirclesView = (OverlappingCirclesView) C12815a.m3875a(view, i);
                    if (overlappingCirclesView != null) {
                        return new CallSystemMessageViewBinding(view, simpleDraweeView, textView, textView2, overlappingCirclesView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CallSystemMessageViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.call_system_message_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}