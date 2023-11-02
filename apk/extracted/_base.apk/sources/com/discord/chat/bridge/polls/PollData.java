package com.discord.chat.bridge.polls;

import com.discord.chat.bridge.polls.PollLayoutType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2581f;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=By\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016B[\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0002\u0010\u0017J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003Js\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\fHÖ\u0001J!\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;HÇ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001f¨\u0006>"}, m14357d2 = {"Lcom/discord/chat/bridge/polls/PollData;", "", "seen1", "", "question", "Lcom/discord/chat/bridge/polls/PollMedia;", "answers", "", "Lcom/discord/chat/bridge/polls/PollAnswer;", "layoutType", "Lcom/discord/chat/bridge/polls/PollLayoutType;", "submitVoteLabel", "", "canSubmitVote", "", "canTapAnswers", "canShowVoteCounts", "hasVoted", "expirationLabel", "isExpired", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/polls/PollMedia;Ljava/util/List;Lcom/discord/chat/bridge/polls/PollLayoutType;Ljava/lang/String;ZZZZLjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/polls/PollMedia;Ljava/util/List;Lcom/discord/chat/bridge/polls/PollLayoutType;Ljava/lang/String;ZZZZLjava/lang/String;Z)V", "getAnswers", "()Ljava/util/List;", "getCanShowVoteCounts", "()Z", "getCanSubmitVote", "getCanTapAnswers", "getExpirationLabel", "()Ljava/lang/String;", "getHasVoted", "getLayoutType", "()Lcom/discord/chat/bridge/polls/PollLayoutType;", "getQuestion", "()Lcom/discord/chat/bridge/polls/PollMedia;", "getSubmitVoteLabel", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollData {
    public static final Companion Companion = new Companion(null);
    private final List<PollAnswer> answers;
    private final boolean canShowVoteCounts;
    private final boolean canSubmitVote;
    private final boolean canTapAnswers;
    private final String expirationLabel;
    private final boolean hasVoted;
    private final boolean isExpired;
    private final PollLayoutType layoutType;
    private final PollMedia question;
    private final String submitVoteLabel;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/polls/PollData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PollData> serializer() {
            return PollData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PollData(int i, PollMedia pollMedia, List list, PollLayoutType pollLayoutType, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            C2620n1.m32836b(i, 1023, PollData$$serializer.INSTANCE.getDescriptor());
        }
        this.question = pollMedia;
        this.answers = list;
        this.layoutType = pollLayoutType;
        this.submitVoteLabel = str;
        this.canSubmitVote = z;
        this.canTapAnswers = z2;
        this.canShowVoteCounts = z3;
        this.hasVoted = z4;
        this.expirationLabel = str2;
        this.isExpired = z5;
    }

    public static final void write$Self(PollData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, PollMedia$$serializer.INSTANCE, self.question);
        output.mo12894i(serialDesc, 1, new C2581f(PollAnswer$$serializer.INSTANCE), self.answers);
        output.mo12894i(serialDesc, 2, PollLayoutType.Serializer.INSTANCE, self.layoutType);
        output.mo12880y(serialDesc, 3, self.submitVoteLabel);
        output.mo12881x(serialDesc, 4, self.canSubmitVote);
        output.mo12881x(serialDesc, 5, self.canTapAnswers);
        output.mo12881x(serialDesc, 6, self.canShowVoteCounts);
        output.mo12881x(serialDesc, 7, self.hasVoted);
        output.mo12880y(serialDesc, 8, self.expirationLabel);
        output.mo12881x(serialDesc, 9, self.isExpired);
    }

    public final PollMedia component1() {
        return this.question;
    }

    public final boolean component10() {
        return this.isExpired;
    }

    public final List<PollAnswer> component2() {
        return this.answers;
    }

    public final PollLayoutType component3() {
        return this.layoutType;
    }

    public final String component4() {
        return this.submitVoteLabel;
    }

    public final boolean component5() {
        return this.canSubmitVote;
    }

    public final boolean component6() {
        return this.canTapAnswers;
    }

    public final boolean component7() {
        return this.canShowVoteCounts;
    }

    public final boolean component8() {
        return this.hasVoted;
    }

    public final String component9() {
        return this.expirationLabel;
    }

    public final PollData copy(PollMedia question, List<PollAnswer> answers, PollLayoutType layoutType, String submitVoteLabel, boolean z, boolean z2, boolean z3, boolean z4, String expirationLabel, boolean z5) {
        C9612q.m13917h(question, "question");
        C9612q.m13917h(answers, "answers");
        C9612q.m13917h(layoutType, "layoutType");
        C9612q.m13917h(submitVoteLabel, "submitVoteLabel");
        C9612q.m13917h(expirationLabel, "expirationLabel");
        return new PollData(question, answers, layoutType, submitVoteLabel, z, z2, z3, z4, expirationLabel, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollData) {
            PollData pollData = (PollData) obj;
            return C9612q.m13922c(this.question, pollData.question) && C9612q.m13922c(this.answers, pollData.answers) && this.layoutType == pollData.layoutType && C9612q.m13922c(this.submitVoteLabel, pollData.submitVoteLabel) && this.canSubmitVote == pollData.canSubmitVote && this.canTapAnswers == pollData.canTapAnswers && this.canShowVoteCounts == pollData.canShowVoteCounts && this.hasVoted == pollData.hasVoted && C9612q.m13922c(this.expirationLabel, pollData.expirationLabel) && this.isExpired == pollData.isExpired;
        }
        return false;
    }

    public final List<PollAnswer> getAnswers() {
        return this.answers;
    }

    public final boolean getCanShowVoteCounts() {
        return this.canShowVoteCounts;
    }

    public final boolean getCanSubmitVote() {
        return this.canSubmitVote;
    }

    public final boolean getCanTapAnswers() {
        return this.canTapAnswers;
    }

    public final String getExpirationLabel() {
        return this.expirationLabel;
    }

    public final boolean getHasVoted() {
        return this.hasVoted;
    }

    public final PollLayoutType getLayoutType() {
        return this.layoutType;
    }

    public final PollMedia getQuestion() {
        return this.question;
    }

    public final String getSubmitVoteLabel() {
        return this.submitVoteLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.question.hashCode() * 31) + this.answers.hashCode()) * 31) + this.layoutType.hashCode()) * 31) + this.submitVoteLabel.hashCode()) * 31;
        boolean z = this.canSubmitVote;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.canTapAnswers;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.canShowVoteCounts;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.hasVoted;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int hashCode2 = (((i6 + i7) * 31) + this.expirationLabel.hashCode()) * 31;
        boolean z5 = this.isExpired;
        return hashCode2 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public String toString() {
        PollMedia pollMedia = this.question;
        List<PollAnswer> list = this.answers;
        PollLayoutType pollLayoutType = this.layoutType;
        String str = this.submitVoteLabel;
        boolean z = this.canSubmitVote;
        boolean z2 = this.canTapAnswers;
        boolean z3 = this.canShowVoteCounts;
        boolean z4 = this.hasVoted;
        String str2 = this.expirationLabel;
        boolean z5 = this.isExpired;
        return "PollData(question=" + pollMedia + ", answers=" + list + ", layoutType=" + pollLayoutType + ", submitVoteLabel=" + str + ", canSubmitVote=" + z + ", canTapAnswers=" + z2 + ", canShowVoteCounts=" + z3 + ", hasVoted=" + z4 + ", expirationLabel=" + str2 + ", isExpired=" + z5 + ")";
    }

    public PollData(PollMedia question, List<PollAnswer> answers, PollLayoutType layoutType, String submitVoteLabel, boolean z, boolean z2, boolean z3, boolean z4, String expirationLabel, boolean z5) {
        C9612q.m13917h(question, "question");
        C9612q.m13917h(answers, "answers");
        C9612q.m13917h(layoutType, "layoutType");
        C9612q.m13917h(submitVoteLabel, "submitVoteLabel");
        C9612q.m13917h(expirationLabel, "expirationLabel");
        this.question = question;
        this.answers = answers;
        this.layoutType = layoutType;
        this.submitVoteLabel = submitVoteLabel;
        this.canSubmitVote = z;
        this.canTapAnswers = z2;
        this.canShowVoteCounts = z3;
        this.hasVoted = z4;
        this.expirationLabel = expirationLabel;
        this.isExpired = z5;
    }
}
