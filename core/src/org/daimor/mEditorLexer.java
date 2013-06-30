/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daimor;

import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author daimor
 */
class mEditorLexer implements Lexer<mTokenId> {

    private LexerRestartInfo<mTokenId> info;
    private mLexer lexer;

    public mEditorLexer(LexerRestartInfo<mTokenId> info) {
        this.info = info;
        ANTLRCharStream charStream = new ANTLRCharStream(info.input(), "mEditor", true);
        lexer = new mLexer(charStream);
    }

    @Override
    public Token<mTokenId> nextToken() {
        org.antlr.v4.runtime.Token token = lexer.nextToken();

        Token<mTokenId> createdToken = null;

        if (token.getType() != -1) {
            mTokenId tokenId = mLanguageHierarchy.getToken(token.getType());
            createdToken = info.tokenFactory().createToken(tokenId);
        } else if (info.input().readLength() > 0) {
            mTokenId tokenId = mLanguageHierarchy.getToken(mLexer.WS);
            createdToken = info.tokenFactory().createToken(tokenId);
        }

        return createdToken;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }
}
