/*
 * Copyright 2019 Andy Turner, University of Leeds.
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
package uk.ac.leeds.ccg.v2d.geometry;

import ch.obermuhlner.math.big.BigRational;
import uk.ac.leeds.ccg.v2d.geometry.V2D_Point;
import java.io.IOException;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.leeds.ccg.generic.core.Generic_Environment;
import uk.ac.leeds.ccg.generic.io.Generic_Defaults;
import uk.ac.leeds.ccg.v2d.core.V2D_Environment;
import uk.ac.leeds.ccg.v2d.geometry.envelope.V2D_Envelope;

/**
 *
 * @author geoagdt
 */
public class Vector_Envelope2DTest {

    V2D_Environment env;
    
    public Vector_Envelope2DTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() {
        try {
            env = new V2D_Environment(new Generic_Environment(new Generic_Defaults()));
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    @AfterEach
    public void tearDown() {
    }

//    /**
//     * Test of getIntersectsFailFast method, of class V2D_Envelope.
//     */
//    @Test
//    public void testGetIntersects_Envelope2D() {
//        System.out.println("getIntersects");
//        boolean expResult;
//        boolean result;
//        BigRational ONE = BigRational.ONE;
//        BigRational TEN = BigRational.TEN;
//        V2D_Point a;
//        V2D_Point b = new V2D_Point(ONE, ONE);
//        V2D_Envelope be = b.getEnvelope();
//        V2D_Envelope abe;
//        BigRational aX = ONE;
//        BigRational aY = ONE;
//        for (int i = 0; i < 1000; i++) {
//            aX = aX.divide(TEN);
//            aY = aY.divide(TEN);
//            a = new V2D_Point(aX, aY);
//            System.out.println("a " + a.toString());
//            abe = new V2D_Envelope(
//                    a,
//                    b);
//            expResult = true;
//            result = abe.getIntersects(a.getEnvelope());
//            System.out.println("abe.getIntersects(a.getEnvelope2D()) " + result);
//            Assertions.assertEquals(expResult, result);
//            result = abe.getIntersects(be);
//            Assertions.assertEquals(expResult, result);
//        }
//    }
}
