/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daimor;

import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageProvider;

/**
 *
 * @author daimor
 */
@org.openide.util.lookup.ServiceProvider(service = org.netbeans.spi.lexer.LanguageProvider.class)
public class mLanguageProvider extends LanguageProvider {

    @Override
    public Language<?> findLanguage(String mimeType) {
        System.out.println("findLang: " + mimeType);
        if ("text/x-m".equals(mimeType)) {
            return new mLanguageHierarchy().language();
        }

        return null;
    }

    @Override
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath languagePath, InputAttributes inputAttributes) {
        return null;
    }
}
