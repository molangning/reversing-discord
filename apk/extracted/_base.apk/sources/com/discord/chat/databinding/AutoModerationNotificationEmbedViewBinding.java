package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AutoModerationNotificationEmbedViewBinding implements ViewBinding {
    public final LinearLayout actions;
    public final DCDButton actionsButton;
    public final TextView body;
    public final DCDButton feedbackButton;
    public final TextView header;
    private final View rootView;
    public final ImageView separatorDot;
    public final ImageView subtitleDivider;
    public final TextView subtitleSeverity;
    public final TextView subtitleStartTime;
    public final ImageView warningIcon;

    private AutoModerationNotificationEmbedViewBinding(View view, LinearLayout linearLayout, DCDButton dCDButton, TextView textView, DCDButton dCDButton2, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, TextView textView4, ImageView imageView3) {
        this.rootView = view;
        this.actions = linearLayout;
        this.actionsButton = dCDButton;
        this.body = textView;
        this.feedbackButton = dCDButton2;
        this.header = textView2;
        this.separatorDot = imageView;
        this.subtitleDivider = imageView2;
        this.subtitleSeverity = textView3;
        this.subtitleStartTime = textView4;
        this.warningIcon = imageView3;
    }

    public static AutoModerationNotificationEmbedViewBinding bind(View view) {
        int i = C2912R.C2914id.actions;
        LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
        if (linearLayout != null) {
            i = C2912R.C2914id.actions_button;
            DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
            if (dCDButton != null) {
                i = C2912R.C2914id.body;
                TextView textView = (TextView) C12815a.m3875a(view, i);
                if (textView != null) {
                    i = C2912R.C2914id.feedback_button;
                    DCDButton dCDButton2 = (DCDButton) C12815a.m3875a(view, i);
                    if (dCDButton2 != null) {
                        i = C2912R.C2914id.header;
                        TextView textView2 = (TextView) C12815a.m3875a(view, i);
                        if (textView2 != null) {
                            i = C2912R.C2914id.separator_dot;
                            ImageView imageView = (ImageView) C12815a.m3875a(view, i);
                            if (imageView != null) {
                                i = C2912R.C2914id.subtitle_divider;
                                ImageView imageView2 = (ImageView) C12815a.m3875a(view, i);
                                if (imageView2 != null) {
                                    i = C2912R.C2914id.subtitle_severity;
                                    TextView textView3 = (TextView) C12815a.m3875a(view, i);
                                    if (textView3 != null) {
                                        i = C2912R.C2914id.subtitle_start_time;
                                        TextView textView4 = (TextView) C12815a.m3875a(view, i);
                                        if (textView4 != null) {
                                            i = C2912R.C2914id.warning_icon;
                                            ImageView imageView3 = (ImageView) C12815a.m3875a(view, i);
                                            if (imageView3 != null) {
                                                return new AutoModerationNotificationEmbedViewBinding(view, linearLayout, dCDButton, textView, dCDButton2, textView2, imageView, imageView2, textView3, textView4, imageView3);
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

    public static AutoModerationNotificationEmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.auto_moderation_notification_embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
