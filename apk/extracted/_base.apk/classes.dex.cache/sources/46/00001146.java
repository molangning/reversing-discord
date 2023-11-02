package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SurveyActionViewBinding implements ViewBinding {
    public final SimpleDraweeSpanTextView chatListAdapterItemTextFeedback;
    public final SimpleDraweeView chatListFeedbackIcon;
    private final View rootView;
    public final LinearLayout surveyBackground;
    public final CardView surveyCard;

    private SurveyActionViewBinding(View view, SimpleDraweeSpanTextView simpleDraweeSpanTextView, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, CardView cardView) {
        this.rootView = view;
        this.chatListAdapterItemTextFeedback = simpleDraweeSpanTextView;
        this.chatListFeedbackIcon = simpleDraweeView;
        this.surveyBackground = linearLayout;
        this.surveyCard = cardView;
    }

    public static SurveyActionViewBinding bind(View view) {
        int i = C2912R.C2914id.chat_list_adapter_item_text_feedback;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
        if (simpleDraweeSpanTextView != null) {
            i = C2912R.C2914id.chat_list_feedback_icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
            if (simpleDraweeView != null) {
                i = C2912R.C2914id.survey_background;
                LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
                if (linearLayout != null) {
                    i = C2912R.C2914id.survey_card;
                    CardView cardView = (CardView) C12815a.m3875a(view, i);
                    if (cardView != null) {
                        return new SurveyActionViewBinding(view, simpleDraweeSpanTextView, simpleDraweeView, linearLayout, cardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static SurveyActionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.survey_action_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}