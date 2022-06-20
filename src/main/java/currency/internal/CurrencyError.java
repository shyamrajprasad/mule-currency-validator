package currency.internal;

import java.util.Optional;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;
import org.mule.runtime.extension.api.error.MuleErrors;

public enum CurrencyError implements ErrorTypeDefinition<CurrencyError> {
    INVALID_CURRENCY_CODE(MuleErrors.VALIDATION);

    private ErrorTypeDefinition<? extends Enum<?>> parent;

    CurrencyError(ErrorTypeDefinition<? extends Enum<?>> parent) {
        this.parent = parent;
    }

    @Override
    public Optional<ErrorTypeDefinition<? extends Enum<?>>> getParent() {
        return Optional.ofNullable(parent);
    }
}
