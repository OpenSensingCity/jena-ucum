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

import javax.measure.quantity.LuminousFlux;

/**
 *
 * @author maxime.lefrancois
 */
public class CDTLuminousFlux extends QuantityDatatype<LuminousFlux> {

    public static final String theTypeURI = CDT + "luminousFlux";
    public static final CDTLuminousFlux theType = new CDTLuminousFlux();

    /**
     * private constructor - single global instance
     */
    private CDTLuminousFlux() {
        super(theTypeURI, LuminousFlux.class);
    }

}