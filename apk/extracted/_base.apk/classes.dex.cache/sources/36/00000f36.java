package com.discord.chat.bridge;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002;<Bw\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jw\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001J!\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u0006="}, m14357d2 = {"Lcom/discord/chat/bridge/UploadProgress;", "", "seen1", "", "headerText", "", "headerColor", ViewProps.BACKGROUND_COLOR, "progress", "", "fileId", "fileType", "progressTrackColor", "progressStartColor", "progressEndColor", "iconTintColor", "closeTintColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIFLjava/lang/String;Ljava/lang/String;IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IIFLjava/lang/String;Ljava/lang/String;IIIII)V", "getBackgroundColor", "()I", "getCloseTintColor", "getFileId", "()Ljava/lang/String;", "getFileType", "getHeaderColor", "getHeaderText", "getIconTintColor", "getProgress", "()F", "getProgressEndColor", "getProgressStartColor", "getProgressTrackColor", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class UploadProgress {
    public static final Companion Companion = new Companion(null);
    private final int backgroundColor;
    private final int closeTintColor;
    private final String fileId;
    private final String fileType;
    private final int headerColor;
    private final String headerText;
    private final int iconTintColor;
    private final float progress;
    private final int progressEndColor;
    private final int progressStartColor;
    private final int progressTrackColor;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/UploadProgress$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/UploadProgress;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadProgress> serializer() {
            return UploadProgress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UploadProgress(int i, String str, int i2, int i3, float f, String str2, String str3, int i4, int i5, int i6, int i7, int i8, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            C2620n1.m32836b(i, 2047, UploadProgress$$serializer.INSTANCE.getDescriptor());
        }
        this.headerText = str;
        this.headerColor = i2;
        this.backgroundColor = i3;
        this.progress = f;
        this.fileId = str2;
        this.fileType = str3;
        this.progressTrackColor = i4;
        this.progressStartColor = i5;
        this.progressEndColor = i6;
        this.iconTintColor = i7;
        this.closeTintColor = i8;
    }

    public static final void write$Self(UploadProgress self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.headerText);
        output.mo12882w(serialDesc, 1, self.headerColor);
        output.mo12882w(serialDesc, 2, self.backgroundColor);
        output.mo12886s(serialDesc, 3, self.progress);
        output.mo12880y(serialDesc, 4, self.fileId);
        output.mo12880y(serialDesc, 5, self.fileType);
        output.mo12882w(serialDesc, 6, self.progressTrackColor);
        output.mo12882w(serialDesc, 7, self.progressStartColor);
        output.mo12882w(serialDesc, 8, self.progressEndColor);
        output.mo12882w(serialDesc, 9, self.iconTintColor);
        output.mo12882w(serialDesc, 10, self.closeTintColor);
    }

    public final String component1() {
        return this.headerText;
    }

    public final int component10() {
        return this.iconTintColor;
    }

    public final int component11() {
        return this.closeTintColor;
    }

    public final int component2() {
        return this.headerColor;
    }

    public final int component3() {
        return this.backgroundColor;
    }

    public final float component4() {
        return this.progress;
    }

    public final String component5() {
        return this.fileId;
    }

    public final String component6() {
        return this.fileType;
    }

    public final int component7() {
        return this.progressTrackColor;
    }

    public final int component8() {
        return this.progressStartColor;
    }

    public final int component9() {
        return this.progressEndColor;
    }

    public final UploadProgress copy(String headerText, int i, int i2, float f, String fileId, String fileType, int i3, int i4, int i5, int i6, int i7) {
        C9612q.m13917h(headerText, "headerText");
        C9612q.m13917h(fileId, "fileId");
        C9612q.m13917h(fileType, "fileType");
        return new UploadProgress(headerText, i, i2, f, fileId, fileType, i3, i4, i5, i6, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadProgress) {
            UploadProgress uploadProgress = (UploadProgress) obj;
            return C9612q.m13922c(this.headerText, uploadProgress.headerText) && this.headerColor == uploadProgress.headerColor && this.backgroundColor == uploadProgress.backgroundColor && Float.compare(this.progress, uploadProgress.progress) == 0 && C9612q.m13922c(this.fileId, uploadProgress.fileId) && C9612q.m13922c(this.fileType, uploadProgress.fileType) && this.progressTrackColor == uploadProgress.progressTrackColor && this.progressStartColor == uploadProgress.progressStartColor && this.progressEndColor == uploadProgress.progressEndColor && this.iconTintColor == uploadProgress.iconTintColor && this.closeTintColor == uploadProgress.closeTintColor;
        }
        return false;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCloseTintColor() {
        return this.closeTintColor;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final int getHeaderColor() {
        return this.headerColor;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final int getIconTintColor() {
        return this.iconTintColor;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getProgressEndColor() {
        return this.progressEndColor;
    }

    public final int getProgressStartColor() {
        return this.progressStartColor;
    }

    public final int getProgressTrackColor() {
        return this.progressTrackColor;
    }

    public int hashCode() {
        return (((((((((((((((((((this.headerText.hashCode() * 31) + this.headerColor) * 31) + this.backgroundColor) * 31) + Float.floatToIntBits(this.progress)) * 31) + this.fileId.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.progressTrackColor) * 31) + this.progressStartColor) * 31) + this.progressEndColor) * 31) + this.iconTintColor) * 31) + this.closeTintColor;
    }

    public String toString() {
        String str = this.headerText;
        int i = this.headerColor;
        int i2 = this.backgroundColor;
        float f = this.progress;
        String str2 = this.fileId;
        String str3 = this.fileType;
        int i3 = this.progressTrackColor;
        int i4 = this.progressStartColor;
        int i5 = this.progressEndColor;
        int i6 = this.iconTintColor;
        int i7 = this.closeTintColor;
        return "UploadProgress(headerText=" + str + ", headerColor=" + i + ", backgroundColor=" + i2 + ", progress=" + f + ", fileId=" + str2 + ", fileType=" + str3 + ", progressTrackColor=" + i3 + ", progressStartColor=" + i4 + ", progressEndColor=" + i5 + ", iconTintColor=" + i6 + ", closeTintColor=" + i7 + ")";
    }

    public UploadProgress(String headerText, int i, int i2, float f, String fileId, String fileType, int i3, int i4, int i5, int i6, int i7) {
        C9612q.m13917h(headerText, "headerText");
        C9612q.m13917h(fileId, "fileId");
        C9612q.m13917h(fileType, "fileType");
        this.headerText = headerText;
        this.headerColor = i;
        this.backgroundColor = i2;
        this.progress = f;
        this.fileId = fileId;
        this.fileType = fileType;
        this.progressTrackColor = i3;
        this.progressStartColor = i4;
        this.progressEndColor = i5;
        this.iconTintColor = i6;
        this.closeTintColor = i7;
    }
}