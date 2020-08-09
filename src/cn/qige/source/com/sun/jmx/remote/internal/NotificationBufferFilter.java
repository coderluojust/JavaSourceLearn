/*
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.jmx.remote.internal;

import javax.management.Notification;
import javax.management.ObjectName;
import javax.management.remote.TargetedNotification;
import java.util.List;

public interface NotificationBufferFilter {
    /**
     * Add the given notification coming from the given MBean to the list
     * iff it matches this filter's rules.
     */
    public void apply(List<TargetedNotification> targetedNotifs,
            ObjectName source, Notification notif);
}
