/*
 * Copyright (c) 2002, 2003, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.spi.protocol ;

import com.sun.corba.se.impl.protocol.*;
import com.sun.corba.se.pept.protocol.ClientRequestDispatcher;
import com.sun.corba.se.spi.ior.IOR;
import com.sun.corba.se.spi.orb.ORB;

// Used only in the implementation: no client of this class ever needs these

public final class RequestDispatcherDefault {
    private RequestDispatcherDefault() {}

    public static ClientRequestDispatcher makeClientRequestDispatcher()
    {
        return new CorbaClientRequestDispatcherImpl() ;
    }

    public static CorbaServerRequestDispatcher makeServerRequestDispatcher( ORB orb )
    {
        return new CorbaServerRequestDispatcherImpl( (com.sun.corba.se.spi.orb.ORB)orb ) ;
    }

    public static CorbaServerRequestDispatcher makeBootstrapServerRequestDispatcher( ORB orb )
    {
        return new BootstrapServerRequestDispatcher( orb ) ;
    }

    public static CorbaServerRequestDispatcher makeINSServerRequestDispatcher( ORB orb )
    {
        return new INSServerRequestDispatcher( orb ) ;
    }

    public static LocalClientRequestDispatcherFactory makeMinimalServantCacheLocalClientRequestDispatcherFactory( final ORB orb )
    {
        return new LocalClientRequestDispatcherFactory() {
            public LocalClientRequestDispatcher create( int id, IOR ior ) {
                return new MinimalServantCacheLocalCRDImpl( orb, id, ior ) ;
            }
        } ;
    }

    public static LocalClientRequestDispatcherFactory makeInfoOnlyServantCacheLocalClientRequestDispatcherFactory( final ORB orb )
    {
        return new LocalClientRequestDispatcherFactory() {
            public LocalClientRequestDispatcher create( int id, IOR ior ) {
                return new InfoOnlyServantCacheLocalCRDImpl( orb, id, ior ) ;
            }
        } ;
    }

    public static LocalClientRequestDispatcherFactory makeFullServantCacheLocalClientRequestDispatcherFactory( final ORB orb )
    {
        return new LocalClientRequestDispatcherFactory() {
            public LocalClientRequestDispatcher create( int id, IOR ior ) {
                return new FullServantCacheLocalCRDImpl( orb, id, ior ) ;
            }
        } ;
    }

    public static LocalClientRequestDispatcherFactory makeJIDLLocalClientRequestDispatcherFactory( final ORB orb )
    {
        return new LocalClientRequestDispatcherFactory() {
            public LocalClientRequestDispatcher create( int id, IOR ior ) {
                return new JIDLLocalCRDImpl( orb, id, ior ) ;
            }
        } ;
    }

    public static LocalClientRequestDispatcherFactory makePOALocalClientRequestDispatcherFactory( final ORB orb )
    {
        return new LocalClientRequestDispatcherFactory() {
            public LocalClientRequestDispatcher create( int id, IOR ior ) {
                return new POALocalCRDImpl( orb, id, ior ) ;
            }
        } ;
    }
}
