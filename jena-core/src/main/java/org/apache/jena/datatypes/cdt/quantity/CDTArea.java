/*
 * Copyright 2018 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jena.datatypes.cdt.quantity;

import javax.measure.quantity.Area;

/**
 *
 * @author maxime.lefrancois
 */
public class CDTArea extends QuantityDatatype<Area> {

    public static final String theTypeURI = CDT + "area";
    public static final CDTArea theType = new CDTArea();

    /**
     * private constructor - single global instance
     */
    private CDTArea() {
        super(theTypeURI, Area.class);
    }

}