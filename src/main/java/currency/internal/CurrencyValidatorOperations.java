package currency.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.stereotype.Validator;
import org.mule.runtime.extension.api.exception.ModuleException;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class CurrencyValidatorOperations {

    @Validator
    @Throws(CurrencyErrorsProvider.class)
    public void isValidCurrencyCode(String currencyCode) throws Exception {
        Collection<CurrencyUnit> currencyUnits= Monetary.getCurrencies();
        Set<String> currencyCodes = new HashSet<String>();
        for (CurrencyUnit c : currencyUnits) {
            currencyCodes.add(c.getCurrencyCode());
        }

        if(!currencyCodes.contains(currencyCode)) {
            throw new ModuleException(CurrencyError.INVALID_CURRENCY_CODE, new IllegalArgumentException("Invalid currency : " + currencyCode));
        }
    }

}
