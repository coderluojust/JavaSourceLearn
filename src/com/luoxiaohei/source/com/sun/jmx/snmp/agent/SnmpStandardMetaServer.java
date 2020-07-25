/*
 * Copyright (c) 2000, 2003, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.jmx.snmp.agent;

// jmx imports
//

import com.sun.jmx.snmp.SnmpStatusException;
import com.sun.jmx.snmp.SnmpValue;

/**
 * <p>
 * This interface defines the methods that must be implemented by an
 * SNMP metadata object that needs to interact with an
 * {@link com.sun.jmx.snmp.agent.SnmpStandardObjectServer} object.
 * </p>
 * <p>
 * All these methods are usually generated by <code>mibgen</code> when
 * run in standard-metadata mode (default).
 * </p>
 * <p><b><i>
 * This interface is used internally between the generated Metadata and
 * the SNMP runtime and you shouldn't need to worry about it, because
 * you will never have to use it directly.
 * </b></i></p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 **/
public interface SnmpStandardMetaServer {
    /**
     * Returns the value of the scalar object identified by the given
     * OID arc.
     *
     * @param arc OID arc of the querried scalar object.
     *
     * @return The <CODE>SnmpValue</CODE> of the scalar object identified
     *         by <CODE>arc</CODE>.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception SnmpStatusException If the arc is not valid, or if
     *    access is denied.
     *
     **/
    public SnmpValue get(long arc, Object userData)
        throws SnmpStatusException ;

    /**
     * Sets the value of the scalar object identified by the given
     * OID arc.
     *
     * @param x New value for the scalar object identified by
     *    <CODE>arc</CODE>
     *
     * @param arc OID arc of the scalar object whose value is set.
     *
     * @return The new <CODE>SnmpValue</CODE> of the scalar object
     *    identified by <CODE>arc</CODE>.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception SnmpStatusException If the arc is not valid, or if
     *    access is denied.
     *
     **/
    public SnmpValue set(SnmpValue x, long arc, Object userData)
        throws SnmpStatusException ;

    /**
     * Checks that the new desired value of the scalar object identified
     * by the given OID arc is valid.
     *
     * @param x New value for the scalar object identified by
     *    <CODE>arc</CODE>
     *
     * @param arc OID arc of the scalar object whose value is set.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception SnmpStatusException If the arc is not valid, or if
     *    access is denied, or if the new desired value is not valid.
     *
     **/
    public void check(SnmpValue x, long arc, Object userData)
        throws SnmpStatusException ;

}
