// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.exceptions;

import com.vk.api.sdk.objects.base.Error;

public class ApiMarketNameTooLongException extends ApiException {
    public static final Integer ERROR_CODE = 1421;

    public static final String ERROR_DESCRIPTION = "Name too long";

    public ApiMarketNameTooLongException(Error error) {
        super(error.setErrorText(ERROR_DESCRIPTION));
    }

    public ApiMarketNameTooLongException() {
        super(new Error().setErrorCode(ERROR_CODE).setErrorText(ERROR_DESCRIPTION));
    }
}