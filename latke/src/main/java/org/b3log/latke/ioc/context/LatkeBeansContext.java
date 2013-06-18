/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.ioc.context;


import javax.enterprise.context.spi.Contextual;


/**
 * Latke beans context.
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.1.1, Nov 27, 2009
 */
public interface LatkeBeansContext extends javax.enterprise.context.spi.Context {

    /**
     * Sets the active with the specified active.
     * 
     * @param active the specified active
     */
    void setActive(final boolean active);

    /**
     * Adds the specified bean and reference.
     * 
     * @param <T> the type of contextual 
     * @param bean the specified bean
     * @param reference the specified reference
     */
    <T> void add(final Contextual<T> bean, final T reference);
}
