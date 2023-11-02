package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GiftViewBinding implements ViewBinding {
    public final DCDButton acceptButton;
    public final View acceptButtonGradient;
    public final Barrier barrier;
    public final TextView body;
    public final ConstraintLayout content;
    public final Group gradients;
    public final TextView header;
    public final View headerGradient;
    private final FrameLayout rootView;
    public final SimpleDraweeView splash;
    public final TextView subtitle;
    public final View subtitleGradient;
    public final SimpleDraweeView thumbnail;
    public final View thumbnailGradient;
    public final TextView title;
    public final View titleGradient;

    private GiftViewBinding(FrameLayout frameLayout, DCDButton dCDButton, View view, Barrier barrier, TextView textView, ConstraintLayout constraintLayout, Group group, TextView textView2, View view2, SimpleDraweeView simpleDraweeView, TextView textView3, View view3, SimpleDraweeView simpleDraweeView2, View view4, TextView textView4, View view5) {
        this.rootView = frameLayout;
        this.acceptButton = dCDButton;
        this.acceptButtonGradient = view;
        this.barrier = barrier;
        this.body = textView;
        this.content = constraintLayout;
        this.gradients = group;
        this.header = textView2;
        this.headerGradient = view2;
        this.splash = simpleDraweeView;
        this.subtitle = textView3;
        this.subtitleGradient = view3;
        this.thumbnail = simpleDraweeView2;
        this.thumbnailGradient = view4;
        this.title = textView4;
        this.titleGradient = view5;
    }

    public static GiftViewBinding bind(View view) {
        View m3875a;
        View m3875a2;
        View m3875a3;
        View m3875a4;
        View m3875a5;
        int i = C2912R.C2914id.acceptButton;
        DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
        if (dCDButton != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.acceptButtonGradient))) != null) {
            i = C2912R.C2914id.barrier;
            Barrier barrier = (Barrier) C12815a.m3875a(view, i);
            if (barrier != null) {
                i = C2912R.C2914id.body;
                TextView textView = (TextView) C12815a.m3875a(view, i);
                if (textView != null) {
                    i = C2912R.C2914id.content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                    if (constraintLayout != null) {
                        i = C2912R.C2914id.gradients;
                        Group group = (Group) C12815a.m3875a(view, i);
                        if (group != null) {
                            i = C2912R.C2914id.header;
                            TextView textView2 = (TextView) C12815a.m3875a(view, i);
                            if (textView2 != null && (m3875a2 = C12815a.m3875a(view, (i = C2912R.C2914id.headerGradient))) != null) {
                                i = C2912R.C2914id.splash;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                                if (simpleDraweeView != null) {
                                    i = C2912R.C2914id.subtitle;
                                    TextView textView3 = (TextView) C12815a.m3875a(view, i);
                                    if (textView3 != null && (m3875a3 = C12815a.m3875a(view, (i = C2912R.C2914id.subtitleGradient))) != null) {
                                        i = C2912R.C2914id.thumbnail;
                                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                        if (simpleDraweeView2 != null && (m3875a4 = C12815a.m3875a(view, (i = C2912R.C2914id.thumbnailGradient))) != null) {
                                            i = C2912R.C2914id.title;
                                            TextView textView4 = (TextView) C12815a.m3875a(view, i);
                                            if (textView4 != null && (m3875a5 = C12815a.m3875a(view, (i = C2912R.C2914id.titleGradient))) != null) {
                                                return new GiftViewBinding((FrameLayout) view, dCDButton, m3875a, barrier, textView, constraintLayout, group, textView2, m3875a2, simpleDraweeView, textView3, m3875a3, simpleDraweeView2, m3875a4, textView4, m3875a5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static GiftViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GiftViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.gift_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }
}