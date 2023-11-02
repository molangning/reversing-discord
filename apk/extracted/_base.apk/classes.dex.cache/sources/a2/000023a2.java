package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AnimatedNode {
    private static final int DEFAULT_ANIMATED_NODE_CHILD_COUNT = 1;
    public static final int INITIAL_BFS_COLOR = 0;
    List<AnimatedNode> mChildren;
    int mActiveIncomingNodes = 0;
    int mBFSColor = 0;
    int mTag = -1;

    public final void addChild(AnimatedNode animatedNode) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList(1);
        }
        ((List) C5743a.m24583c(this.mChildren)).add(animatedNode);
        animatedNode.onAttachedToNode(this);
    }

    public void onAttachedToNode(AnimatedNode animatedNode) {
    }

    public void onDetachedFromNode(AnimatedNode animatedNode) {
    }

    public abstract String prettyPrint();

    public String prettyPrintWithChildren() {
        String str;
        Iterator<AnimatedNode> it;
        List<AnimatedNode> list = this.mChildren;
        String str2 = "";
        if (list == null || list.size() <= 0) {
            str = "";
        } else {
            str = "";
            while (this.mChildren.iterator().hasNext()) {
                str = str + " " + it.next().mTag;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prettyPrint());
        if (str.length() > 0) {
            str2 = " children: " + str;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void removeChild(AnimatedNode animatedNode) {
        if (this.mChildren == null) {
            return;
        }
        animatedNode.onDetachedFromNode(this);
        this.mChildren.remove(animatedNode);
    }

    public void update() {
    }
}