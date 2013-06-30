/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daimor;

import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author daimor
 */
public class mTokenId implements TokenId {

    private final String name;
    private final String primaryCategory;
    private final int id;

    public mTokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int ordinal() {
        return id;
    }

    @Override
    public String primaryCategory() {
        return primaryCategory;
    }
}
