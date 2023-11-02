package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SafetyPolicyNoticeBinding implements ViewBinding {
    public final TextView description;
    public final LinearLayout footer;
    public final SimpleDraweeView icon;
    public final TextView learnMore;
    private final View rootView;
    public final TextView subtitleText;
    public final TextView title;

    private SafetyPolicyNoticeBinding(View view, TextView textView, LinearLayout linearLayout, SimpleDraweeView simpleDraweeView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = view;
        this.description = textView;
        this.footer = linearLayout;
        this.icon = simpleDraweeView;
        this.learnMore = textView2;
        this.subtitleText = textView3;
        this.title = textView4;
    }

    public static SafetyPolicyNoticeBinding bind(View view) {
        int i = C2912R.C2914id.description;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.footer;
            LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
            if (linearLayout != null) {
                i = C2912R.C2914id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView != null) {
                    i = C2912R.C2914id.learn_more;
                    TextView textView2 = (TextView) C12815a.m3875a(view, i);
                    if (textView2 != null) {
                        i = C2912R.C2914id.subtitle_text;
                        TextView textView3 = (TextView) C12815a.m3875a(view, i);
                        if (textView3 != null) {
                            i = C2912R.C2914id.title;
                            TextView textView4 = (TextView) C12815a.m3875a(view, i);
                            if (textView4 != null) {
                                return new SafetyPolicyNoticeBinding(view, textView, linearLayout, simpleDraweeView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SafetyPolicyNoticeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.safety_policy_notice, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}