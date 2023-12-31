package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.message.view.EmbedViewResizingMediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedViewBinding implements ViewBinding {
    public final SimpleDraweeView authorAvatar;
    public final LinearLayout authorContainer;
    public final TextView authorName;
    public final View border;
    public final SimpleDraweeSpanTextView description;
    public final TextView error;
    public final SimpleDraweeView errorIcon;
    public final LinearLayout fieldsBottomWrap;
    public final LinearLayout fieldsContainer;
    public final LinearLayout fieldsTopWrap;
    public final SimpleDraweeView footerAvatar;
    public final LinearLayout footerContainer;
    public final TextView footerText;
    public final FrameLayout imageBlurBg;
    public final ConstraintLayout inlineMediaContainer;
    public final EmbedViewResizingMediaView inlineMediaView;
    public final EmbedViewResizingMediaView inlineMediaView2;
    public final EmbedViewResizingMediaView inlineMediaView3;
    public final EmbedViewResizingMediaView inlineMediaView4;
    public final EmbedViewResizingMediaView mediaView;
    public final SimpleDraweeSpanTextView provider;
    private final View rootView;
    public final Space spacer;
    public final SpoilerView spoiler;
    public final SimpleDraweeView thumbnail;
    public final SimpleDraweeSpanTextView title;

    private EmbedViewBinding(View view, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout, TextView textView, View view2, SimpleDraweeSpanTextView simpleDraweeSpanTextView, TextView textView2, SimpleDraweeView simpleDraweeView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, SimpleDraweeView simpleDraweeView3, LinearLayout linearLayout5, TextView textView3, FrameLayout frameLayout, ConstraintLayout constraintLayout, EmbedViewResizingMediaView embedViewResizingMediaView, EmbedViewResizingMediaView embedViewResizingMediaView2, EmbedViewResizingMediaView embedViewResizingMediaView3, EmbedViewResizingMediaView embedViewResizingMediaView4, EmbedViewResizingMediaView embedViewResizingMediaView5, SimpleDraweeSpanTextView simpleDraweeSpanTextView2, Space space, SpoilerView spoilerView, SimpleDraweeView simpleDraweeView4, SimpleDraweeSpanTextView simpleDraweeSpanTextView3) {
        this.rootView = view;
        this.authorAvatar = simpleDraweeView;
        this.authorContainer = linearLayout;
        this.authorName = textView;
        this.border = view2;
        this.description = simpleDraweeSpanTextView;
        this.error = textView2;
        this.errorIcon = simpleDraweeView2;
        this.fieldsBottomWrap = linearLayout2;
        this.fieldsContainer = linearLayout3;
        this.fieldsTopWrap = linearLayout4;
        this.footerAvatar = simpleDraweeView3;
        this.footerContainer = linearLayout5;
        this.footerText = textView3;
        this.imageBlurBg = frameLayout;
        this.inlineMediaContainer = constraintLayout;
        this.inlineMediaView = embedViewResizingMediaView;
        this.inlineMediaView2 = embedViewResizingMediaView2;
        this.inlineMediaView3 = embedViewResizingMediaView3;
        this.inlineMediaView4 = embedViewResizingMediaView4;
        this.mediaView = embedViewResizingMediaView5;
        this.provider = simpleDraweeSpanTextView2;
        this.spacer = space;
        this.spoiler = spoilerView;
        this.thumbnail = simpleDraweeView4;
        this.title = simpleDraweeSpanTextView3;
    }

    public static EmbedViewBinding bind(View view) {
        View m3875a;
        int i = C2912R.C2914id.author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C2912R.C2914id.author_container;
            LinearLayout linearLayout = (LinearLayout) C12815a.m3875a(view, i);
            if (linearLayout != null) {
                i = C2912R.C2914id.author_name;
                TextView textView = (TextView) C12815a.m3875a(view, i);
                if (textView != null && (m3875a = C12815a.m3875a(view, (i = C2912R.C2914id.border))) != null) {
                    i = C2912R.C2914id.description;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                    if (simpleDraweeSpanTextView != null) {
                        i = C2912R.C2914id.error;
                        TextView textView2 = (TextView) C12815a.m3875a(view, i);
                        if (textView2 != null) {
                            i = C2912R.C2914id.error_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) C12815a.m3875a(view, i);
                            if (simpleDraweeView2 != null) {
                                i = C2912R.C2914id.fields_bottom_wrap;
                                LinearLayout linearLayout2 = (LinearLayout) C12815a.m3875a(view, i);
                                if (linearLayout2 != null) {
                                    i = C2912R.C2914id.fields_container;
                                    LinearLayout linearLayout3 = (LinearLayout) C12815a.m3875a(view, i);
                                    if (linearLayout3 != null) {
                                        i = C2912R.C2914id.fields_top_wrap;
                                        LinearLayout linearLayout4 = (LinearLayout) C12815a.m3875a(view, i);
                                        if (linearLayout4 != null) {
                                            i = C2912R.C2914id.footer_avatar;
                                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                            if (simpleDraweeView3 != null) {
                                                i = C2912R.C2914id.footer_container;
                                                LinearLayout linearLayout5 = (LinearLayout) C12815a.m3875a(view, i);
                                                if (linearLayout5 != null) {
                                                    i = C2912R.C2914id.footer_text;
                                                    TextView textView3 = (TextView) C12815a.m3875a(view, i);
                                                    if (textView3 != null) {
                                                        i = C2912R.C2914id.image_blur_bg;
                                                        FrameLayout frameLayout = (FrameLayout) C12815a.m3875a(view, i);
                                                        if (frameLayout != null) {
                                                            i = C2912R.C2914id.inline_media_container;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) C12815a.m3875a(view, i);
                                                            if (constraintLayout != null) {
                                                                i = C2912R.C2914id.inline_media_view;
                                                                EmbedViewResizingMediaView embedViewResizingMediaView = (EmbedViewResizingMediaView) C12815a.m3875a(view, i);
                                                                if (embedViewResizingMediaView != null) {
                                                                    i = C2912R.C2914id.inline_media_view2;
                                                                    EmbedViewResizingMediaView embedViewResizingMediaView2 = (EmbedViewResizingMediaView) C12815a.m3875a(view, i);
                                                                    if (embedViewResizingMediaView2 != null) {
                                                                        i = C2912R.C2914id.inline_media_view3;
                                                                        EmbedViewResizingMediaView embedViewResizingMediaView3 = (EmbedViewResizingMediaView) C12815a.m3875a(view, i);
                                                                        if (embedViewResizingMediaView3 != null) {
                                                                            i = C2912R.C2914id.inline_media_view4;
                                                                            EmbedViewResizingMediaView embedViewResizingMediaView4 = (EmbedViewResizingMediaView) C12815a.m3875a(view, i);
                                                                            if (embedViewResizingMediaView4 != null) {
                                                                                i = C2912R.C2914id.media_view;
                                                                                EmbedViewResizingMediaView embedViewResizingMediaView5 = (EmbedViewResizingMediaView) C12815a.m3875a(view, i);
                                                                                if (embedViewResizingMediaView5 != null) {
                                                                                    i = C2912R.C2914id.provider;
                                                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                                                                                    if (simpleDraweeSpanTextView2 != null) {
                                                                                        i = C2912R.C2914id.spacer;
                                                                                        Space space = (Space) C12815a.m3875a(view, i);
                                                                                        if (space != null) {
                                                                                            i = C2912R.C2914id.spoiler;
                                                                                            SpoilerView spoilerView = (SpoilerView) C12815a.m3875a(view, i);
                                                                                            if (spoilerView != null) {
                                                                                                i = C2912R.C2914id.thumbnail;
                                                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) C12815a.m3875a(view, i);
                                                                                                if (simpleDraweeView4 != null) {
                                                                                                    i = C2912R.C2914id.title;
                                                                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                                                                                                    if (simpleDraweeSpanTextView3 != null) {
                                                                                                        return new EmbedViewBinding(view, simpleDraweeView, linearLayout, textView, m3875a, simpleDraweeSpanTextView, textView2, simpleDraweeView2, linearLayout2, linearLayout3, linearLayout4, simpleDraweeView3, linearLayout5, textView3, frameLayout, constraintLayout, embedViewResizingMediaView, embedViewResizingMediaView2, embedViewResizingMediaView3, embedViewResizingMediaView4, embedViewResizingMediaView5, simpleDraweeSpanTextView2, space, spoilerView, simpleDraweeView4, simpleDraweeSpanTextView3);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EmbedViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.embed_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
