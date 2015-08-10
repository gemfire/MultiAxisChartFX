/*
 * Copyright (c) 2014-2015 Pivotal Software, Inc.  All rights reserved.
 * 
 * Based on code by Oracle from com.sun.javafx.charts.Legend.LegendItem.
 * 
 * Licensed under the GNU General Public License version 2.0 subject to the
 * "Classpath" exception as provided by Pivotal in the LICENSE file that
 * accompanied this code.
 */
/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.pivotal.javafx.scene.chart;

import java.lang.reflect.Field;

import javafx.scene.Node;
import javafx.scene.control.Label;

import com.sun.javafx.charts.Legend;

/**
 * Extends {@link Legend.LegendItem} to expose label field as property.
 * 
 * @author jbarrett
 *
 */
@SuppressWarnings("restriction")
public class LegendItem extends Legend.LegendItem {

  static final Field labelField;
  static {
    Field field = null;
    try {
      field = Legend.LegendItem.class.getDeclaredField("label");
      field.setAccessible(true);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
    labelField = field;
  }

  public LegendItem(String text) {
    super(text);

  }

  public LegendItem(String text, Node symbol) {
    super(text, symbol);
  }

  public Label getLabel() {
    try {
      return (Label) labelField.get(this);
    } catch (IllegalArgumentException | IllegalAccessException e) {
      throw new IllegalStateException(e);
    }
  }

}