// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketNotEnabledException extends ApiException {
    public static final Integer ERROR_CODE = 1438;

    public static final String ERROR_DESCRIPTION = "Market not enabled";

    public ApiMarketNotEnabledException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketNotEnabledException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}
