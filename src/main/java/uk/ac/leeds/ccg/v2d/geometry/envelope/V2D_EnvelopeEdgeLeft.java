/*
 * Copyright 2020 Andy Turner, University of Leeds.
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
package uk.ac.leeds.ccg.v2d.geometry.envelope;

import uk.ac.leeds.ccg.v2d.geometry.V2D_Point;

/**
 * For the left edge of an envelope. For the two points that define the line
 * segment, {@link #p} is the top-left point (tl) and {@link q} is the
 * bottom-left (bl). {@code tl.y} should equal {@code bl.y}. No checking of these conditions is done for efficiency
 * reasons.
 *
 * @author Andy Turner
 * @version 1.0
 */
public class V2D_EnvelopeEdgeLeft extends V2D_EnvelopeEdge {

    /**
     * @param tl The point in the top-left of an envelope.
     * @param bl The point in the bottom-left of an envelope.
     */
    public V2D_EnvelopeEdgeLeft(V2D_Point tl, V2D_Point bl) {
        super(tl, bl);
    }

    public V2D_Point getTl() {
        return p;
    }

    public V2D_Point getBl() {
        return q;
    }

}
