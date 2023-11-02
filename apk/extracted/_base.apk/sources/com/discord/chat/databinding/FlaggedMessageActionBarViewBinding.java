package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FlaggedMessageActionBarViewBinding implements ViewBinding {
    public final DCDButton actionsButton;
    public final DCDButton feedbackButton;
    private final View rootView;
    public final ImageView separatorDot;

    private FlaggedMessageActionBarViewBinding(View view, DCDButton dCDButton, DCDButton dCDButton2, ImageView imageView) {
        this.rootView = view;
        this.actionsButton = dCDButton;
        this.feedbackButton = dCDButton2;
        this.separatorDot = imageView;
    }

    public static FlaggedMessageActionBarViewBinding bind(View view) {
        int i = C2912R.C2914id.actions_button;
        DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
        if (dCDButton != null) {
            i = C2912R.C2914id.feedback_button;
            DCDButton dCDButton2 = (DCDButton) C12815a.m3875a(view, i);
            if (dCDButton2 != null) {
                i = C2912R.C2914id.separator_dot;
                ImageView imageView = (ImageView) C12815a.m3875a(view, i);
                if (imageView != null) {
                    return new FlaggedMessageActionBarViewBinding(view, dCDButton, dCDButton2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FlaggedMessageActionBarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.flagged_message_action_bar_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
