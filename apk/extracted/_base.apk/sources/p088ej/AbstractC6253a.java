package p088ej;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H¦\u0002\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m14357d2 = {"Lej/a;", "", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "<init>", "()V", "b", "Lej/a$a;", "Lej/a$b;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ej.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC6253a {

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m14357d2 = {"Lej/a$a;", "Lej/a;", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "", "other", "", "equals", "", "hashCode", "Lkotlinx/serialization/KSerializer;", "b", "()Lkotlinx/serialization/KSerializer;", "serializer", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: ej.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6254a extends AbstractC6253a {

        /* renamed from: a */
        private final KSerializer<?> f17699a;

        @Override // p088ej.AbstractC6253a
        /* renamed from: a */
        public KSerializer<?> mo23147a(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            C9612q.m13917h(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f17699a;
        }

        /* renamed from: b */
        public final KSerializer<?> m23148b() {
            return this.f17699a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C6254a) && C9612q.m13922c(((C6254a) obj).f17699a, this.f17699a);
        }

        public int hashCode() {
            return this.f17699a.hashCode();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0096\u0002R1\u0010\n\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m14357d2 = {"Lej/a$b;", "Lej/a;", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "provider", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: ej.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6255b extends AbstractC6253a {

        /* renamed from: a */
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> f17700a;

        @Override // p088ej.AbstractC6253a
        /* renamed from: a */
        public KSerializer<?> mo23147a(List<? extends KSerializer<?>> typeArgumentsSerializers) {
            C9612q.m13917h(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f17700a.invoke(typeArgumentsSerializers);
        }

        /* renamed from: b */
        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> m23146b() {
            return this.f17700a;
        }
    }

    private AbstractC6253a() {
    }

    /* renamed from: a */
    public abstract KSerializer<?> mo23147a(List<? extends KSerializer<?>> list);
}
