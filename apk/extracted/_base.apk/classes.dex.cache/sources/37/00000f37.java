package com.discord.chat.bridge;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p045cj.C2560a2;
import p045cj.C2578e0;
import p045cj.C2615m0;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/UploadProgress.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/UploadProgress;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class UploadProgress$$serializer implements InterfaceC2582f0<UploadProgress> {
    public static final UploadProgress$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UploadProgress$$serializer uploadProgress$$serializer = new UploadProgress$$serializer();
        INSTANCE = uploadProgress$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.UploadProgress", uploadProgress$$serializer, 11);
        pluginGeneratedSerialDescriptor.m12856l("headerText", false);
        pluginGeneratedSerialDescriptor.m12856l("headerColor", false);
        pluginGeneratedSerialDescriptor.m12856l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m12856l("progress", false);
        pluginGeneratedSerialDescriptor.m12856l("fileId", false);
        pluginGeneratedSerialDescriptor.m12856l("fileType", false);
        pluginGeneratedSerialDescriptor.m12856l("progressTrackColor", false);
        pluginGeneratedSerialDescriptor.m12856l("progressStartColor", false);
        pluginGeneratedSerialDescriptor.m12856l("progressEndColor", false);
        pluginGeneratedSerialDescriptor.m12856l("iconTintColor", false);
        pluginGeneratedSerialDescriptor.m12856l("closeTintColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UploadProgress$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2615m0 c2615m0 = C2615m0.f7088a;
        return new KSerializer[]{c2560a2, c2615m0, c2615m0, C2578e0.f7038a, c2560a2, c2560a2, c2615m0, c2615m0, c2615m0, c2615m0, c2615m0};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UploadProgress deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        float f;
        String str3;
        int i7;
        int i8;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i9 = 0;
        if (mo12920b.mo12865p()) {
            String mo12868m = mo12920b.mo12868m(descriptor2, 0);
            int mo12870i = mo12920b.mo12870i(descriptor2, 1);
            int mo12870i2 = mo12920b.mo12870i(descriptor2, 2);
            float mo12863u = mo12920b.mo12863u(descriptor2, 3);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 4);
            String mo12868m3 = mo12920b.mo12868m(descriptor2, 5);
            int mo12870i3 = mo12920b.mo12870i(descriptor2, 6);
            int mo12870i4 = mo12920b.mo12870i(descriptor2, 7);
            int mo12870i5 = mo12920b.mo12870i(descriptor2, 8);
            int mo12870i6 = mo12920b.mo12870i(descriptor2, 9);
            str = mo12868m;
            i = mo12920b.mo12870i(descriptor2, 10);
            i2 = mo12870i6;
            i4 = mo12870i4;
            i7 = mo12870i3;
            str2 = mo12868m3;
            f = mo12863u;
            i6 = mo12870i5;
            str3 = mo12868m2;
            i8 = mo12870i2;
            i5 = mo12870i;
            i3 = 2047;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z = true;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            float f2 = 0.0f;
            int i16 = 0;
            while (z) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i9 |= 1;
                        str4 = mo12920b.mo12868m(descriptor2, 0);
                        continue;
                    case 1:
                        i15 = mo12920b.mo12870i(descriptor2, 1);
                        i9 |= 2;
                        continue;
                    case 2:
                        i14 = mo12920b.mo12870i(descriptor2, 2);
                        i9 |= 4;
                        break;
                    case 3:
                        f2 = mo12920b.mo12863u(descriptor2, 3);
                        i9 |= 8;
                        break;
                    case 4:
                        str6 = mo12920b.mo12868m(descriptor2, 4);
                        i9 |= 16;
                        break;
                    case 5:
                        str5 = mo12920b.mo12868m(descriptor2, 5);
                        i9 |= 32;
                        break;
                    case 6:
                        i12 = mo12920b.mo12870i(descriptor2, 6);
                        i9 |= 64;
                        break;
                    case 7:
                        i11 = mo12920b.mo12870i(descriptor2, 7);
                        i9 |= 128;
                        break;
                    case 8:
                        i13 = mo12920b.mo12870i(descriptor2, 8);
                        i9 |= 256;
                        break;
                    case 9:
                        i10 = mo12920b.mo12870i(descriptor2, 9);
                        i9 |= 512;
                        break;
                    case 10:
                        i16 = mo12920b.mo12870i(descriptor2, 10);
                        i9 |= 1024;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            i = i16;
            i2 = i10;
            str = str4;
            i3 = i9;
            int i17 = i14;
            i4 = i11;
            i5 = i15;
            i6 = i13;
            str2 = str5;
            f = f2;
            str3 = str6;
            i7 = i12;
            i8 = i17;
        }
        mo12920b.mo12872c(descriptor2);
        return new UploadProgress(i3, str, i5, i8, f, str3, str2, i7, i4, i6, i2, i, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, UploadProgress value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        UploadProgress.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}