/*
 * Copyright (c) 2005, 2010, Oracle and/or its affiliates. All rights reserved.
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

package javax.xml.ws;

import java.lang.annotation.*;

/**
 * Used to annotate service specific exception classes to customize
 * to the local and namespace name of the fault element and the name
 * of the fault bean.
 *
 *  @since JAX-WS 2.0
**/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebFault {
  /**
   *  Element's local name.
  **/
  public String name() default "";

  /**
   *  Element's namespace name.
  **/
  public String targetNamespace() default "";

  /**
   *  Fault bean name.
  **/
  public String faultBean() default "";


  /**
   *  wsdl:Message's name. Default name is the exception's class name.
   *  @since JAX-WS 2.2
   */
  public String messageName() default "";

}
