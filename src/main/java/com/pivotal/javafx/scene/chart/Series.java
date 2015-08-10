/*
 * Copyright (c) 2014-2015 Pivotal Software, Inc.  All rights reserved.
 * 
 * Based on code by Oracle from javafx.scene.chart.XYChart.Series and modified
 * for multiple Y axes.
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

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.chart.Axis;

public interface Series<X, Y> {

  public abstract void setChart(MultiAxisChart<X, Y> value);

  public abstract MultiAxisChart<X, Y> getChart();

  public abstract ReadOnlyObjectProperty<MultiAxisChart<X, Y>> chartProperty();

  public abstract Axis<Y> getYAxis();
  
  // TODO change axis event
  public abstract void setYAxis(Axis<Y> value);

  public abstract ReadOnlyObjectProperty<Axis<Y>> yAxisProperty();

  public abstract void setLegendItem(LegendItem value);

  public abstract LegendItem getLegendItem();

  public abstract ReadOnlyObjectProperty<LegendItem> legendItemProperty();

  public abstract String getName();

  public abstract void setName(String value);

  public abstract StringProperty nameProperty();

  public abstract Node getNode();

  public abstract void setNode(Node value);

  public abstract ObjectProperty<Node> nodeProperty();

  public abstract ObservableList<Data<X, Y>> getData();

  public abstract void setData(ObservableList<Data<X, Y>> value);

  public abstract ObjectProperty<ObservableList<Data<X, Y>>> dataProperty();

  /**
   * Returns a string representation of this {@code Series} object.
   * 
   * @return a string representation of this {@code Series} object.
   */
  public abstract String toString();

//  public abstract void removeDataItemRef(Data<X, Y> item);

  public abstract int getItemIndex(Data<X, Y> item);

  public abstract int getDataSize();

  public abstract String getDefaultColorStyleClass();

  public abstract void setDefaultColorStyleClass(String defaultColorStyleClass);

//  public abstract Data<X, Y> getBegin();
//
//  public abstract void setBegin(Data<X, Y> begin);

  public abstract Series<X, Y> getNext();

  public abstract void setNext(Series<X, Y> next);

  public abstract Iterable<Data<X, Y>> getVisibleData();

//  public abstract Iterable<Data<X, Y>> getData(int from, int to, int limit);


}