/* Copyright (c) 2013 OpenPlans. All rights reserved.
 * This code is licensed under the BSD New License, available at the root
 * application directory.
 */

package org.geogit.web;

import org.geogit.web.api.ParameterSet;
import org.restlet.data.Form;

/**
 *
 */
public class FormParams implements ParameterSet {

    private Form form;

    public FormParams(Form form) {
        this.form = form;
    }

    @Override
    public String getFirstValue(String key) {
        return form.getFirstValue(key);
    }

    @Override
    public String[] getValuesArray(String key) {
        return form.getValuesArray(key);
    }

    @Override
    public String getFirstValue(String key, String defaultValue) {
        return form.getFirstValue(key, defaultValue);
    }

}
