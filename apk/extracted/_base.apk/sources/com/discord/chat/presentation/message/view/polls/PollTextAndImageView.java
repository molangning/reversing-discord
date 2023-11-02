package com.discord.chat.presentation.message.view.polls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.AttachmentType;
import com.discord.chat.bridge.polls.PollAnswer;
import com.discord.chat.databinding.PollTextAndImageAnswerViewBinding;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import com.discord.chat.presentation.message.view.polls.PollTextAndImageView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p145i0.C7374c;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000e\u000fB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView;", "Lcom/discord/chat/presentation/message/view/polls/BasePollWithRecyclerView;", "Lcom/discord/chat/presentation/message/view/polls/PollPresenter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "myAdapter", "Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerAdapter;", "getMyAdapter", "()Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerAdapter;", "ImageAndTextAnswerAdapter", "ImageAndTextAnswerHolder", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollTextAndImageView extends BasePollWithRecyclerView {
    private final ImageAndTextAnswerAdapter myAdapter;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerAdapter;", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerHolder;", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class ImageAndTextAnswerAdapter extends PollAnswerAdapter<ImageAndTextAnswerHolder> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ImageAndTextAnswerHolder onCreateViewHolder(ViewGroup parent, int i) {
            C9612q.m13917h(parent, "parent");
            PollTextAndImageAnswerViewBinding inflate = PollTextAndImageAnswerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            C9612q.m13918g(inflate, "inflate(\n               … false,\n                )");
            return new ImageAndTextAnswerHolder(inflate);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollTextAndImageView$ImageAndTextAnswerHolder;", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerViewHolder;", "Lcom/discord/chat/databinding/PollTextAndImageAnswerViewBinding;", "binding", "(Lcom/discord/chat/databinding/PollTextAndImageAnswerViewBinding;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class ImageAndTextAnswerHolder extends PollAnswerViewHolder<PollTextAndImageAnswerViewBinding> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageAndTextAnswerHolder(PollTextAndImageAnswerViewBinding binding) {
            super(binding);
            C9612q.m13917h(binding, "binding");
            SimpleDraweeView simpleDraweeView = binding.avatar;
            C9612q.m13918g(simpleDraweeView, "binding.avatar");
            ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
            SimpleDraweeSpanTextView _init_$lambda$0 = binding.label;
            _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
            C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
            DiscordFont discordFont = DiscordFont.PrimarySemibold;
            DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
            TextView textView = binding.votePercentage;
            C9612q.m13918g(textView, "binding.votePercentage");
            DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
            TextView textView2 = binding.voteCounts;
            C9612q.m13918g(textView2, "binding.voteCounts");
            DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2$lambda$1(ImageAndTextAnswerHolder this$0, PollAnswer answer, View view) {
            C9612q.m13917h(this$0, "this$0");
            C9612q.m13917h(answer, "$answer");
            this$0.getPollAnswerAdapter().getOnTapAnswer().invoke(answer.getAnswerId());
        }

        @Override // com.discord.chat.presentation.message.view.polls.PollAnswerViewHolder
        public void bind(PollAnswerAccessory accessory) {
            int dpToPx;
            int dpToPx2;
            int i;
            String str;
            Object obj;
            String str2;
            boolean z;
            int i2;
            int textNormal;
            boolean z2;
            int backgroundTertiary;
            C9612q.m13917h(accessory, "accessory");
            final PollAnswer answer = accessory.getAnswer();
            if (!accessory.getHasVoted()) {
                dpToPx = 0;
            } else if (answer.getDidSelfVote()) {
                dpToPx = SizeUtilsKt.getDpToPx(2);
            } else {
                dpToPx = SizeUtilsKt.getDpToPx(1);
            }
            ConstraintLayout bind$lambda$2 = getBinding().getRoot();
            bind$lambda$2.setEnabled(accessory.getCanTapAnswers());
            bind$lambda$2.setOnClickListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.polls.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PollTextAndImageView.ImageAndTextAnswerHolder.bind$lambda$2$lambda$1(PollTextAndImageView.ImageAndTextAnswerHolder.this, answer, view);
                }
            });
            if (C9612q.m13922c(answer.isSelected(), Boolean.TRUE)) {
                dpToPx2 = SizeUtilsKt.getDpToPx(32);
            } else {
                dpToPx2 = SizeUtilsKt.getDpToPx(4);
            }
            float f = dpToPx2;
            if (((int) bind$lambda$2.getElevation()) == 0) {
                bind$lambda$2.setElevation(f);
            } else {
                bind$lambda$2.animate().translationZ(f).setInterpolator(new C7374c()).setDuration(120L).start();
            }
            bind$lambda$2.setAlpha(1.0f);
            if (accessory.getHasVoted()) {
                C9612q.m13918g(bind$lambda$2, "bind$lambda$2");
                ViewBackgroundUtilsKt.setBackgroundRectangle(bind$lambda$2, -4133164, SizeUtilsKt.getDpToPx(12), Integer.valueOf(ThemeManagerKt.getTheme().getTextPositive()), dpToPx);
                if (!answer.getDidSelfVote()) {
                    bind$lambda$2.setAlpha(0.5f);
                }
            } else {
                C9612q.m13918g(bind$lambda$2, "bind$lambda$2");
                ViewBackgroundUtilsKt.setBackgroundRectangle$default(bind$lambda$2, ThemeManagerKt.getTheme().getBackgroundPrimary(), SizeUtilsKt.getDpToPx(12), null, 0, 12, null);
            }
            View bind$lambda$4 = getBinding().percentageBarBackground;
            C9612q.m13918g(bind$lambda$4, "bind$lambda$4");
            if (accessory.getCanShowVoteCounts()) {
                i = 0;
            } else {
                i = 8;
            }
            bind$lambda$4.setVisibility(i);
            if (!accessory.getCanShowVoteCounts()) {
                str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
            } else {
                if (accessory.getHasVoted()) {
                    backgroundTertiary = ThemeManagerKt.getTheme().getTextPositive();
                } else {
                    backgroundTertiary = ThemeManagerKt.getTheme().getBackgroundTertiary();
                }
                str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                ViewBackgroundUtilsKt.setBackgroundRectangle$default(bind$lambda$4, backgroundTertiary, SizeUtilsKt.getDpToPx(12), null, 0, 12, null);
                ViewGroup.LayoutParams layoutParams = bind$lambda$4.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.f2399O = answer.getVotesPercentage() / 100.0f;
                    bind$lambda$4.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException(str);
                }
            }
            SimpleDraweeView bind$lambda$7 = getBinding().image;
            Iterator<T> it = accessory.getAttachments().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Attachment) obj).type() == AttachmentType.Image) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Attachment attachment = (Attachment) obj;
            C9612q.m13918g(bind$lambda$7, "bind$lambda$7");
            ViewGroup.LayoutParams layoutParams3 = bind$lambda$7.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = dpToPx;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = dpToPx;
                if (layoutParams4.getLayoutDirection() == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = dpToPx;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = dpToPx;
                }
                bind$lambda$7.setLayoutParams(layoutParams4);
                if (attachment != null) {
                    str2 = attachment.getUrl();
                } else {
                    str2 = null;
                }
                SetOptionalImageUrlKt.setOptionalImageUrl$default(bind$lambda$7, str2, false, null, 4, null);
                SimpleDraweeView bind$lambda$8 = getBinding().avatar;
                C9612q.m13918g(bind$lambda$8, "bind$lambda$8");
                if (!C9612q.m13922c(answer.isSelected(), Boolean.TRUE) && !answer.getDidSelfVote()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                bind$lambda$8.setVisibility(i2);
                bind$lambda$8.setImageURI(accessory.getMyAvatarUrl());
                if (accessory.getHasVoted()) {
                    textNormal = ThemeManagerKt.getTheme().getBackgroundPrimary();
                } else {
                    textNormal = ThemeManagerKt.getTheme().getTextNormal();
                }
                SimpleDraweeSpanTextView simpleDraweeSpanTextView = getBinding().label;
                simpleDraweeSpanTextView.setTextColor(textNormal);
                simpleDraweeSpanTextView.setText(answer.getPollMedia().getText());
                if (accessory.getCanShowVoteCounts()) {
                    TextView bind$lambda$10 = getBinding().votePercentage;
                    C9612q.m13918g(bind$lambda$10, "bind$lambda$10");
                    bind$lambda$10.setVisibility(0);
                    bind$lambda$10.setTextColor(textNormal);
                    bind$lambda$10.setText(answer.getVotesPercentage() + "%");
                    TextView bind$lambda$11 = getBinding().voteCounts;
                    C9612q.m13918g(bind$lambda$11, "bind$lambda$11");
                    bind$lambda$11.setVisibility(0);
                    bind$lambda$11.setTextColor(textNormal);
                    bind$lambda$11.setText(answer.getVotes());
                    return;
                }
                TextView textView = getBinding().votePercentage;
                C9612q.m13918g(textView, "binding.votePercentage");
                textView.setVisibility(8);
                TextView textView2 = getBinding().voteCounts;
                C9612q.m13918g(textView2, "binding.voteCounts");
                textView2.setVisibility(8);
                return;
            }
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollTextAndImageView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollTextAndImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ PollTextAndImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollTextAndImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        this.myAdapter = new ImageAndTextAnswerAdapter();
        RecyclerView recyclerView = getBinding().answers;
        recyclerView.addItemDecoration(new VerticalGapItemDecoration(SizeUtilsKt.getDpToPx(8)));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(getMyAdapter());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.discord.chat.presentation.message.view.polls.BasePollWithRecyclerView
    public ImageAndTextAnswerAdapter getMyAdapter() {
        return this.myAdapter;
    }
}
