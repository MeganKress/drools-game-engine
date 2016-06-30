/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workshop.model.impl.base;

import java.util.ArrayList;
import java.util.List;
import org.drools.workshop.model.api.Inventory;
import org.drools.workshop.model.api.Item;

public class InventoryImpl implements Inventory {

    private List<Item> items = new ArrayList<Item>();

    public InventoryImpl() {
    }

    public InventoryImpl( List<Item> items ) {
        this.items = items;
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public String getName() {
        return "Players Inventory";
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public void setOpen( boolean open ) {
        // the player's inventory is always open by default to browse
    }

}
