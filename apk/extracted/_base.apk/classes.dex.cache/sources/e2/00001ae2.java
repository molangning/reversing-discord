package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.C3317R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class TrashWrapBinding implements ViewBinding {
    private final View rootView;
    public final SimpleDraweeView trashWrapIcon;
    public final FrameLayout trashWrapTargetContainer;
    public final FrameLayout trashWrapTargetZone;

    private TrashWrapBinding(View view, SimpleDraweeView simpleDraweeView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = view;
        this.trashWrapIcon = simpleDraweeView;
        this.trashWrapTargetContainer = frameLayout;
        this.trashWrapTargetZone = frameLayout2;
    }

    public static TrashWrapBinding bind(View view) {
        int i = C3317R.C3319id.trash_wrap_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C3317R.C3319id.trash_wrap_target_container;
            FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
            if (frameLayout != null) {
                i = C3317R.C3319id.trash_wrap_target_zone;
                FrameLayout frameLayout2 = (FrameLayout) C12815a.m3875a(view, i);
                if (frameLayout2 != null) {
                    return new TrashWrapBinding(view, simpleDraweeView, frameLayout, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static TrashWrapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3317R.layout.trash_wrap, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}