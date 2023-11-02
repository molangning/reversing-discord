package net.time4j.p249tz;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: net.time4j.tz.SPX */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = -1000776907354520172L;

    /* renamed from: j */
    private transient Object f28198j;

    /* renamed from: k */
    private transient int f28199k;

    public SPX() {
    }

    /* renamed from: a */
    private Object m10181a(ObjectInput objectInput, byte b) {
        return new C10798a((InterfaceC10808k) objectInput.readObject(), (AbstractC10809l) objectInput.readObject());
    }

    /* renamed from: b */
    private Object m10180b(ObjectInput objectInput, byte b) {
        int i;
        int readInt = objectInput.readInt();
        if ((b & 15) == 1) {
            i = objectInput.readInt();
        } else {
            i = 0;
        }
        return C10835p.m10019r(readInt, i);
    }

    /* renamed from: c */
    private Object m10179c(byte b) {
        int i = b & 15;
        return C10832n.m10040d(EnumC10799b.values()[i / 2], EnumC10804g.values()[i % 2]);
    }

    /* renamed from: d */
    private Object m10178d(ObjectInput objectInput, byte b) {
        InterfaceC10808k interfaceC10808k = (InterfaceC10808k) objectInput.readObject();
        InterfaceC10815m interfaceC10815m = (InterfaceC10815m) objectInput.readObject();
        InterfaceC10834o interfaceC10834o = AbstractC10809l.f28231m;
        if ((b & 15) == 1) {
            interfaceC10834o = (InterfaceC10834o) objectInput.readObject();
        }
        return new C10800c(interfaceC10808k, interfaceC10815m, interfaceC10834o);
    }

    /* renamed from: e */
    private void m10177e(ObjectOutput objectOutput) {
        C10798a c10798a = (C10798a) this.f28198j;
        objectOutput.writeByte(192);
        objectOutput.writeObject(c10798a.mo10125z());
        objectOutput.writeObject(c10798a.m10173R());
    }

    /* renamed from: f */
    private void m10176f(ObjectOutput objectOutput) {
        boolean z;
        int i;
        C10835p c10835p = (C10835p) this.f28198j;
        if (c10835p.m10027i() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 241;
        } else {
            i = 240;
        }
        objectOutput.writeByte(i);
        objectOutput.writeInt(c10835p.m10026k());
        if (z) {
            objectOutput.writeInt(c10835p.m10027i());
        }
    }

    /* renamed from: g */
    private void m10175g(ObjectOutput objectOutput) {
        objectOutput.writeByte(((C10832n) this.f28198j).m10041c() | 208);
    }

    /* renamed from: h */
    private void m10174h(ObjectOutput objectOutput) {
        boolean z;
        int i;
        C10800c c10800c = (C10800c) this.f28198j;
        if (c10800c.mo10158E() != AbstractC10809l.f28231m) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 225;
        } else {
            i = 224;
        }
        objectOutput.writeByte(i);
        objectOutput.writeObject(c10800c.mo10125z());
        objectOutput.writeObject(c10800c.mo10126y());
        if (z) {
            objectOutput.writeObject(c10800c.mo10158E());
        }
    }

    private Object readResolve() {
        return this.f28198j;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 12:
                this.f28198j = m10181a(objectInput, readByte);
                return;
            case 13:
                this.f28198j = m10179c(readByte);
                return;
            case 14:
                this.f28198j = m10178d(objectInput, readByte);
                return;
            case 15:
                this.f28198j = m10180b(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f28199k) {
            case 12:
                m10177e(objectOutput);
                return;
            case 13:
                m10175g(objectOutput);
                return;
            case 14:
                m10174h(objectOutput);
                return;
            case 15:
                m10176f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i) {
        this.f28198j = obj;
        this.f28199k = i;
    }
}
