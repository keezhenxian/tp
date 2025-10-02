package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's remark in the address book.
 *
 * <p>Guarantees: immutable. A remark may be an empty string to indicate "no remark".</p>
 */
public class Remark {

    /** The raw remark text (may be empty but never null). */
    public final String value;

    /**
     * Constructs a {@code Remark}.
     *
     * @param remark The remark text. Must not be null (may be empty).
     */
    public Remark(String remark) {
        requireNonNull(remark);
        this.value = remark;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof Remark // instanceof handles nulls
            && value.equals(((Remark) other).value));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
