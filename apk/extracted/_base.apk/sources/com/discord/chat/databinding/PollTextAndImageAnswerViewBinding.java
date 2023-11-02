package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollTextAndImageAnswerViewBinding implements ViewBinding {
    public final SimpleDraweeView avatar;
    public final SimpleDraweeView image;
    public final SimpleDraweeSpanTextView label;
    public final View percentageBarBackground;
    public final Barrier resultsStart;
    private final ConstraintLayout rootView;
    public final TextView voteCounts;
    public final TextView votePercentage;

    private PollTextAndImageAnswerViewBinding(ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, View view, Barrier barrier, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.avatar = simpleDraweeView;
        this.image = simpleDraweeView2;
        this.label = simpleDraweeSpanTextView;
        this.percentageBarBackground = view;
        this.resultsStart = barrier;
        this.voteCounts = textView;
        this.votePercentage = textView2;
    }

    public static PollTextAndImageAnswerViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.image;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView2 != null) {
                i = C2912R.C2914id.label;
                SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                if (simpleDraweeSpanTextView != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.percentage_bar_background))) != null) {
                    i = C2912R.C2914id.results_start;
                    Barrier barrier = (Barrier) C12815a.m3875a(view, i);
                    if (barrier != null) {
                        i = C2912R.C2914id.vote_counts;
                        TextView textView = (TextView) C12815a.m3875a(view, i);
                        if (textView != null) {
                            i = C2912R.C2914id.vote_percentage;
                            TextView textView2 = (TextView) C12815a.m3875a(view, i);
                            if (textView2 != null) {
                                return new PollTextAndImageAnswerViewBinding((ConstraintLayout) view, simpleDraweeView, simpleDraweeView2, simpleDraweeSpanTextView, m3875a, barrier, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PollTextAndImageAnswerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PollTextAndImageAnswerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.poll_text_and_image_answer_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
