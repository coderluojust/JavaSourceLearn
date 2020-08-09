/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.impl.oa ;

import com.sun.corba.se.spi.oa.NullServant;
import org.omg.CORBA.SystemException;

public class NullServantImpl implements NullServant
{
    private SystemException sysex ;

    public NullServantImpl( SystemException ex )
    {
        this.sysex = ex ;
    }

    public SystemException getException()
    {
        return sysex ;
    }
}
