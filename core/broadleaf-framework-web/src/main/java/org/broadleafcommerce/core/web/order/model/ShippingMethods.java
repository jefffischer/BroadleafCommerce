/*
 * Copyright 2008-2009 the original author or authors.
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

package org.broadleafcommerce.core.web.order.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.list.LazyList;
import org.broadleafcommerce.core.order.domain.FulfillmentGroup;
import org.broadleafcommerce.core.order.domain.FulfillmentGroupImpl;

public class ShippingMethods {

    @SuppressWarnings("unchecked")
    private List<FulfillmentGroup> rows =  LazyList.decorate(
            new ArrayList<FulfillmentGroup>(),
            FactoryUtils.instantiateFactory(FulfillmentGroupImpl.class));

    public List<FulfillmentGroup> getRows() {
        return rows;
    }

    public void setRows(List<FulfillmentGroup> rows) {
        this.rows = rows;
    }

}
