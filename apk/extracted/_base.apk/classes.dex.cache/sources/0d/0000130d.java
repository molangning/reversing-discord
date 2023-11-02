package com.discord.chat.presentation.message.messagepart;

import android.content.Context;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.polls.PollAnswer;
import com.discord.chat.bridge.polls.PollData;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0019\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011J\u0019\u0010\u001b\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\u00020\u0005X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "myAvatarUrl", "", "data", "Lcom/discord/chat/bridge/polls/PollData;", "answers", "", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "(JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollData;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnswers", "()Ljava/util/List;", "getChannelId-o4g7jtM", "()J", "J", "getData", "()Lcom/discord/chat/bridge/polls/PollData;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMyAvatarUrl", "component1", "component1-o4g7jtM", "component2", "component2-3Eiw7ao", "component3", "component4", "component5", "copy", "copy-uHwPWNE", "(JLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollData;Ljava/util/List;)Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollMessageAccessory extends MessageAccessory {
    public static final Companion Companion = new Companion(null);
    private final List<PollAnswerAccessory> answers;
    private final long channelId;
    private final PollData data;
    private final String messageId;
    private final String myAvatarUrl;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory$Companion;", "", "()V", "create", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "context", "Landroid/content/Context;", "message", "Lcom/discord/chat/bridge/Message;", "pollData", "Lcom/discord/chat/bridge/polls/PollData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PollMessageAccessory create(Context context, Message message, PollData pollData) {
            int m14093t;
            List m14104i;
            List list;
            boolean m14064L;
            C9612q.m13917h(context, "context");
            C9612q.m13917h(message, "message");
            C9612q.m13917h(pollData, "pollData");
            String avatarUrl = MessageKt.avatarUrl(message, context);
            List<PollAnswer> answers = pollData.getAnswers();
            m14093t = C9546k.m14093t(answers, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (PollAnswer pollAnswer : answers) {
                boolean canTapAnswers = pollData.getCanTapAnswers();
                boolean canShowVoteCounts = pollData.getCanShowVoteCounts();
                boolean hasVoted = pollData.getHasVoted();
                List<Attachment> attachments = message.getAttachments();
                if (attachments != null) {
                    list = new ArrayList();
                    for (Object obj : attachments) {
                        m14064L = C9553r.m14064L(pollAnswer.getPollMedia().getAttachmentIds(), ((Attachment) obj).getId());
                        if (m14064L) {
                            list.add(obj);
                        }
                    }
                } else {
                    m14104i = C9545j.m14104i();
                    list = m14104i;
                }
                arrayList.add(new PollAnswerAccessory(pollAnswer, list, canTapAnswers, canShowVoteCounts, hasVoted, avatarUrl));
            }
            return new PollMessageAccessory(message.m41434getChannelIdo4g7jtM(), message.m41436getId3Eiw7ao(), avatarUrl, pollData, arrayList, null);
        }
    }

    private PollMessageAccessory(long j, String str, String str2, PollData pollData, List<PollAnswerAccessory> list) {
        super(str, "poll", null);
        this.channelId = j;
        this.messageId = str;
        this.myAvatarUrl = str2;
        this.data = pollData;
        this.answers = list;
    }

    public /* synthetic */ PollMessageAccessory(long j, String str, String str2, PollData pollData, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, pollData, list);
    }

    /* renamed from: copy-uHwPWNE$default */
    public static /* synthetic */ PollMessageAccessory m41724copyuHwPWNE$default(PollMessageAccessory pollMessageAccessory, long j, String str, String str2, PollData pollData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pollMessageAccessory.channelId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = pollMessageAccessory.mo41659getMessageId3Eiw7ao();
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = pollMessageAccessory.myAvatarUrl;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            pollData = pollMessageAccessory.data;
        }
        PollData pollData2 = pollData;
        List<PollAnswerAccessory> list2 = list;
        if ((i & 16) != 0) {
            list2 = pollMessageAccessory.answers;
        }
        return pollMessageAccessory.m41727copyuHwPWNE(j2, str3, str4, pollData2, list2);
    }

    /* renamed from: component1-o4g7jtM */
    public final long m41725component1o4g7jtM() {
        return this.channelId;
    }

    /* renamed from: component2-3Eiw7ao */
    public final String m41726component23Eiw7ao() {
        return mo41659getMessageId3Eiw7ao();
    }

    public final String component3() {
        return this.myAvatarUrl;
    }

    public final PollData component4() {
        return this.data;
    }

    public final List<PollAnswerAccessory> component5() {
        return this.answers;
    }

    /* renamed from: copy-uHwPWNE */
    public final PollMessageAccessory m41727copyuHwPWNE(long j, String messageId, String str, PollData data, List<PollAnswerAccessory> answers) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(data, "data");
        C9612q.m13917h(answers, "answers");
        return new PollMessageAccessory(j, messageId, str, data, answers, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollMessageAccessory) {
            PollMessageAccessory pollMessageAccessory = (PollMessageAccessory) obj;
            return ChannelId.m42051equalsimpl0(this.channelId, pollMessageAccessory.channelId) && MessageId.m42077equalsimpl0(mo41659getMessageId3Eiw7ao(), pollMessageAccessory.mo41659getMessageId3Eiw7ao()) && C9612q.m13922c(this.myAvatarUrl, pollMessageAccessory.myAvatarUrl) && C9612q.m13922c(this.data, pollMessageAccessory.data) && C9612q.m13922c(this.answers, pollMessageAccessory.answers);
        }
        return false;
    }

    public final List<PollAnswerAccessory> getAnswers() {
        return this.answers;
    }

    /* renamed from: getChannelId-o4g7jtM */
    public final long m41728getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final PollData getData() {
        return this.data;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41659getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final String getMyAvatarUrl() {
        return this.myAvatarUrl;
    }

    public int hashCode() {
        int m42052hashCodeimpl = ((ChannelId.m42052hashCodeimpl(this.channelId) * 31) + MessageId.m42078hashCodeimpl(mo41659getMessageId3Eiw7ao())) * 31;
        String str = this.myAvatarUrl;
        return ((((m42052hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode()) * 31) + this.answers.hashCode();
    }

    public String toString() {
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        String m42079toStringimpl = MessageId.m42079toStringimpl(mo41659getMessageId3Eiw7ao());
        String str = this.myAvatarUrl;
        PollData pollData = this.data;
        List<PollAnswerAccessory> list = this.answers;
        return "PollMessageAccessory(channelId=" + m42054toStringimpl + ", messageId=" + m42079toStringimpl + ", myAvatarUrl=" + str + ", data=" + pollData + ", answers=" + list + ")";
    }
}