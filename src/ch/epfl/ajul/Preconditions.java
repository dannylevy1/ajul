package ch.epfl.ajul;

/**
 * Méthodes utilitaires pour vérifier des préconditions.
 */
public final class Preconditions {

    /**
     * Construit un objet {@code Preconditions}.
     * <p>
     * Cette classe étant uniquement composée de méthodes statiques, ce constructeur n'a pas vocation
     * à être utilisé, mais il est présent afin de satisfaire les vérifications de signatures.
     */
    public Preconditions() { }

    /**
     * Vérifie qu'une condition est vraie.
     *
     * @param shouldBeTrue la condition qui doit être vraie
     * @throws IllegalArgumentException si {@code shouldBeTrue} est faux
     */
    public static void checkArgument(boolean shouldBeTrue) {
        if (!shouldBeTrue) throw new IllegalArgumentException();
    }
}