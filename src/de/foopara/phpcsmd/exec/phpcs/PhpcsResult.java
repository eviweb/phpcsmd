/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.foopara.phpcsmd.exec.phpcs;

import de.foopara.phpcsmd.generics.GenericResult;
import de.foopara.phpcsmd.generics.GenericViolation;
import java.util.List;

/**
 *
 * @author nspecht
 */
public class PhpcsResult extends GenericResult {
            
    public PhpcsResult(List<GenericViolation> warnings, List<GenericViolation> errors) {
        super(warnings,errors);
    }
    
    
}