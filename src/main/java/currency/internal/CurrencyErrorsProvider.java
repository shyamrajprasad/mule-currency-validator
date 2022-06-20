package currency.internal;

import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.HashSet;
import java.util.Set;

public class CurrencyErrorsProvider implements ErrorTypeProvider {

    @Override
    public Set<ErrorTypeDefinition> getErrorTypes() {
        HashSet<ErrorTypeDefinition> errors = new HashSet<>();
        errors.add(CurrencyError.INVALID_CURRENCY_CODE);
        return errors;
    }
}
