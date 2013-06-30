/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daimor;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.api.lexer.Language;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author daimor
 */
class mLanguageHierarchy extends LanguageHierarchy<mTokenId> {

    private static List<mTokenId> tokens;
    private static Map<Integer, mTokenId> idToToken;
    private static final Language<mTokenId> language = new mLanguageHierarchy().language();

    /**
     * Initializes the list of tokens with IDs generated from the ANTLR token
     * file.
     */
    private static void init() {
        ANTLRTokenReader reader = new ANTLRTokenReader();
        tokens = reader.readTokenFile();
        idToToken = new HashMap<Integer, mTokenId>();
        for (mTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    public mLanguageHierarchy() {
    }

    /**
     * Returns an actual CMinusTokenId from an id. This essentially allows
     * the syntax highlighter to decide the color of specific words.
     * @param id
     * @return
     */
    static synchronized mTokenId getToken(int id) {
        if (idToToken == null) {
            init();
        }
        return idToToken.get(id);
    }
    
    @Override
    protected Collection<mTokenId> createTokenIds() {
        if (tokens == null) {
            init();
        }
        return tokens;
    }

    @Override
    protected Lexer<mTokenId> createLexer(LexerRestartInfo<mTokenId> info) {
        return new mEditorLexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-m";
    }

    public static Language<mTokenId> getLanguage() {
        return language;
    }
}
