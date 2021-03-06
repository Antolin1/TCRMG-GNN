/**
 *
 * $Id$
 */
package yakinduSimplified.validation;

import yakinduSimplified.Vertex;

/**
 * A sample validator interface for {@link yakinduSimplified.Transition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TransitionValidator {
	boolean validate();

	boolean validateTarget(Vertex value);

	boolean validateSource(Vertex value);
}
