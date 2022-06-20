package currency.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "currency-validator")
@Extension(name = "Currency Validator")
@ErrorTypes(CurrencyError.class)
@Operations(CurrencyValidatorOperations.class)
public class CurrencyValidatorExtension {

}


