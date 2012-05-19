/*
 * Copyright (c) 1996-2012 Digi International Inc.,
 * All rights not expressly granted are reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 * 
 * Digi International Inc. 11001 Bren Road East, Minnetonka, MN 55343
 * =======================================================================
 */

package com.digi.garagedoor.idigi.xml_classes;

import java.util.ArrayList;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "do_command", strict = false)
public class DoCommand {
    private static final long serialVersionUID = 7526472295622776107L;

    @Attribute
    public String target;

    @ElementList(inline = true, required = false)
    private ArrayList<AtResponse> list;

    public ArrayList<AtResponse> getList() {
        if (this.list == null)
            this.list = new ArrayList<AtResponse>(0);

        return this.list;
    }
}
