package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SeparatorSummaryViewBinding implements ViewBinding {
    public final Guideline bottomGuideline;
    public final FrameLayout buttonWrapper;
    public final SimpleDraweeView icon;
    public final SimpleDraweeView indicatorBottom;
    public final Barrier indicatorEndBarrier;
    public final SimpleDraweeView indicatorTop;
    public final SimpleDraweeView jumpButton;
    public final TextView middleText;
    public final SimpleDraweeView moreButton;
    public final View rightBar;
    private final View rootView;
    public final Guideline topGuideline;

    private SeparatorSummaryViewBinding(View view, Guideline guideline, FrameLayout frameLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, Barrier barrier, SimpleDraweeView simpleDraweeView3, SimpleDraweeView simpleDraweeView4, TextView textView, SimpleDraweeView simpleDraweeView5, View view2, Guideline guideline2) {
        this.rootView = view;
        this.bottomGuideline = guideline;
        this.buttonWrapper = frameLayout;
        this.icon = simpleDraweeView;
        this.indicatorBottom = simpleDraweeView2;
        this.indicatorEndBarrier = barrier;
        this.indicatorTop = simpleDraweeView3;
        this.jumpButton = simpleDraweeView4;
        this.middleText = textView;
        this.moreButton = simpleDraweeView5;
        this.rightBar = view2;
        this.topGuideline = guideline2;
    }

    public static SeparatorSummaryViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.bottom_guideline;
        Guideline guideline = (Guideline) C12815a.m3875a(view, i);
        if (guideline != null) {
            i = C2912R.C2914id.button_wrapper;
            FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
            if (frameLayout != null) {
                i = C2912R.C2914id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
                if (simpleDraweeView != null) {
                    i = C2912R.C2914id.indicator_bottom;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                    if (simpleDraweeView2 != null) {
                        i = C2912R.C2914id.indicator_end_barrier;
                        Barrier barrier = (Barrier) C12815a.m3875a(view, i);
                        if (barrier != null) {
                            i = C2912R.C2914id.indicator_top;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C12815a.m3875a(view, i);
                            if (simpleDraweeView3 != null) {
                                i = C2912R.C2914id.jump_button;
                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                if (simpleDraweeView4 != null) {
                                    i = C2912R.C2914id.middle_text;
                                    TextView textView = (TextView) C12815a.m3875a(view, i);
                                    if (textView != null) {
                                        i = C2912R.C2914id.more_button;
                                        SimpleDraweeView simpleDraweeView5 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                        if (simpleDraweeView5 != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.right_bar))) != null) {
                                            i = C2912R.C2914id.top_guideline;
                                            Guideline guideline2 = (Guideline) C12815a.m3875a(view, i);
                                            if (guideline2 != null) {
                                                return new SeparatorSummaryViewBinding(view, guideline, frameLayout, simpleDraweeView, simpleDraweeView2, barrier, simpleDraweeView3, simpleDraweeView4, textView, simpleDraweeView5, m3875a, guideline2);
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

    public static SeparatorSummaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.separator_summary_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
